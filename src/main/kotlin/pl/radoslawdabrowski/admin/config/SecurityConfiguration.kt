package pl.radoslawdabrowski.admin.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService
import pl.radoslawdabrowski.admin.utils.const.Paths
import pl.radoslawdabrowski.admin.utils.const.Resource

@EnableWebSecurity
@Configuration
class SecurityConfiguration : WebSecurityConfigurerAdapter() {

    @Autowired
    private lateinit var userDetailsService: UserDetailsService

    override fun configure(http : HttpSecurity) {
        http.authorizeRequests()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin()
                .loginPage(Paths.LOGIN)
                .failureUrl(Paths.LOGIN)
                .successForwardUrl(Paths.DASHBOARD)
                .permitAll()
                .and()
                .logout()
                .logoutUrl(Paths.LOGOUT)
                .logoutSuccessUrl(Paths.LOGIN)
                .permitAll()
    }

    override fun configure(web: WebSecurity) {
        web.ignoring().antMatchers(Resource.RESOURCES, Resource.CSS, Resource.JS, Resource.IMAGES)
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(userDetailsService)
    }

}
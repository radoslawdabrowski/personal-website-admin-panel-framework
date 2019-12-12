package pl.radoslawdabrowski.admin.modules.root.services.impl

import org.springframework.context.annotation.Primary
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.services.UserService

@Service
@Primary
class AdminUserDetailsServiceImpl : UserDetailsService {

    private lateinit var userService: UserService

    override fun loadUserByUsername(username: String?): UserDetails {
        return userService.getUser(username!!)
    }

}
package pl.radoslawdabrowski.admin.modules.root.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.math.BigDecimal
import java.util.stream.Collectors

@Document(collection = "users")
data class User(
        @Id val id : BigDecimal,
        val login : String,
        val passwd : String,
        val displayName : String,
        val email : String,
        val active : Boolean,
        val locked : Boolean,
        val expired : Boolean,
        val roles : Set<Role>
) : UserDetails {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return roles.stream().map { SimpleGrantedAuthority(it.name) }.collect(Collectors.toList())
    }

    override fun isEnabled(): Boolean {
        return active
    }

    override fun getUsername(): String {
        return login
    }

    override fun isCredentialsNonExpired(): Boolean {
        return !expired
    }

    override fun getPassword(): String {
        return passwd
    }

    override fun isAccountNonExpired(): Boolean {
        return !expired
    }

    override fun isAccountNonLocked(): Boolean {
        return locked
    }
}
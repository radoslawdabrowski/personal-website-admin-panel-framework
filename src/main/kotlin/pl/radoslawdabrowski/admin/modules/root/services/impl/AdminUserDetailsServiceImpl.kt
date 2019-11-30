package pl.radoslawdabrowski.admin.modules.root.services.impl

import lombok.RequiredArgsConstructor
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.services.UserService

@Service
@RequiredArgsConstructor
class AdminUserDetailsServiceImpl : UserDetailsService {

    private lateinit var userService: UserService

    override fun loadUserByUsername(username: String?): UserDetails {
        return userService.getUser(username!!)
    }

}
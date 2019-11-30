package pl.radoslawdabrowski.admin.modules.root.services.impl

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.model.User
import pl.radoslawdabrowski.admin.modules.root.repositories.UserRepository
import pl.radoslawdabrowski.admin.modules.root.services.UserService

@Slf4j
@Service
class UserServiceImpl : UserService {

    override fun getUser(username: String): User {
        return userRepository.findByLogin(username)!!
    }

    private lateinit var userRepository: UserRepository

}
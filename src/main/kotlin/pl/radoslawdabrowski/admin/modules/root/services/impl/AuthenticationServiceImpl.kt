package pl.radoslawdabrowski.admin.modules.root.services.impl

import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.services.AuthenticationService

@Service
class AuthenticationServiceImpl : AuthenticationService {
    override fun renderLoginView(): Collection<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resetPassword(login: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changePasswordOnReset(token: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun login(login: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
package pl.radoslawdabrowski.admin.modules.root.services.impl

import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.services.AuthenticationService
import java.util.*

@Service
class AuthenticationServiceImpl : AuthenticationService {
    override fun renderLoginView(): Collection<*> {
        return Collections.EMPTY_SET
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
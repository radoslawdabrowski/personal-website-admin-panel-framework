package pl.radoslawdabrowski.admin.modules.root.controllers

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import pl.radoslawdabrowski.admin.modules.root.services.AuthenticationService
import pl.radoslawdabrowski.admin.utils.const.Paths
import pl.radoslawdabrowski.admin.utils.const.Views

@Controller
class AuthenticationController {

    val logger = LoggerFactory.getLogger(IndexController::class.java)!!

    @Autowired
    private lateinit var authenticationService: AuthenticationService

    @RequestMapping(value = [Paths.LOGIN], method = [RequestMethod.GET])
    fun login(model : Model) : String {
        logger.debug("Rendering Login page")
        model.addAllAttributes(authenticationService.renderLoginView())
        return Views.LOGIN.html
    }

    @RequestMapping(value = [Paths.LOGOUT], method = [RequestMethod.GET])
    fun logout(model: Model) : String {
        logger.debug("Rendering Login page")

        //todo do logout
        return Views.LOGIN.html
    }

    @RequestMapping(value = [Paths.PASSWORD_RESET], method = [RequestMethod.GET])
    fun passwordReset(model: Model) : String {
        logger.debug("Rendering password change page")
        return Views.PASSWORD.RESET.html
    }

    @RequestMapping(value = [Paths.PASSWORD_CHANGE], method = [RequestMethod.GET])
    fun passwordChange(@PathVariable token : String, model: Model) : String {
        logger.debug("Rendering password reset page")
        model.addAttribute("token", token)
        return Views.PASSWORD.CHANGE.html
    }

}
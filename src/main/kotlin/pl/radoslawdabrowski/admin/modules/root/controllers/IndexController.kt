package pl.radoslawdabrowski.admin.modules.root.controllers

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import pl.radoslawdabrowski.admin.modules.root.services.DashboardService
import pl.radoslawdabrowski.admin.utils.const.Paths
import pl.radoslawdabrowski.admin.utils.const.Views

@Controller
class IndexController {

    val logger = LoggerFactory.getLogger(IndexController::class.java)!!

    @Autowired
    private lateinit var service: DashboardService

    @RequestMapping(value = [Paths.DASHBOARD], method = [RequestMethod.GET])
    fun index(model : Model) : String {
        logger.debug("Rendering index page")

        model.addAllAttributes(service.getInfo())
        return Views.INDEX.html
    }

}


package pl.radoslawdabrowski.admin.modules.root.services.impl

import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.services.DashboardService

@Service
class DashboardServiceImpl : DashboardService{

    override fun getInfo(): Map<String, Any> {

        return hashMapOf(Pair("test","wartosc"), Pair("test2", "wartosc2"))

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
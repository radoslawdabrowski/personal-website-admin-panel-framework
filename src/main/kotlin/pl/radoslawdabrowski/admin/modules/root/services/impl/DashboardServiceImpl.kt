package pl.radoslawdabrowski.admin.modules.root.services.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import pl.radoslawdabrowski.admin.modules.root.repositories.CompanyRepository
import pl.radoslawdabrowski.admin.modules.root.services.DashboardService

@Service
class DashboardServiceImpl : DashboardService{

    @Autowired
    private lateinit var companyRepository: CompanyRepository


    override fun getInfo(): Map<String, Any> {

        companyRepository.findAll().forEach {
            println("The elem: ${it.name}")
        }

        return hashMapOf("test" to "wartosc", "test2" to "wartosc2")

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
package pl.radoslawdabrowski.admin.modules.root.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import pl.radoslawdabrowski.admin.modules.root.model.Company
import java.math.BigInteger

interface CompanyRepository : MongoRepository<Company, BigInteger> {

    fun findByName(name: String) : Company

}
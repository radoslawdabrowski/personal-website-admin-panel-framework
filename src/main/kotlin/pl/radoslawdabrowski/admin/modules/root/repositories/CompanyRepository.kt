package pl.radoslawdabrowski.admin.modules.root.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import pl.radoslawdabrowski.admin.modules.root.model.Company
import java.math.BigInteger

@Repository
interface CompanyRepository : MongoRepository<Company, BigInteger> {

    fun findByName(name: String) : Company

}
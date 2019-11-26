package pl.radoslawdabrowski.admin.modules.root.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import pl.radoslawdabrowski.admin.modules.root.model.User
import java.math.BigDecimal

@Repository
interface UserRepository : MongoRepository<User, BigDecimal> {

    fun findByLogin(login : String) : User?

}
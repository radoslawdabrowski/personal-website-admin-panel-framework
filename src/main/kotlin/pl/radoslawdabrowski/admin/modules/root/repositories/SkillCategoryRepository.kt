package pl.radoslawdabrowski.admin.modules.root.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import pl.radoslawdabrowski.admin.modules.root.model.SkillCategory
import java.math.BigInteger

@Repository
interface SkillCategoryRepository : MongoRepository<SkillCategory, BigInteger> {
}
package pl.radoslawdabrowski.admin.modules.root.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import pl.radoslawdabrowski.admin.modules.root.model.SkillCategory
import java.math.BigInteger

interface SkillCategoryRepository : MongoRepository<SkillCategory, BigInteger> {
}
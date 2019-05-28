package pl.radoslawdabrowski.admin.modules.root.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigInteger

@Document(collection = "root_skillcategory")
data class SkillCategory(val name: String, @Id val id: BigInteger)
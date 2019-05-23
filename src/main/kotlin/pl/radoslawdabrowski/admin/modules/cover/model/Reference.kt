package pl.radoslawdabrowski.admin.modules.cover.model

import org.springframework.data.mongodb.core.mapping.DBRef
import pl.radoslawdabrowski.admin.modules.root.model.Company

data class Reference (val who: String, val position: String, @DBRef val company: Company, val description: String, val rating: Int)
package pl.radoslawdabrowski.admin.modules.cv.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import pl.radoslawdabrowski.admin.modules.root.model.Company
import java.util.*

data class Job (val position: String, @DBRef val company: Company, val start_date: Date, val end_date: Date, val description: String, @Id val id: Long)

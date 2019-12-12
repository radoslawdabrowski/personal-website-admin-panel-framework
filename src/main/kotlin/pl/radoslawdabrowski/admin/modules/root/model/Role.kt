package pl.radoslawdabrowski.admin.modules.root.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document(collection = "roles")
data class Role(@Id val id : BigDecimal, val user: User, val name : String,
                val c : Boolean,
                val r : Boolean,
                val u : Boolean,
                val d : Boolean)
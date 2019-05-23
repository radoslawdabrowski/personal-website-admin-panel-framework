package pl.radoslawdabrowski.admin.modules.contact.model

import org.springframework.data.annotation.Id

data class Contact (val name: String, val email: String, val message: String, @Id val id: Long)
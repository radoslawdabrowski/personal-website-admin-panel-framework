package pl.radoslawdabrowski.admin.modules.cv.model

import org.springframework.data.annotation.Id

data class Hobby (val name: String, val icon: String, @Id val id: Long)

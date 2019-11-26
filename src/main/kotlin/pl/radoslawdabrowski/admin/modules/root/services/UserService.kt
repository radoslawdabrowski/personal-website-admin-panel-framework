package pl.radoslawdabrowski.admin.modules.root.services

import pl.radoslawdabrowski.admin.modules.root.model.User

interface UserService {

    fun getUser(username : String) : User

}
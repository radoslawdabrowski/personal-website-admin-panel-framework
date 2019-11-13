package pl.radoslawdabrowski.admin.modules.root.services

interface AuthenticationService {

    fun login(login : String, password : String)
    fun resetPassword(login : String)
    fun changePasswordOnReset(token : String)

}
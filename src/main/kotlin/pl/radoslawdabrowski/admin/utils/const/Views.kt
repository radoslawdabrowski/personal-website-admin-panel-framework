package pl.radoslawdabrowski.admin.utils.const

enum class Views(val html: String) {

    INDEX("index"),
    LOGIN("login"),
    BLOG("pages/blog/index"),
    EDUCATION("pages/education/index"),
    PASSWORD_CHANGE("pages/password/change"),
    PASSWORD_RESET( "pages/password/reset");

}
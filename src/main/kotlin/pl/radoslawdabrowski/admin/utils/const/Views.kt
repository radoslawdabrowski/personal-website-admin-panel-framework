package pl.radoslawdabrowski.admin.utils.const

enum class Views(val html: String) {

    INDEX("index"),
    LOGIN("login");

    enum class PASSWORD(val html: String) {
        CHANGE("pages/password/change"),
        RESET("pages/password/reset")
    }

    enum class BLOG(val html: String) {
        INDEX("pages/blog/index")
    }

    enum class EDUCATION(val html: String) {
        INDEX("pages/blog/index")
    }

}
package pl.radoslawdabrowski.admin.utils.const

class Resource {

    companion object {
        const val CSS = "/css/**"
        const val JS = "/js/**"
        const val RESOURCES = "/webjars/**"
        const val IMAGES = "/images/**"
        const val PASSWORD = Paths.PASSWORD + "/**"

        val SWAGGER = arrayOf(
                "/v2/api-docs",
                "/swagger-resources/**",
                "/configuration/security",
                "/configuration/ui",
                "/swagger-ui.html"
        )
    }
}
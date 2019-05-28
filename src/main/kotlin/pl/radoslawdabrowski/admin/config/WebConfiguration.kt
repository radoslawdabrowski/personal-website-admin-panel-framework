package pl.radoslawdabrowski.admin.config

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class WebConfiguration : WebMvcConfigurer {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        super.addResourceHandlers(registry)

        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/")
    }

}
package com.laptop.laptop_sales_management.Thymeleaf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import org.thymeleaf.spring6.SpringTemplateEngine


@Configuration
open class ThymeleafConfig{
    @Bean
    open fun templateEngine(templateResolver: TemplateResolver?): SpringTemplateEngine {
        val templateEngine = SpringTemplateEngine()
        templateEngine.setTemplateResolver(templateResolver)
        return templateEngine
    }

    @Bean
    open fun templateResolver(): TemplateResolver {
        val templateResolver = TemplateResolver()
        templateResolver.setPrefix("classpath:/templates/")
        templateResolver.setSuffix(".html")
        return templateResolver
    }
}


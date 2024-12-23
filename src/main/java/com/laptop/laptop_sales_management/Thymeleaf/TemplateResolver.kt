package com.laptop.laptop_sales_management.Thymeleaf

import org.thymeleaf.IEngineConfiguration
import org.thymeleaf.templateresolver.ITemplateResolver
import org.thymeleaf.templateresolver.TemplateResolution

class TemplateResolver : ITemplateResolver {
    fun setPrefix(s: String) {

    }

    fun setSuffix(s: String) {

    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getOrder(): Int {
        TODO("Not yet implemented")
    }

    override fun resolveTemplate(configuration: IEngineConfiguration?, ownerTemplate: String?, template: String?, templateResolutionAttributes: MutableMap<String, Any>?): TemplateResolution {
        TODO("Not yet implemented")
    }

}

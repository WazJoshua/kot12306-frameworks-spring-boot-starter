package com.josh.kot12306.framework.starter.base.config

import com.josh.kot12306.framework.starter.base.ApplicationContextHolder
import com.josh.kot12306.framework.starter.base.init.ApplicationContentPostProcessor
import com.josh.kot12306.framework.starter.base.safe.FastJsonSafeMode
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

/**
@author :Joshua
@date :2023/12/8 18:15:42
@description :应用基础自动装配
 */
open class ApplicationBaseAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    open fun congoApplicationContextHolder() = ApplicationContextHolder

    @Bean
    @ConditionalOnMissingBean
    open fun congoApplicationContentPostProcessor(applicationContext: ApplicationContext): ApplicationContentPostProcessor =
        ApplicationContentPostProcessor(applicationContext)

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = ["framework.fastjson.safe-mode"], havingValue = "true")
    open fun congoFastJsonSafeMode() = FastJsonSafeMode()

}
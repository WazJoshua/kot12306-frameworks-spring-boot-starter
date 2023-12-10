package com.josh.kot12306.framework.starter.base

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

/**
@author :Joshua
@date :2023/12/8 17:00:05
@description :Application context holder.
 */
object ApplicationContextHolder : ApplicationContextAware {

    private lateinit var CONTEXT: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        CONTEXT = applicationContext
    }

    /**
     * Get ioc container bean by type.
     */
    fun <T> getBean(clazz: Class<T>): T = CONTEXT.getBean(clazz)

    /**
     * Get ioc container bean by name.
     */
    fun getBean(name: String): Any = CONTEXT.getBean(name)

    /**
     * Get ioc container bean by name and type.
     */
    fun <T> getBean(name: String, clazz: Class<T>): T = CONTEXT.getBean(name, clazz)

    /**
     * Get a set of ioc container beans by type.
     */
    fun <T> getBeanOfType(clazz: Class<T>): Map<String, T> = CONTEXT.getBeansOfType(clazz)

    /**
     * Find whether the bean has annotations.
     */
    fun <A : Annotation> findAnnotationOnBean(name: String, annotationType: Class<A>): A? =
        CONTEXT.findAnnotationOnBean(name, annotationType)

    /**
     * Get application context.
     */
    fun getInstance() = CONTEXT

}
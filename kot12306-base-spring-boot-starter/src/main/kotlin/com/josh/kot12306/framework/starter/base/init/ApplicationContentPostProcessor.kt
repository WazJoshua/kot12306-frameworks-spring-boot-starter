package com.josh.kot12306.framework.starter.base.init

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationListener
import java.util.concurrent.atomic.AtomicBoolean

/**
@author :Joshua
@date :2023/12/9 15:57:50
@description :应用初始化后置处理器，防止Spring事件被多次执行
 */
class ApplicationContentPostProcessor(private val applicationContext: ApplicationContext) :
    ApplicationListener<ApplicationReadyEvent> {

    /**
     * 执行标识，确保Spring事件 {@link ApplicationReadyEvent} 有且执行一次
     */
    private val executeOnlyOnce: AtomicBoolean = AtomicBoolean(false)

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        if (!executeOnlyOnce.compareAndSet(false, true)) {
            return
        }
        applicationContext.publishEvent(ApplicationInitializingEvent(this))
    }
}
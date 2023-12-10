package com.josh.kot12306.framework.starter.base.init

import org.springframework.context.ApplicationEvent

/**
@author :Joshua
@date :2023/12/9 16:21:07
@description :应用初始化事件, 规约事件，通过此事件可以查看业务系统所有初始化行为
 * Create a new {@code ApplicationEvent}.
 *
 * @param source the object on which the event initially occurred or with
 *               which the event is associated (never {@code null})
 */
class ApplicationInitializingEvent(source: Any) : ApplicationEvent(source)
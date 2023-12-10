package com.josh.kot12306.framework.starter.base.safe

import org.springframework.beans.factory.InitializingBean

/**
@author :Joshua
@date :2023/12/9 15:54:03
@description :
 */
class FastJsonSafeMode : InitializingBean {
    override fun afterPropertiesSet() {
        System.setProperty("fastjson2.parser.safeMode", "true")
    }


}
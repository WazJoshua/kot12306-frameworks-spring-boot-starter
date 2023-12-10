package com.josh.kot12306.framework.starter.designpattern.chain

import org.springframework.core.Ordered

/**
@author :Joshua
@date :2023/12/8 15:30:25
@description :抽象责任链
 */
interface AbstractChainHandler<T> : Ordered {

    fun handler(requestParams: T)

    fun mark(): String

}
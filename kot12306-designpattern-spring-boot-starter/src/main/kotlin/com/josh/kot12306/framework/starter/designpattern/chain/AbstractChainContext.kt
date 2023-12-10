package com.josh.kot12306.framework.starter.designpattern.chain

import org.springframework.boot.CommandLineRunner

/**
@author :Joshua
@date :2023/12/8 16:22:05
@description : 抽象责任链上下文
 */
class AbstractChainContext<T> : CommandLineRunner {

    val abstractChainHandlerContainer = HashMap<String, List<AbstractChainHandler<T>>>()

    /**
     * 责任链组件执行
     *
     * @param mark         责任链组件标识
     * @param requestParam 请求参数
     */
    fun handler(mark: String, requestParam: T) {
        val abstractChainHandlers = abstractChainHandlerContainer[mark]
            ?: throw RuntimeException("$mark Chain of Responsibility ID is undefined.")
        abstractChainHandlers.forEach { it.handler(requestParam) }
    }

    override fun run(vararg args: String?) {

    //val chainFilterChain = ApplicationContextHolder

        TODO("Not yet implemented")
    }
}
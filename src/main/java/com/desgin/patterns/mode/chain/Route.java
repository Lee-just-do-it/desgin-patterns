package com.desgin.patterns.mode.chain;

/**
 * @author 木子Lee
 * @desc 责任链模式
 * @date 2019/8/20 23：09
 * @since 1.0
 */
public class Route {

    public Object route(Object dto) {
        AbstarctPayHandler handler = HandlerFactory.getHandlerResponsibilityChain(TestHandler.class, Test2Handler.class);
        return handler.handlePay(dto);
    }
}

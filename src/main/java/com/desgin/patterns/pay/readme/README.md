模版模式 + 责任链模式 联合应用 简单的聚合支付

不考虑分层设计，重点在于讲解设计模式

使用方式：

1.A extend AbstractPayHandler{}
2.{
    AbstractPayHandler handler = HandlerFactory.getHandlerResponsibilityChain(A.class);
    handler.handlePay(T, R);
}
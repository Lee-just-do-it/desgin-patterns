package com.desgin.patterns.pay;

/**
 * @author 木子Lee
 * @desc 支付模版
 * @date 2019/8/13 23:16
 * @since 1.0
 */
public abstract class AbstractPayTemplate<T> {

    /**
     * 获取移动端参数验证签名 防篡改
     * 默认：非法参数【参数签名验证未通过】
     * <p>
     * 验签名：MD5
     *
     * @return
     */
    protected void sign(T t, String auth) {
       System.out.println("统一的验证签名......");
        /**
         * <p>
         *     也可以由子类具体的支付放实现
         *     throw new IllegalArgumentException();
         * </p>
         */
    }

    /**
     * 提供调用的具体支付流程
     *
     * @return
     */
    protected Boolean pay(T t, String auth) {
        sign(t, auth);
        return defray(t);
    }

    /**
     * 第三方具体的支付流程
     *
     * @param t
     * @return
     */
    protected abstract Boolean defray(T t);

}

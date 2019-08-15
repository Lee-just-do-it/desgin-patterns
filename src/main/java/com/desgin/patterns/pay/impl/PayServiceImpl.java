package com.desgin.patterns.pay.impl;

import com.desgin.patterns.pay.AbstractPayTemplate;
import com.desgin.patterns.pay.PayService;
import org.springframework.stereotype.Service;

/**
 * @author 木子Lee
 * @desc 具体的支付
 * <p>使用可查看 README.md 文件 结合Route路由</p>
 * @date 2019/8/13 23：23
 * @since 1.0
 */
@Service
public class PayServiceImpl extends AbstractPayTemplate<String> implements PayService<String> {

    @Override
    public void pay(String s) {
        pay(s, null);
    }

    @Override
    protected Boolean defray(String s) {
        return null;
    }

}

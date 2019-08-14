package com.desgin.patterns.pay;

import jodd.typeconverter.TypeConverterManager;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author  木子Lee
 * @desc 责任链工厂  【更改支付方式分支，可以考虑在责任链上加载组合模式】
 * @date 2019/8/13 23:11
 * @since 1.0
 */
public class HandlerFactory {

    @SafeVarargs
    public static AbstractPayHandler getHandlerResponsibilityChain(Class<? extends AbstractPayHandler>... handlers) {

        Preconditions.checkNotNull(handlers, "list is null");

        if (handlers.length == 1) {
            return BeanUtils.instantiateClass(handlers[0]);
        }

        List list = Arrays.stream(handlers).map(BeanUtils::instantiateClass).collect(Collectors.toList());
        AbstractPayHandler result = TypeConverterManager.convertType(list.get(0), handlers[0]);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            AbstractPayHandler pre = TypeConverterManager.convertType(list.get(i - 1), handlers[i - 1]);
            AbstractPayHandler cur = TypeConverterManager.convertType(list.get(i), handlers[i]);

            cur.set(pre);

            result = cur;
        }
        return result;
    }

}

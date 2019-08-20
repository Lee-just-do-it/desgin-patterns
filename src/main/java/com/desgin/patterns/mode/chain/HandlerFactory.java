package com.desgin.patterns.mode.chain;

import com.google.common.base.Preconditions;
import jodd.typeconverter.TypeConverterManager;
import jodd.typeconverter.TypeConverterManagerBean;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 木子Lee
 * @desc 责任链模式
 * @date 2019/8/20 23：09
 * @since 1.0
 */
public final class HandlerFactory {

    private static TypeConverterManagerBean typeConverterManager = TypeConverterManager.getDefaultTypeConverterManager();

    @SafeVarargs
    public static AbstarctPayHandler getHandlerResponsibilityChain(Class<? extends AbstarctPayHandler>... handlers) {

        Preconditions.checkNotNull(handlers, "参数不能为空");

        if (handlers.length == 1) {
            return BeanUtils.instantiateClass(handlers[0]);
        }

        List list = Arrays.stream(handlers).map(BeanUtils::instantiateClass).collect(Collectors.toList());
        AbstarctPayHandler result = typeConverterManager.convertType(list.get(0), handlers[0]);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            AbstarctPayHandler pre = typeConverterManager.convertType(list.get(i - 1), handlers[i - 1]);
            AbstarctPayHandler cur = typeConverterManager.convertType(list.get(i), handlers[i]);

            cur.set(pre);

            result = cur;
        }
        return result;
    }

}

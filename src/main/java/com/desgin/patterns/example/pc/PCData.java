package com.desgin.patterns.example.pc;

import com.sun.xml.internal.bind.v2.runtime.output.Pcdata;
import com.sun.xml.internal.bind.v2.runtime.output.UTF8XmlOutput;

import java.io.IOException;

/**
 * @author 木子Lee
 * @desc 数据模型
 * @date 2019/8/15 22：29
 * @since 1.0
 */
public final class PCData extends Pcdata {

    private final int data;

    public PCData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public void writeTo(UTF8XmlOutput utf8XmlOutput) throws IOException {

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return "PcTemplate{" +
                "data=" + data +
                '}';
    }
}

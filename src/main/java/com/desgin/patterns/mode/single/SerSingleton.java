package com.desgin.patterns.mode.single;

import java.io.*;

/**
 * @author 木子Lee
 * @desc 序列化破坏单例的防止方式之一
 * @date 2019/8/19 20：58
 * @since 1.0
 */
public class SerSingleton implements Serializable {

    private static SerSingleton instancce = new SerSingleton();
    private String name;

    private SerSingleton() {
        name = "SerSingleton";
    }

    public static SerSingleton getInstance() {
        return instancce;
    }

    private static void create() {

    }

    public static void main(String[] args) throws Exception {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();

        FileOutputStream out = new FileOutputStream("SerSingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(s);

        oos.flush();
        oos.close();

        FileInputStream in = new FileInputStream("SerSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(in);
        s1 = (SerSingleton) ois.readObject();

        // TODO 引入断言判断
        // Assert.assertEquals(s, s1);
    }

    /**
     * 阻止新的实例生成，总是返回当前实例
     *
     * @return
     */
    private Object resolve() {
        return instancce;
    }

}

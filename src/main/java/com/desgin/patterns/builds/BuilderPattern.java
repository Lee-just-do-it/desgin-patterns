package com.desgin.patterns.builds;

/**
 * @author 木子Lee
 * @desc 建造者模式
 * 替换需要不固定参数的需要很多构造器的场景
 * 甚至可以自己实现@Builder注解的功能，看看下面的测试是不是和@Builder的功能一样呢
 * 想想如何实现@Builder建造呢？是不是很容易了
 * @date
 * @since
 */
public class BuilderPattern {

    private Integer pos;
    private String name;

    private BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.pos = builder.pos;
    }

    public static class Builder {
        private Integer pos;
        private String name;

        public Builder() {
        }

        public Builder pos(Integer pos) {
            this.pos = pos;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    public static void main(String[] args) {
        BuilderPattern build = new Builder().name("10").build();
        System.out.println("");
    }


}

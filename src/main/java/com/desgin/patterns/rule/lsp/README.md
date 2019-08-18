里氏替换原则:
    采用继承的方式实现，在JAVA语言中只允许单继承。通俗的定义该原则就是：子类能替换父类，
也就是说父类出现的地方，子类也可以出现，并且父类替换为子类也不会出现程序上的逻辑错误；
但是反过来是不行的，毕竟子类可能具有不同于父类的"个性化"

优点：
因为是采用的继承的方式，所以，子类拥有父亲的属性和方法，可以代码共享，减少创建类的工作量
提高代码的复用性
提高代码的扩展性，比如：spring框架源码很多就是继承自父类来实现接口的扩展性的

缺点：
JAVA语言继承的缺点：
代码侵入性高
继承，耦合性高，父类修改需要考虑子类的影响
子类必须拥有父类的方法和属性，降低了灵活性

提示："子类能替换父类"，设计的时候需要思考【访问权限控制的定义】              

里氏替换在方法重写和重载的考虑；
重载：子类方法参数范围 > 父类方法参数范围
     返回值范围可以缩小 
     
*思考：输出值？ 为什么？*
     
     public class Father {
         public Map say(HashMap map) {
             System.out.println("father...");
             return null;
         }
     
     }
     
     public class Son extends Father {
         public HashMap say(Map map) {
             System.out.println("son...map");
             return null;
         }
     }
     
     public class Test {
         public static void main(String[] args) {
             Father father = new Father();
             HashMap map = new HashMap();
             father.say(map);
     
             Son son = new Son();
             son.say(map);
         }
     }
     


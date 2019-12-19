package javaclasspackeg;

public class ClassObjectTest {

    static String className = "创建对象测试";
    static String staticFieldNotSet ;
    final static String finalStaticField;

    int index = -1;

    {
        System.out.println("执行第一个初始化块:" + index);
        index = 1;
        System.out.println("赋值后: " + index);
    }

    static {
        System.out.println("执行第一个静态初始化块");
        finalStaticField = "final 修饰的静态域必须进行显式的赋值初始化";
    }

    {
        System.out.println("执行第二个初始化块: " + index);
        index = 2;
        System.out.println("赋值后: " + index);
    }

    static {
        System.out.println("执行第二个静态初始化块");
    }


    public ClassObjectTest() {
        System.out.println("执行构造器");
        this.index = 3;
        className = "创建对象测试 - 构造器赋值";
    }

    public static void main(String[] args) {
        new ClassObjectTest();  //先静态    后实例   最后构造器
    }

    {
        System.out.println("执行第三个初始化块");
    }


    static {
        System.out.println("执行第三个静态初始化块");
    }

    {
        System.out.println("执行第四个初始化块");
    }
    static {
        System.out.println("执行第四个静态初始化块");

    }
}

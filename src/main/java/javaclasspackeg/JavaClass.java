package javaclasspackeg;

public class JavaClass {
    //类变量  静态变量  静态域
    private static String classField;

    //实例变量
    private String field;

    //实例代码块
    {
        field = "实例变量";
    }

    //静态代码块
    static {
        classField = "类变量";
    }

    //构造方法

    public JavaClass() {

    }
    //方法
    public void method() {

    }

    //内部类   这是干啥用的??
    class InnerClass {
        int I= 0; //局部变量
    }
}

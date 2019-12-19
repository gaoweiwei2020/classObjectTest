package javaclasspackeg;


import java.util.Arrays;
public class ClassFinalPrefix {

    public static final int MAX_INDEX = 1000;
    public final int index;

    public Arrays ddd;

    public ClassFinalPrefix(int index) {   //构建对象是对final 修饰的对象初始化，两种办法  1 定义时直接赋值  2 构造函数中赋值
        this.index = index;
        System.out.println();
    }
}

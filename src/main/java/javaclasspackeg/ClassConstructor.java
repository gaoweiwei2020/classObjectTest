package javaclasspackeg;

public class ClassConstructor {
    private int n1 ;
    private int n2 ;



    public ClassConstructor() {

    }

    public ClassConstructor(int n1) {
        this();
        this.n1 = n1 ;
    }
    public ClassConstructor(int n1 , int n2) {
        this();   //这个代表执行了无参构造函数   构造函数中调用其他构造函数，只能调用一个，并且必须放在第一行执行。
       // this(n1);//这个代表执行有一个参数的构造函数
        this.n2 = n2 ;
    }



}

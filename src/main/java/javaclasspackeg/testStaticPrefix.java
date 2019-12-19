package javaclasspackeg;

public class testStaticPrefix {
    public static int count ;
    public int index ;

    public testStaticPrefix() {
        count++;
    }


    public static void setCount(int count) {
        testStaticPrefix.count = count;
    }

    public static void main(String[] args) {
        testStaticPrefix obj1 = new testStaticPrefix();
        System.out.println(obj1.count);
        testStaticPrefix obj2 = new testStaticPrefix();
        System.out.println(testStaticPrefix.count);
    }



}

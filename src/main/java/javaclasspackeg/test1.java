package javaclasspackeg;

public class test1 {
    private void changePrimitiveValue(int n) {
        n = 200 ;
    }

    private void changeReferenceValue(StringBuilder sb) {
        sb.append("New");
        sb = new StringBuilder();    //改变不了这个引用指向的地方 所以“NewValue”打印不出来
        sb.append("NewValue");


    }


    public static void main(String[] args) {


        testAccessRange tsA = new testAccessRange();
        classSon classson = new classSon();
        classson.numDef = 3;   //能访问  同包子类
        classson.numPro = 4;
        classson.numPub = 5;




        tsA.numDef = 9;
        tsA.numPro = 10;
        tsA.numPub = 99;
        //tsA.numPri = 33;



        test1 Test = new test1();
        int n = 100 ;
        System.out.println(n);
        Test.changePrimitiveValue(n);
        System.out.println(n);


        StringBuilder sb = new StringBuilder();
        sb.append("this is a string");
        System.out.println(sb.toString());
        Test.changeReferenceValue(sb);
        System.out.println(sb.toString());
    }
}

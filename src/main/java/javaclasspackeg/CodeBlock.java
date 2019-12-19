package javaclasspackeg;


public class CodeBlock {
    public static final int MAX_INDEX;
    public final int fromIndex;


    static {
        System.out.println("执行static代码块");
        MAX_INDEX = 1000;
    }

    {
        System.out.println("执行初始化代码块");
        this.fromIndex = 1;
    }


    public static void main(String[] args) {
        System.out.println(CodeBlock.MAX_INDEX);

        CodeBlock codeBlock = new CodeBlock();
        System.out.println(codeBlock.fromIndex);

        CodeBlock codeBlock2 = new CodeBlock();
        System.out.println(codeBlock2.fromIndex);  //fromIndex为每个对象所独有的，不是共享的，只是值不能修改
    }
}

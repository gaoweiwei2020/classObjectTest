package javaclasspackeg;

public class testAccessRange {
    public int numPub;

    protected int numPro;

    int numDef;

    private int numPri;


    public void test() {
        this.numDef = 1;
        this.numPri = 2;
        this.numPro = 3;
        this.numDef = 4;
    }

}

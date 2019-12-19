package PersonTest;

import org.testng.annotations.Test;
import people.Person;

public class testPerson {

    private  int numb = 1;

    private void print(int numb) {
        System.out.println(numb);
        System.out.println(this.numb);
    }


    private void print2(int... nums) {
        if (nums == null){
            System.out.println("param is null");
            return;
        }
        if(nums.length == 0){
            System.out.println("param count is 0");
            return;
        }

        System.out.println("共" + nums.length+ "个参数");
        for (int count:nums
             ) {
            System.out.println(count);
        }

    }

    @Test
    public void testPrint2() {
        this.print2();
        this.print2(null);
        this.print2(1);
        this.print2(1,2,3,4,5);
    }

    @Test
    public void testPrint() {   //实际上参数列表（）中  第一个传递进来的是this
        this.print(2);

    }

    @Test
    public void test() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
    }
}

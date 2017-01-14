package reflection.homework1;

import java.time.LocalDate;

public class TestClass {

    @Test(a=2, b=5)
    public void test(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public void date(){
        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
}

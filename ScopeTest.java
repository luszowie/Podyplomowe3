import java.awt.*;

public class ScopeTest {


    int test = 10;
    Point point = new Point(1,3);

    void changePoint (Point point) {

        point.x = 5;
        point.y = 5;

    }

    void changeTest (int test) {
        test = 5;

    }

    void printTestt () {
        int test = 20;
        System.out.println("test: " + test);

    }

    public static void main(String[] args) {

        ScopeTest scopeTest = new ScopeTest();
       // scopeTest.printTestt();

        System.out.println("test: " + scopeTest.test);
        System.out.println("point: " + scopeTest.point);
        System.out.println("----------------");
        scopeTest.changeTest(scopeTest.test);
        scopeTest.changePoint(scopeTest.point);
        System.out.println("test: " + scopeTest.test);
        System.out.println("point: " + scopeTest.point);


    }

}

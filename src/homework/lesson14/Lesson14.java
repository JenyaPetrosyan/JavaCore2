package homework.lesson14;

public class Lesson14 {
    void test() {
        System.out.println("паратетр отсутствуют");
    }

    void test(int a) {
        System.out.println("a=" + a);
    }

    void test(int a, int b) {
        System.out.println("a & b" +a +" "+b);
    }

    double test(double a) {
        System.out.println("double a:"+a);
        return a * a;

    }


}
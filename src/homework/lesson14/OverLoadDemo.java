package homework.lesson14;

public class OverLoadDemo {
    void test(){
        System.out.println("паратетр отсутствуют");

    }
    void test (int a, int b){
        System.out.println("a & b" +a +" "+b);

    }
    void test(double a){
        System.out.println("test double a="+a);
    }
}

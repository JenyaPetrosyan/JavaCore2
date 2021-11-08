package homework.lesson14;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ov=new OverLoadDemo();
        int i= 88;
        ov.test();
        ov.test(10,20);
        ov.test(i);
        ov.test(123.2);
    }
}

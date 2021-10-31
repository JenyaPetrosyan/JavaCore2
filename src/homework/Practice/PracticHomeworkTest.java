package homework.Practice;

public class PracticHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(1));
        System.out.println(ph.calcAge(3));
        System.out.println(ph.nextNumber(7));
        System.out.println(ph.isSameNum(4, 7));
        System.out.println(ph.isSameNum(4, 4));
        System.out.println(ph.lessThanOrEqualToZero(-4));
        System.out.println(ph.lessThanOrEqualToZero(7));
        System.out.println(ph.reverseBool(false));
        System.out.println(ph.reverseBool(true));
        System.out.println(ph.maxLength(new int[90],new int[9]));


    }
}
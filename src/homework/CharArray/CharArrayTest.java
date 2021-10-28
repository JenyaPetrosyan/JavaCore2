package homework.CharArray;

public class CharArrayTest {
    public static void main(String[] args) {
        CharArray bo=new CharArray();
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] text1 = {' ', ' ', 's', ' ', 'b', +'a', 'r', ' ', 'e', 'v', ' ', 's', ' ', ' ', 'n'};
        int[] array = {7, 4, 0, 2, 6, 37, 88, 12, 5};

        bo.y(bolola);
        System.out.println();
        bo.boloa1(bolola);
        System.out.println();
        bo.bolola2(bolola);
        System.out.println();
        bo.bolola3(bolola);
        System.out.println();
        bo.bolola4(text);
        System.out.println();
        bo.bolola5(text1);
        System.out.println();
        System.out.println(bo.i(array));



    }

}
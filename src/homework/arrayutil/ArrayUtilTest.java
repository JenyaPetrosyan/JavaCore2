package homework.arrayutil;

import java.sql.SQLOutput;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil1 au = new ArrayUtil1();
        int[] array = {4, 45, 78, 99, 65};
        au.max(array);

        int[] nambers = {14, 57, 88, 44, 1, 2};
        au.max(nambers);


        int[] nambrs = {14, 54, 78, 10, 3};
        int minnambrs = au.min(nambrs);
        System.out.println(au.min(nambrs) * 2 + 3);


        int[] nambrs1 = {7, 8, 9, 4, 5, 6};
        int minnambrs1 = au.min(nambrs1);
        System.out.println(au.min(nambrs1) * 5 / 2);
        if (au.min(nambrs) > au.min(nambrs1)) {
            System.out.println();
            System.out.println(" Պատասղանը");
            ;
        }

        int[] zuyg = {12, 45, 78, 96, 32, 54};
        au.zuyg(array);

        int[] knet={1,4,7,8,54,12};
        int zuygarray=au.kent(nambrs);
        System.out.println(au.kent(nambrs)+6*5);
        System.out.println(au.kent(nambrs)+6*5 / au.min(nambrs1));


    }
}

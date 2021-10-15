package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 9, 12, 24, 18, 11, 19, 21};
       // Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max + " ");
        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
       System.out.println(min + " ");


        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]);
            }

        }
        // Տպեք մասիվի բոլոր կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]);
            }

        }
        //Տպեք զույգերի քանակը։
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) ;
            {
                index++;
            }
        }

        System.out.print(" " + index + "");
        //Տպեք կենտերի քանակը
        int index1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) ;
            {
                index1++;
            }
        }

        System.out.print(" " + index + "");


    }

}

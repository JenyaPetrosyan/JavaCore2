package homework.HomeWork1;

public class ArrayUtil1 {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 9, 12, 24, 18, 11, 19, 21};
       /* // Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        //Տպեք մասիվի ամենամեծ թիվը
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);


        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        int a=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                  a= array[i];

                System.out.println(a);
            }

        }



        // Տպեք մասիվի բոլոր կենտ էլեմենտները
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                index = array[i];
                System.out.println(index);
            }
        }


        //Տպեք զույգերի քանակը։
        int index=0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                index=array[i];
                index++;System.out.println(index);
            }
        }

        */
        //Տպեք կենտերի քանակը
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                index = array[i];
                index++;

            }
        }
        System.out.println(index);

    }
}



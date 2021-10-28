package homework.arrayutil;

public class ArrayUtil1 {
    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    int min(int[] nambrs) {
        int  min=nambrs[0];
        for (int i = 0; i < nambrs.length; i++) {
            if (nambrs[i] < min) {
                min = nambrs[i];
            }
        }
        return min;
    }

    void zuyg(int[]array){
        int zuyg=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
            }
        }
        System.out.println(zuyg);
    }


    int kent (int[]array){
        int kent= array[0];
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 !=0){

            }
        }
        return kent;

    }
}





package homework.dinamicArray;

public class DynamicArray {
    //Սա մեր հիմնական մասիվն է որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //Սա մեր մասիվի մեջ ավելավցված էլեմենտների քանակն է
    private int size = 0;

    //Ստուգել եթե մասիվի մեջ  տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int velue) {
        if (array[array.length - 1] != 0) {
            extend();
        } else {
            array[size++] = velue;
        }
    }

    //1․Ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․գեցել հին մասիվի էլեմենտները նոր մասիվի մեջ
    //3․ հին մասիվի հղումը կապել նոր մասիվի հետ։
    public void extend() {
        int[] dynamicarrey = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = dynamicarrey[i];
        }
        array = dynamicarrey;

    }


    //Եթե տրված ինդեքսը  մեր ունեցած մասիվի սահմաններում է վերադարձնել , մասիվի index-երրորդ էլեմենտը։
    //Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > array.length) {
            return -1;
        } else {
            return array[index];
        }
    }

    //Տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);

        }
    }


}

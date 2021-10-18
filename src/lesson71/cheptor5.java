package lesson71;

public class Breack {

    public static void main(String args[]) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("Этот оператор не будет выполняться");}
                System.out.println("Этот оператор не будет выполняться");}
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}







public class BreakLoop {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд" + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}




public class Continue {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}




public class Findprime {
    public static void main(String args[]) {
        int num;
        boolean isprime;
        num = 14;
        if (num < 2) isprime = false;
        else isprime = true;
        for (int i = 2; i <= num / i; i++){
            if ((num % i) == 0) {
                isprime = false;
                break;
            }}
        if (isprime) System.out.println("Пpocтoe число");
        else System.out.println("He простое число");
    }}




public class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            System.out.println("Знaчeниe равно: " + x);
            sum += x;
            System.out.println("Cyммa равна: " + sum);


        }
    }
}



public class ForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;

        }
    }}




public class NoChange {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");

            x = x * 10;
        }
        System.out.println();
        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();

    }
}



public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Дo возврата.");
        if(t) return;
        System.out.println(
                "Этот оператор выполняться не будет.");
    } }


public class Search {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Знaчeниe найдено!");

    }
}


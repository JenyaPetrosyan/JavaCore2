package homework.author;

import java.util.Scanner;

public class AutherTest {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println();
        int a= scanner.nextInt();
        AuthorStorage au=new AuthorStorage();
        for (int i = 0; i < a; i++) {
            Author aut=new Author();
            System.out.println("Ani");
            System.out.println(scanner.nextInt());
            System.out.println("Mane");
            System.out.println(scanner.nextInt());
            System.out.println("Tigram");
            System.out.println(scanner.nextInt());
            au.add(aut);
        }
au.print();

    }
}

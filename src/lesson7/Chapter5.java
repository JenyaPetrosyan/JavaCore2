package lesson7;

public class Chapter5 {
    public static void main(String[] args) {
   /*     int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
        season = "зиме";
        else if( month ==3 || month ==4 ||month ==5)
            season = " весна";
else if(month ==6 || month == 7||month ==8)
            season="лето";
else if(month ==9 || month==10|| month==11)
    season="осень";
        else{
            season = "вымышленным месяцам";}
        System.out.println("Апрель относится к" + season + ".");
*/

  /*      for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трем.");
                    break;
                default:
                   System.out.println("i больше трех.");


            }
            */

    /*    for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:

                    System.out.println("i меньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10");
                    break;
                default:
                    System.out.println("i равно или больше 10");

           }
       */
/*      int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            case 3:
            case 4:
            case 5:
                season = "весне";
                break;
            case 6:
            case 7:
            case 8:
                season = "лету";
                break;
            case 9:
            case 10:
            case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
                System.out.println(
                        "Апрель относится к" + season + ".");
        }
        */
     /*   int n = 10;
        while(n > 0) {
            System.out.println("тaкт " + n);
            n--;
        }
        */
     /*   int n = 10;
        do {
            System.out.println("тaкт" + n);
            n--;}
            while (n > 0) ;
        do {
            System.out.println("тaкт " + n);
        } while(--n > 0);
        */
    /*    char choice;
        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Bыбepитe нужный пункт:");
            choice = (char)
                    System.in.print();
            while (choice < '1' || choice > '5');
            System.out.println("\n");
            switch (choice):
            case '1':
                System.out.println("if: \n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switсh(выражение) {");
                System.out.println(" case константа:");
                System.out.println(
                        " последовательность операторов");
                System.out.println(" break;");
                System.out.println(" / / ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие) );
                break;
            case '5':
                System.out.println("for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;

        }
        */
    }
}
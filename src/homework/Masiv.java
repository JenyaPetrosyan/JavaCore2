package homework;

public class Masiv {
    public static void main(String[] args) {
        // գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int y = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                y++;
            }
        }
        System.out.print(y);

        //  գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int i = 0; i < bolola1.length; i++) {
            if (i == bolola1.length / 2) {
                System.out.print(bolola1[i] + bolola1[i - 1]);
            }
        }

        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int j = 0; j < bolola.length; j++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
                System.out.print(true);
            } else {
                System.out.print(false);
            }
        }

        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bolola3 = {'g', 'b', 'h', 'b', 'k'};
        for (int z = 0; z < bolola3.length; z++) {
            if (bolola3[z] != 'b') continue;
            if (bolola3[z] == 'b' && bolola3[z + 2] == 'b') {
                System.out.print(true);
                break;
            } else {
                System.out.print(false);
            }
        }
        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = new char[text.length];
        for (int i = 0; i < result.length; i++) {
            int x = result[i];
            if (result[i] == ' ') continue;
            if (result[i] != ' ') {
                result[i]++;
            }
            System.out.print(result[i]);
        }


        //Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text1 = {' ', ' ', 's', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', 's', ' ', ' ', 'n'};
        System.out.print("5-");
        char[] result1 = new char[text.length];
        int index = 0;
        int i;
        for (i = 0; i < text.length; i++) {
            if (text[i] == ' ')
                continue;
            else if (text[i] != ' ') {
                index++;
                result[index] = text[i];
                break;
            }
        }
        for (
                int j = i;
                j < text.length; j++) {
            if (text[j] == ' ') {
                index++;
                result[index] = text[j];
            } else if (text[j] != ' ') {
                index++;
                result[index] = text[j];
            }

            System.out.print(result[index]);
        }


//Գրել կոդ որոը  թվերը կդասավոիր աճման կարգով

        int[] array = {7, 4, 0, 2, 6, 37, 88, 12, 5};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int x = array[i];
                if (array[i] > array[j]) {
                    array[i] = array[j];
                    array[j] = x;
                }
            }
            System.out.print(array[i] + (" "));


        }
    }
}
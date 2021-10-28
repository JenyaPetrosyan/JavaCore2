package homework.CharArray;

public class CharArray {
    char c = 'o';
    int y = 0;

    void y(char[] bolola) {
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                y++;
            }
        }
        System.out.println(y);
    }

    void boloa1(char[] bolola1) {
        for (int i = 0; i < bolola1.length; i++) {
            if (i == bolola1.length / 2) {
                System.out.print(bolola1[i] + bolola1[i - 1]);

            }
        }

    }

    void bolola2(char[] bolola2) {

        for (int j = 0; j < bolola2.length; j++) {
            if (bolola2[bolola2.length - 1] == 'y' && bolola2[bolola2.length - 2] == 'l') {
                System.out.print(true);
            } else {
                System.out.print(false);
            }
        }
    }

    void bolola3(char[] bolola3) {
        for (int z = 0; z < bolola3.length; z++) {
            if (bolola3[z] != 'b') continue;
            if (bolola3[z] == 'b' && bolola3[z + 2] == 'b') {
                System.out.print(true);
                break;
            } else {
                System.out.print(false);
            }
        }
    }

    void bolola4(char[] text) {
        ;
        char[] result = new char[text.length];
        for (int i = 0; i < result.length; i++) {
            int x = result[i];
            if (result[i] == ' ') continue;
            if (result[i] != ' ') {
                result[i]++;
            }
            System.out.print(result[i]);
        }

    }

    void bolola5(char[] text1) {
        char[] result = new char[0];
        System.out.print("5-");
        char[] result1 = new char[text1.length];
        int index = 0;
        int i;
        for (i = 0; i < text1.length; i++) {
            if (text1[i] == ' ')
                continue;
            else if (text1[i] != ' ') {
                index++;
                result[index] = text1[i];
                break;
            }
        }
        for (
                int j = i;
                j < text1.length; j++) {
            if (text1[j] == ' ') {
                index++;
                result[index] = text1[j];
            } else if (text1[j] != ' ') {
                index++;
                result[index] = text1[j];
            }

            System.out.print(result[index]);
        }
    }

    int i(int[]array) {
        int i=0;
        for (int i1 = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int x = array[i];
                if (array[i] > array[j]) {
                    array[i] = array[j];
                    array[j] = x;
                }
            }

        }return array[i];
    }
}
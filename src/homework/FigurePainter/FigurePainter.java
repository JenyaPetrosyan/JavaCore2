package homework.FigurePainter;

public class FigurePainter {
    void figureOne(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureTwo(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();

        }
    }

    void figuretree(char v) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j <= 0; j--) {
                System.out.print("  ");
                for (int k = 0; k < i; k++) {
                    System.out.print(v + " ");
                }
            }
            System.out.println();
        }
    }

    void figurefore() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j >= i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    void figurefive() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >= 0; j--) {
                if (j > i)

                    System.out.print(" ");

                else

                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


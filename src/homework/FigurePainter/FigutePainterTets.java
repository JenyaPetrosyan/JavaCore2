package homework.FigurePainter;

import homework.FigurePainter.FigurePainter;

public class FigutePainterTets {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.figureOne(4);
        System.out.println();
        fp.figureOne(5);
        System.out.println();
        fp.figureOne(6);
        System.out.println();
        fp.figureOne(7);

        fp.figureTwo(20);
        System.out.println();
        fp.figureTwo(10);
        System.out.println();
        fp.figureTwo(5);
        System.out.println();
        fp.figureTwo(1);

        fp.figuretree('6');
        fp.figuretree('4');

    }
}

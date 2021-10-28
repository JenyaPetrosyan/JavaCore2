package homework1;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box1.Box mybox1 = new Box1.Box();
        Box1.Box mybox2 = new Box1.Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depht = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depht = 9;

        mybox1.volume();
        mybox2.volume();
    }
}

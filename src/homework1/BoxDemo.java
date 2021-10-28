package homework1;

public class BoxDemo {
    public static void main(String[] args) {
        Box1.Box MyBox = new Box1.Box();
        Box1.Box MyBox1 = new Box1.Box();
        double vol;
        MyBox.width = 10;
        MyBox.height = 20;
        MyBox.depht = 15;

        vol = MyBox.depht * MyBox.height * MyBox.depht;
        System.out.println(vol);

        MyBox1.width = 3;
        MyBox1.height = 6;
        MyBox1.depht = 9;

        vol= MyBox1.depht * MyBox1.height * MyBox1.width;
        System.out.println();

    }
}

package homework1;

public class Box1 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    public static class Box {
        double width;
        double height;
        double depht;

        void volume() {
            System.out.print( "volume:");
            System.out.println(width * height * depht);
        }
    }
}

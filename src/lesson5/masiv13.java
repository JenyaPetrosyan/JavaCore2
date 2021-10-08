package lesson5;

public class masiv13 {
    public static void main(String[] args) {


        double[] nums = {4.2, 5.5, 7.8, 8.4, 9.2, 6.3,};
        double rezult = 0;
        int i;
        for (int j = 0; j < 5; j++) {
            rezult = rezult + nums[j];
            System.out.println(rezult / 5);

        }
    }
}

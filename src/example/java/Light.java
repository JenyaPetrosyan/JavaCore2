package example.java;

public class Light {
    public static void main(String[] args) {
        int արագություն;
        long օր;
        long րոպե;
        long ժամանակ;
        արագություն = 186000;
        օր = 1000;
        րոպե = օր * 24 * 60 * 60;
        ժամանակ = արագություն * րոպե;
        System.out.print("մեկ" + օր);
        System.out.print("լույսը կանցնի");
        System.out.print(ժամանակ + "միլ");

    }
}

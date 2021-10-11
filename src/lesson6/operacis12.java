package lesson6;

public class operacis12 {
    public static void main(String[] args) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100",
                "0110", "0111", "1000", "1001", "1010",
                "1100", "1101", "1110", "1111"};
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println(" а = " + binary[a]);
        System.out.println(" Ь = " + binary[b]);
        System.out.println(" a|b " + binary[c]);
        System.out.println(" а&Ь " + binary[d]);
        System.out.println(" а^Ь " + binary[e]);
        System.out.println("~a&b | a&~b = " + binary[f]);
        System.out.println(" ~а= " + binary[g]);


        byte z = 64, x;
        int i;
        i = (byte) (z << 2);
        System.out.println("z:" + z);
        System.out.println("i and z" + i + " " + b);

        int j;
        int num = 0xFFFFFFE;
        System.out.println(num);

        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte s = (byte) 0xf1;
        System.out.println("s= 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        char lll[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

    }

}



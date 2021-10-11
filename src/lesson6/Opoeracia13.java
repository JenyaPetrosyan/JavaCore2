package lesson6;

public class Opoeracia13 {
    public static void main(String[] args) {
  /*      char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0x0f) >> 4);
        System.out.println("b=0x " + hex[(b >> 4) & 0x0f1] + hex[b & 0x0f]);

        System.out.println("b>>4=0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("b>>>4=0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b &0xff") >> 4 = 0x; " + hex[ hex[(e>>4) &0x0f] + hex[e &0x0]);
*/
 /*       int a = 1;
        int b = 2;
        int v = 3;
        a |= 4;
        b >>= 1;
        v <<= 1;
        a ^= -v;
        System.out.println("a =" + a);
                System.out.println("b=" + b);
                        System.out.println("c="+ v);
*/
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b);
        boolean g = !a;
        System.out.println();
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a|b=" + c);
        System.out.println("a&b=" +d);
        System.out.println("!ab|a&b =" + f);
        System.out.println("a^b" + e);
        System.out.println("!a=" + g);

    }
}

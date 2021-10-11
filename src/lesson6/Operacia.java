package lesson6;

import groovyjarjarantlr4.v4.codegen.model.SrcOp;

public class Operacia {
    public static void main(String[] args) {
        int a = 1 + 1;
        int b = a + 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println(" a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);


        double da = 1 + 1;
        double db = da + 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        System.out.println("da=" + da);
        System.out.println("db=" + db);
        System.out.println("dc=" + dc);
        System.out.println("dd=" + dd);
        System.out.println("de=" + de);

        int h = 42;
        double j = 42.25;
        System.out.println("h=" + h % 10);
        System.out.println("j=" + j % 10);

        int m = 1;
        int n = 2;
        int v = 3;
        m += 5;
        n *= 4;
        v += m * n;
        n %= 6;
        System.out.println("m=" + m);
        System.out.println("n=" + n);
        System.out.println("v=" + v);
        int u = 1;
        int q = 2;
        int w;
        int t;
        w = ++q;
        t = u++;
        w++;
        System.out.println("u="+u);
        System.out.println("q="+q);
        System.out.println("t="+t);
        System.out.println("w="+w);


    }


}

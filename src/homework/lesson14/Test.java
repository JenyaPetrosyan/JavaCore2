package homework.lesson14;

public class Test {
    /*int a, b;

    Test(int i, int j) {
        a=i;
        b=j;

    }
    boolean aqualTO(Test o){
        if(o.a==a && o.b==b ){
            return  true;
        }else {
            return false;
        }

    }}

    void meth(int i ,int j){
    i*=2;
    j/=2;
    }



    int a,b;

        Test(int i,int j){
            a=i;
            b=j;
        }
        void ment(Test o){
            o.a*=2;
            o.b/=2;

        }

     */
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}



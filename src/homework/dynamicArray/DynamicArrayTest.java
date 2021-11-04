package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(8);
        int byindex=da.getByIndex(0);
        System.out.println(byindex);
        da.print();
        }

}

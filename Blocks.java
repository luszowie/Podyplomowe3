public class Blocks {
    public static void main(String[] args) {
         int x = 5;

       // { zmienna y jest widoczna tylko w bloku
            int y = 10;
            y= y + x;
            System.out.println("y = " + y);

       // }
        System.out.println("x = " + x);
        System.out.println("y =" + y);
    }




}

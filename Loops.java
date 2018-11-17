import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {
        //for (;;) {
          // System.out.println("Petla nieskończona");

    //for (int i =1; i<100; i++) {
      //  System.out.println("i=" + 1);


       // int i = 0;
        //do {
          //  System.out.println("i-1"+i);
            //i++;


        //} while (false);

       /* final String Forbiden = "dwa";
        String[] strings = {"raz", "dwa", "trzy", "cztery", "pięć"};
        int i = 0;
        System.out.println("------------Start");

        while (i < strings.length) {
            if (strings[i].equals(Forbiden)){
                i++;
                //break;
                continue;
            }
            System.out.println(strings[i]);
            i++;        }

        System.out.println("----------Koniec");
*/
       out: for (int i = 0; i<10; i++) {
           for (int j=0; j<10; j++){
               System.out.println("i=" + i + "j=" + j);
               if (i==5 && j==5 ){
                   break out;
               }
           }
       }




    }

    }





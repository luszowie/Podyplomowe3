public class HalfDollars {
    public static void main(String[] args) {

        int[] denver ={1_700_000, 4_600_000, 2_100_000 };
        int[] philadelpfia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;
        philadelpfia [0] = 1_800_000;
        philadelpfia [1] = 5_000_000;
        philadelpfia [2] = 2_500_000;

        total[0] = denver[0] + philadelpfia[0];
        total[1] = denver[1] + philadelpfia[1];
        total[2] = denver[2] + philadelpfia[2];

        average = (total[0] + total[1] + total[2]) / 3;

        System.out.println("Produkcja w 2012: " );
        System.out.format("%,d%n", total[0]);
        System.out.println("Produkcja w 2013: " );
        System.out.format("%,d%n", total[1]);
        System.out.println("Produkcja w 2014: " );
        System.out.format("%,d%n", total[2]);

        System.out.println("Średnia produkcja: ");
        System.out.format("%,d%n", average);


    }

}

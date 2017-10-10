public class DemoArray1 {
    public static void main(String[] args) {
        System.out.println("\nContoh 1\n");
        int[] ages1 = new int[10];
        for (int i=0; i<10; i++){ //dicetak dengan batas kondisi tertentu
            System.out.println(ages1[i]);
        }

        System.out.println("\nContoh 2\n");
        int[] ages2 = new int[10];
        for (int i=0; i<ages2.length; i++){ //dicetak dengan batas panjang array
            System.out.println(ages2[i]);
        }

        System.out.println("\nContoh 3\n");
        int[] ages3 = new int[10];
        for (int i=0; i<ages3.length; i++){ //dicetak dengan batas panjang array
            ages3[i] = i; //pemberian nilai pada array
            System.out.println(ages3[i]);
        }
    }
}
public class Main {
    public static void main(String[] args) {


        int[][] tablica = new int[5][3];


        for (int i = 0; i <tablica.length ; i++) {
            for (int j = 0; j<tablica[i].length; j++) {
                System.out.print(tablica[i][j]  + " ");
            }
            System.out.println();
        }
    }
}


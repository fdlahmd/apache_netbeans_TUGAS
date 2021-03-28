package tugas_praktikum_2;

public class no_4 {
    public static void main(String[] args) {
            int[][] matriks_a = {
                    {3,2,1},
                    {7,8,9}
            };
            int[][] transpose = new int[5][5];
            for (int i=0; i<matriks_a.length; i++){
                for (int j=0; j<matriks_a[0].length; j++){
                    transpose[j][i] = matriks_a[i][j];
                }
                System.out.println();
            }
            for (int i=0; i<matriks_a[0].length; i++){
                for (int j=0; j<matriks_a.length; j++){
                    System.out.print(transpose[i][j]+" ");
                }
                System.out.println();
            }
        }
}
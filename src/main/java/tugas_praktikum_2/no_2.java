package tugas_praktikum_2;
public class no_2 {
    public static void main(String[] args){
        int [][] A = {
            {7, 4, 5},
            {8, 4, 6},
            {8, 8, 9}
        };
        int [][] B = {
            {4, 2, 2},
            {3, 2, 1},
            {5, 7, 7},
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++ ){
                for (int j = 0; j < A[0].length; j++){
                 C[i][j] = A[i][j] - B[i][j];
                }
            }
            for (int[] c: C){
                for (int q: c){
                    System.out.print(q+" ");
                }
                System.out.println();
            }
        }
    }
}
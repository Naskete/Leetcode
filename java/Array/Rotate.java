package Array;
public class Rotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] arr: matrix){
            int len = arr.length;
            for(int i = 0; i < len - i; i++){
                int temp = arr[i];
                arr[i] = arr[len-i-1];
                arr[len-i-1] = temp;
            }
        }
    }
}

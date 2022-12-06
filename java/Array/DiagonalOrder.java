package Array;
public class DiagonalOrder{
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] arr = new int[m*n];
        if(n==1){
            for(int i = 0; i < m; i++){
                arr[i] = mat[i][0];
            }
            return arr;
        }
        arr[0] = mat[0][0];

        int k = 1;
        int i = 0, j = 1;
        while(k < m*n){
            // 左下
            while(i < m && j > -1 && k < m*n){
                arr[k] = mat[i][j];
                i++;
                j--;
                k++;
            }
            if(i==m){
                i = i-1;
                j = j+2;
            } else {
                j = 0;
            }
            // 右上
            while(i > -1 && j < n &&k <m*n){
                arr[k] = mat[i][j];
                i--;
                j++;
                k++;
            }
             if(j==n){
                i += 2;
                j = n-1;
            } else {
                i+=1;
            }
        }
        return arr;
    }
}
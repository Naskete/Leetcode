import java.util.ArrayList;
import java.util.List;

public class zero{
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> row = new ArrayList<>();
        List<Integer> column = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i = 0; i < row.size(); i++){
            matrix[row.get(i)] = new int[n];
        }
        for(int k = 0; k < column.size(); k++){
            for(int i = 0; i < m; i++){
                matrix[i][column.get(k)] = 0;
            }
        }
    }
}
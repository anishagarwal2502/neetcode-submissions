class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0; j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);                    
                }
            }
        }

        for(Integer r: rows){
            for(int k = 0; k<matrix[0].length; k++){
                matrix[r][k] = 0;
            }
        }

        for(Integer c: cols){
            for(int k = 0; k<matrix.length; k++){
                matrix[k][c] = 0;
            }
        }
    }
}

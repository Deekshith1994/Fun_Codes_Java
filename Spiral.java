int[] matrixElementsInSpiralOrder(int[][] matrix) {
     if(matrix.length == 0) return new int[0];

    List<Integer> spiral = new ArrayList<Integer>();
    int r = 0 , c = 0 ;
    int rl = matrix[0].length , cl = matrix.length ;
    
    while (r < cl && c < rl ){
        
        System.out.println ("\n1st");
        for(int i = c ; i < rl ; i++){
            spiral.add(matrix[r][i]);
            System.out.print(spiral.get(spiral.size()-1) + " ");
        }
        r++;
        
        System.out.println("\n2nd");
        for(int i = r ; i < cl ; i++){
            spiral.add(matrix[i][rl - 1]);
            System.out.print(spiral.get(spiral.size()-1) + " ");
        }
        rl--;
        
        System.out.println("\n3rd");
        if(r < cl){
            for(int i = rl - 1; i >= c ; i--){
                spiral.add(matrix[cl-1][i]);
                System.out.print(spiral.get(spiral.size()-1) + " ");
            }
            cl--;
        }
        
        System.out.println("\n4th");
        if(c < rl){
            for(int i = cl - 1 ; i >= r ; i--){
                spiral.add(matrix[i][c]);
                System.out.print(spiral.get(spiral.size()-1)+ " ");
            }
            c++;
        }
        
    }
        int t = 0;
        int[] ret = new int[spiral.size()];
        for(int a : spiral) ret[t++] = a;
        return ret;
}
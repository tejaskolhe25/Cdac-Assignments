public class Que5 {
    public static void main(String[] args) {
        int matrix1[][]={{1,2},{3,4}};
        int matrix2[][]={{1,2},{3,4}};
        int i,j,temp=0;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                if(matrix1[i][j]==matrix2[i][j]){
                    temp=temp+1;
                }
            }
        }
        if(temp==4){
            System.out.println("matrix are equal");

        }

    }
    
}

package Day5;

public class Que3 {

    public static void main(String[] args) {
        int i,j,temp=0;
        for(i=5;i>0;i--){
            for(j=5;j<i;j--){
                
                System.out.print("*");

            }
            temp=temp+1;
            System.out.println();
        }
    }
    
}

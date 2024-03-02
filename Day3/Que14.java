import java.util.Scanner;
public class Que14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        int i=1;
        

        while(i<n)

        {
            i++;
            fact*=i;
            System.out.println(fact);


        }
        
    }
    
}

import java.util.Scanner;
public class Que15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter a number");
        int sum=0;
        int r;
        do {
            r=n%10;
            sum=sum+r;
            n=n/10;
            
        } while (n>0);
        System.out.println(sum);
        
    }
    
}

import java.util.Scanner;
class Que16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int temp=0;
        for(i=2;i<=n-1;i++){
            if(n%i==0){
                temp=temp+1;

            }
            }
            if(temp==0){
                System.out.println("is prime number");
            }
            else{
                System.out.println("not prime number");
            }
        

        
    }

}
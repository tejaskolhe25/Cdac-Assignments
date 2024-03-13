import java.util.Scanner;
class Que2{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year");
        int year= sc.nextInt();

        if( year%4 == 0 ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap year");
        }
        

    }
}
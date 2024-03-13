import java.util.Scanner;
class Que1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Numerical grade");
        int marks = sc.nextInt();

        if( marks >= 90 ){
            System.out.println("A grade");
        }
        else if( marks >= 80 ) {
            System.out.println("B Grade");
        }
       else if (marks >=70 ){
            System.out.println("C Grade");
        }
        else if (marks >= 50 ){
            System.out.println("D grade");
        }
        else if (marks < 50){
            System.out.println("Fail");
        }
        else{
            System.out.println("Please enter between 1 to 100");
        }

    }
}
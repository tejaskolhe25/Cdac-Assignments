import java.util.Scanner;
class Que2_1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year");
        int year= sc.nextInt();

        switch(year%4){
            case 0:
                    System.out.println("Leap Year");
                    break;
            default:
                    System.out.println("Not Leap Year");        
        }
        

    }
}
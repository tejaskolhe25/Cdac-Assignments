import java.util.Scanner;
class Que3{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

         System.out.println("Enter Value of A:-");
        float a= sc.nextInt();
        System.out.println("Enter Value of B:-");
        float b= sc.nextInt();
        float c;

        System.out.println("******************************************");
        System.out.println("1. Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("******************************************");

        System.out.println("Enter Yout Choice");
        int ch= sc.nextInt();

        switch(ch){
            case 1:
                    c=a+b;
                    System.out.println("Addition of A and B:-" +c);
                    break;
            case 2:
                     c=a-b;
                     System.out.println("Subtraction of A and B:-" +c);
                     break;
            case 3:
                     c=a*b;
                     System.out.println("Multiplication of A and B:-" +c);
                     break; 
            case 4:
                     c=a/b;
                     System.out.println("Division of A and B:-" +c);
                     break;       
            default:
                    System.out.println("Enter correct choice");        
        }
        

    }
}
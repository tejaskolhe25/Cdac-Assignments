import java.util.Scanner;
public class Que18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();
        System.out.println("enter a choise");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        int c=sc.nextInt();
        switch (c) {
            case 1:
                System.out.println ("addition of two number  "+ (a+b));
                break;
            case 2:
                System.out.println ("subtracrion of two number  "+ (a-b));
                break;
            case 3:
                System.out.println ("multiplcation of two number  "+ (a*b));
                break;
            case 4:
                System.out.println ("division of two number  "+ (a/b));
                break;
            
        
            default:
                break;
        }


    }
    
}

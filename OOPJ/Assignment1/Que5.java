import java.util.Scanner;
class Que5{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Char");
        char ch= sc.next().charAt(0);

        if( ch == 'a' || ch == 'e'  || ch == 'i'  || ch == 'o'  || ch == 'u'  || ch == 'A'  || ch == 'E'  || ch == 'I'  || ch == 'O'  || ch == 'U'  ){
            System.out.println("It's Vowel");
        }
        else{
            System.out.println("Not Vowel");
        }
        

    }
}
import java.util.Scanner;
class Que6{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Weight in KG");
        float weight= sc.nextFloat();

        System.out.println("Enter Height in meters");
        float height= sc.nextFloat();

        float BMI;

        BMI = weight / (height*height);

        if( BMI < 18.5 ){
            System.out.println("Under Weight");
        }
        else if( BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal");
        }
        else if( BMI >= 25 && BMI <= 29.9){
            System.out.println("Over weight");
        }
        else if( BMI >= 30 && BMI < 35){
            System.out.println("Class I Obesity");
        }
        else if( BMI >= 35 && BMI < 40){
            System.out.println("Class II Obesity");
        }
        else{
            System.out.println("class III obesity");
        }
        

    }
}
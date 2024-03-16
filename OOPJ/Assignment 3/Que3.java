class Que3{
    public static void main(String[] args){
        int a=2;
        float b=2.30f;
        double c = 2.30;

        // Narrowing
        int result1 = (int)(a+b+c);
        System.out.println(result1);

        // Narrowing And Widening
        float result2=(float)(a+b+c);
        System.out.println(result2);

        // Widening
        double result3=(double)(a+b+c);
        System.out.println(result3);
    }
}
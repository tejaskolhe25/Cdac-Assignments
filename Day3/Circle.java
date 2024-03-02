public class Circle {
    int radious;

    
    void assign(int r){
        radious=r;
        area();
        circumference();

    }

    void area(){
      System.out.println("area of circle is "+3.14*radious*radious);

    }
    void circumference(){
        System.out.println("circumference of circle is "+2*3.14*radious);

    }


    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.assign(10);



    }
    
}

public class Person {
    float height;
    int weight;
    int age;

    Person(float h,int w, int a)
    {
        height=h;
        weight=w;
        age=a;
        display();

    }
    Person(){
        height=5.9f;
        weight=65;
        age=24;
        display();
    }

    void display(){
        System.out.println("p1"+height+" "+weight+" "+age);

    }



    public static void main(String[] args) {

        Person p1=new Person(5.8f,60,23) ; 
        Person p2=new Person();
     }
    
}

class Person{
int height;
int weight;
int age;

Person(int h,int w,int a){
	height=h;
	weight=w;
	age=a;
}
Person(){
	weight=70;
	height=180;
	age=35;
	
}
void display(){
	System.out.println("weight"+weight);
	System.out.println("height"+height);
	System.out.println("age"+age);
}


public static void main(String args[]){
	Person p1=new Person(60,170,22);
	Person p2=new Person();
	p2.display();
	p1.display();
	
	
}
}
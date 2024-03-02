class Vehicle{
 long price;
 String color;
 String model;
 
 
 Vehicle(long p,String c,String m){
	 price=p;
	 color=c;
	 model=m;
	 
 }
 void display(){
	 System.out.println("model of vehical"+""+ model);
	  System.out.println("color of vehical"+""+ color);
	   System.out.println("price of vehical"+""+ price);
 }


public static void main(String []args){
	Vehicle v1=new Vehicle(6000000,"black","fortuner");
	v1.display();
		
}
}
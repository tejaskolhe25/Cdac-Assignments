class Box{
 float height;
 float width;
 float breadth;
 float volume;
 float area;
 
 
 
 Box(float h1,float w1,float b1){
	 height=h1;
	 width=w1;
	 breadth=b1;
	 
	 getArea();
	 getVolume();
	 
	 
	 
 }
 void getVolume(){
	 volume=height*width*breadth;
	 System.out.println("volume of box" + volume);
	 
 }
 void getArea(){
	 area=height+width+breadth;
	 System.out.println("area of box"+ area);
	 
	 
 }
 
 
 
 public static void main(String[]args){
	 System.out.println("area of box 1");
	 Box b1=new Box(10,20,30);
	  System.out.println("area of box 2");
	 
	 Box b2=new Box(11,22,30);
 }
}
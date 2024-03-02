class Room{
  int height;
  int width;
  int breath;
  int area;
  
   void volume(int h, int w, int b){
	   height=h;
	   width=w;
	   breath=b;
	   area=height*width*breath;
	   System.out.println("volume of room"+area);
	   
	   
	   
	   
   }
   public static void main (String [] args){
	    
		Room v1=new Room();
		v1.volume(2,3,4);
	   
	   
	   
   }
   
   
   
   


}
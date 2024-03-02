public class Box {
    int height;
    int width;
    int breadth;

    Box(int h,int w,int b){
        height=h;
        width=w;
        breadth=b;
        getarea();
        getvolume();
      }

      void getvolume(){

        System.out.println("volume of box is "+height*width*breadth);

      }
     void getarea(){
      System.out.println("area of box is"+(height+width+breadth));
     }
    
        public static void main(String[] args) {
            System.out.println("area and volume of box1");
        Box b=new Box(3,4,5);
        System.out.println("area and volume of box2");
        Box b1=new Box(3,3,3);
        b1.getarea();


        
    } 
}

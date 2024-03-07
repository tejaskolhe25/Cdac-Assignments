package Day5;

public class Que5 {
    public static void main(String[] args) {
    int arr[]={5,3,9,7,1};
    int max1=0;
    int max2=0;
    for(int i=1;i<arr.length;i++){
        if(max1<arr[i]){
            max2=max1;
            max1=arr[i];
        }
        if((max2<arr[i]) && (max1>arr[i])){
            max2=arr[i];
        }
        
    }
    System.out.println("max1:-"+max1);
    System.out.println("max2:-"+max2);
   
    
}
}
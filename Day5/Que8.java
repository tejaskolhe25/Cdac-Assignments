package Day5;

public class Que8 {
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,4,4,5};
        // int temp[]=new int[arr.length]arr
        int i,j=0,k;
        for( i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
                

            }
        }
        arr[j]=arr[arr.length-1];
        for(k=0;k<j+1;k++){
            System.out.print(arr[k]);
        }
    }
}

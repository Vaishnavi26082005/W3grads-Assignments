public class rotateArray {
    static void rotateArr(int arr[], int d, int n) {
        
        // add your code here
          d=d%n;
         reverse(arr,0,n-1);
         reverse(arr,0,n-d-1);
           
         reverse(arr,n-d,n-1);
       
    }
    static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}

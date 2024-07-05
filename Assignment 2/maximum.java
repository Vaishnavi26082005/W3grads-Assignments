public class ThirdMaxnum {
    

 
    public int thirdMax(int[] arr) {
        long max=Long.MIN_VALUE;
        long maxS=Long.MIN_VALUE;
        long maxT=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max ){
                maxT=maxS;
                maxS=max;
                max=arr[i];
            }
            else if( max>arr[i] && arr[i]>maxS){
                maxT=maxS;
                maxS=arr[i];
            }
            else if(maxS>arr[i] && arr[i]>maxT){
                maxT=arr[i];
            }
        }
        return maxT==Long.MIN_VALUE  ?(int)max:(int)maxT;
    }
}

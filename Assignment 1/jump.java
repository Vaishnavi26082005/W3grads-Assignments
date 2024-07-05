 
public class JumpGame{   
        static int minJumps(int[] arr, int n) {
             if(n==1) return 0;
             if(arr[0]==0) return -1;
            
             int max=arr[0];
             int steps=arr[0];
             int count=1;
             for(int i=1;i<n;i++){
                 if(i==(n-1)) return count;
                 max=Math.max(max,i+arr[i]);
                 steps--;
                 if(steps==0){
                     count++;
                 
                 if(i>=max) return -1;
                 steps=max-i;
                 }
             }
             return -1;
            
        }
        
    }

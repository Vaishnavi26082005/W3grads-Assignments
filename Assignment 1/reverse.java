class Solution {
    public int reverse(int x) {
        long out=0;
        while(x!=0){
            int rem=x%10;
            out=out*10+rem;
            x=x/10;
        }
         
         if(out>Integer.MAX_VALUE || out<Integer.MIN_VALUE){
             return 0;
         } 
         if(x<0){
             return(int)(-1*out);
         }
         return (int)out;
    }
}

public class armstrong {
    
        static String armstrongNumber(int n){
             
            int len=(int)Math.log10(n)+1;
            int x=n;
            long sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=Math.pow(rem,len);
                n=n/10;
            }
            if(sum==x) return "Yes";
            return "No";
        }
    }

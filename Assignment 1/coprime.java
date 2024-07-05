public class MakeCo  {
    int countCoPrime(int a[], int n)
        {
            
            int c=0;
            for(int i=0;i<n-1;i++){
                if(gcd(a[i],a[i+1])!=1){
                    c++;
                }
            }
            return c;
        }
        int gcd(int a,int b){
                while(a!=0){
                    if(a>b) a=a%b;
                    else{
                        int temp=a;
                        a=b%a;
                        b=temp;
                    }
                }
                return b;
        }
    }
    

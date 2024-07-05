public class PlaindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int co=x;
        int out=0;

        while(x!=0){
            int rem=x%10;
            out=(out*10)+rem;
            x=x/10; 
        }
    if(co==out){
        return true;
    }
    else{
        return false;
    }

    }
}

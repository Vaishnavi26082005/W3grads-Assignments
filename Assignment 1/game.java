import java.util.*;
public class GameWithintegers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    String ans=n%3==0?"Second":"First";
    System.out.println(ans);
}
sc.close();
}
}

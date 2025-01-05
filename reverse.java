import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int soc=0;
        int ans = 0;

        while(n>0){
            soc=n%10;
            ans=ans*10;
            ans=ans+soc;
            n=n/10; 
        }
        System.out.println(ans);
         
    }
}
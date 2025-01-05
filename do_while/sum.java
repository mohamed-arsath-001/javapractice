import java.util.*;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        int i=1;
        int Soe=0;
        int Soo =0;
        int n=sc.nextInt();

        do{
            if(i%2==1){
                Soe+=i;
                // i++;
            }
            else{
                Soo+=i;
                // i++;
            }
            i++;

        } while(i<=n);
        System.out.println("sum of odd ="+Soo);
        System.out.println("sum of even ="+Soe);
    }
}
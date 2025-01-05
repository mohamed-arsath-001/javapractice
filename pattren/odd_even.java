import java.util.*;
public class odd_even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int zero=0;
        char s;
        int pos=0;
        int neg=0;
        
        do{
            int n=sc.nextInt();
            if(n>0){
                pos+=n;
                
            }
            else if(n<0){
                neg+=n;
                
            }
            else{
                zero+=n;
            }
            
            System.out.println("do you wish to continue:");
            s=sc.next().charAt(0);
        } while(s=='y'|| s=='Y');
        System.out.println("sum of positive ="+pos);
        System.out.println("sum of negative ="+neg);
        System.out.println("sum of zero ="+zero);
    }
}

        

    

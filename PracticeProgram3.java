package digitmanipulatiion;
import java.util.*;
public class PracticeProgram3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int digits=1; 
        int tval=0;
        int original=a;// As a changes each time we dont get correct value when a compared with tval
        while(a>0)
        {
            digits=a%10;//gives the last value
            int fact=1;
            for(int i=1;i<=digits;i++)
            {
                fact*=i;
            }
            tval+=fact;//factorial added with other fact
            a=a/10;//updates a value getting next digit of the number
        } 
        if (tval==original)//So compares with the original value
        {
            System.out.print("Strong number");
        }
        else
        {
            System.out.print("not Strong number");
        }
      }
        
    }
    


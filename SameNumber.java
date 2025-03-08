package digitmanipulatiion;
import java.util.*;

import javax.sql.rowset.spi.SyncFactory;
public class SameNumber {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int fnum=n%10;
        int digits;
        boolean val=true;
        while(n>0)
        {
            digits=n%10;//default get the last digit
            if(digits!=fnum)
            {
                val=false;
                break;
            }
            n=n/10;//default removes last digit\
            
        } 
        System.out.println(val);

        
    }     
}



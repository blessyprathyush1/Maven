import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
 class gift
 {
	   public void sorted(String choco[])
	   {
	       int len=choco.length,min;
		   int i,j,k;
	       for(i=0;i<len-1;i++)
		   {
	            min=i;
	            for(j=i+1;j<choco.length;j++)
				{
	        	  if(Integer.parseInt(choco[min])>Integer.parseInt(choco[j]))
	        		             min=j;
	            }
	            String t=choco[i];
	            choco[i]=choco[j];
	            choco[j]=t;
	        }
            for(k=0;k<len-1;k++)
	            System.out.println(choco[k]);
	   }
}
//Sweets class for counting sweets
 class  Sweets
 {
	    public void totalsweets(String sweets[]) 
	    {
	        System.out.println("Sweets present are :"+(sweets.length));
	    }
}

//sum of remaining sweets and chocolates
 class Weight_of_Sweets
 {
	    public void weightofsweets(String  choco[], String  sweets[]) 
	    {
	         System.out.println("Weight of the rest:"+(choco.length+sweets.length));
	    }
 }

//main method
public class Gift
{
   	public static void main(String args[])
   	{
    	Scanner s = new Scanner(System.in);
   	    int n,c1,c2,i;
	    String choco[] = new String[5];
	    String sweets[] = new String[5];
	    c1=s.nextInt();
	    for(i=0;i<c1;i++)
		 {
	       System.out.print("Enter chocolates name:");
	       choco[i]=s.next();
	     }
	    System.out.print("Enter chocolates count:");
	    c2=s.nextInt();
   	    for(i=0;i<c2;i++)
	    {
	        System.out.print("Enter Candy name:");
	        sweets[i]=s.next();
	    }
	    gift g=new gift();
  	    g.sorted(choco);
  	    Sweets sw=new Sweets();
	        sw.totalsweets(sweets);
		Weight_of_Sweets ws=new Weight_of_Sweets();
   	        ws.weightofsweets(choco, sweets);
	 }
}
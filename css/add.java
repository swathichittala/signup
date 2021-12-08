import java io.*;
import java util.*;
class add{
public static void main(String args[])
{
    int n,i;
    Scanner s=new Scanner(System.in);
    int a[]=new int[20];
    int b[]=new int[20];
    int c[]=new int[20];
    System.out.println("enter size");
    n=s.nextInt();
    for(i=0;i<n;i++)
    {
        a[i]=s.nextInt();

    }
    for(i=0;i<n;i++)
    {
        b[i]=s.nextInt();
        
    }
    for(i=0;i<n;i++)
    {
        c[i]=a[i]+b[i];
    }
    System.out.print("addition is"+c[i]);

}
}

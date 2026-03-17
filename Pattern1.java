import java.util.*;
public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter limit");
        int a=ob.nextInt();
        System.out.println("\f");
        int i,j,t=1;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");                
            }
            System.out.println();
        }
    }
}
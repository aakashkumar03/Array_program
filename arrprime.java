import java.util.Scanner;
class arrprime
{
    public static int test( int num[]) 
    {
        int prime=0;
        for(int i=0;i<num.length;i++)
        {
            int count=0;
            for(int j=2;j<=num[i]-1;j++)
            {
            if(num[i]%j==0)
                {
                    count++;
                }  
            }
        if(count==0)
        {
            prime++;
        }  
    }
    System.out.println("Total no of prime number are ");
        return prime ;
    }
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int size=Sc.nextInt();
        int[]n1=new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<=size-1;i++)
        {
            n1[i]=Sc.nextInt();
        }
        System.out.println(test(n1));
        Sc.close();
    }
}
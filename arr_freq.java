import java.util.Scanner;
class arr_freq
{
    public static int test(int[] num,int key) 
    {
        int count =0;
        for(int i=0;i<=num.length-1;i++)
        {
            if(num[i]==key)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int size=Sc.nextInt();
        System.out.println("Enter key");
        int key=Sc.nextInt();
        int[]n1=new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<=size-1;i++)
        {
            n1[i]=Sc.nextInt();
        }
        System.out.println("Frequency of key is ");
       System.out.println( test(n1,key));
        Sc.close();
    }
}
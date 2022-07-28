import java.util.Scanner;
class arr_avg
{
    public static int test(int[] num) 
    {
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
          sum=num[i]+sum;
        }
        int avg=sum/num.length;
            return avg;   
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
        System.out.println("Avg of element is ");
        System.out.print(test(n1));
        Sc.close();
    }
}
import java.util.Scanner;
class arr_avgExc
{
    public static int test(int[] num) 
    {
        int max=num[0];
        int min=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
            if(num[i]<min)
            {
                min=num[i];
            }
        }
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
          sum=num[i]+sum;
        }
        sum=sum-(max+min);
        int avg=sum/(num.length-2);
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
        System.out.println("Avg of element is excluding max and min value ");
        System.out.print(test(n1));
        Sc.close();
    }
}
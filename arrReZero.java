import java.util.Scanner;
class arrReZero
{
    public static void test(int[] num) 
    {
        int zero=0;
        for (int i=0;i<num.length;i++)
        {
            if(num[i]==0)
            {
                zero++;
            }
        }
        int[] res = new int[num.length-zero];
        int x=0;
        for(int j=0;j<num.length;j++)
        {
            if(num[j]!=0)
            {
                res[x]=num[j];
                x++;
            }
        }
        for(int r=0;r<res.length;r++)
        {
        System.out.print(res[r]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int size=Sc.nextInt();
        int[]n1=new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<=size-1;i++)
        {
            n1[i]=Sc.nextInt();
        }
        System.out.println("Filter Element");
        test(n1);
        Sc.close();
    }
}
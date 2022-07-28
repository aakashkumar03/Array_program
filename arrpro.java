import java.util.Scanner;
class arrpro
{
    public static int test(int[] num) 
    {
        int pro=1;
        for(int i=0;i<num.length;i++)
        {
            pro=pro*num[i];
        }
        return pro;
        
        
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
        System.out.println(test(n1));
        Sc.close();

    }
}
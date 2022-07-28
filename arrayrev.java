import java.util.Scanner;
class arrayrev
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=Sc.nextInt();
        int[] n1 = new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size;i++)
        {
            n1[i]=Sc.nextInt();
        }
        Sc.close();
        test(n1);
    }
    public static void test(int[] num)
    {
        int[] res =new int [num.length];
        int k=0;
        for(int i=num.length-1; i>=0;i--)
        {
            res[k]=num[i];
            k++;
        }

        for(int j=0; j<=res.length-1;j++)
        {
            System.out.print(res[j]+" ");

        }
    }
}
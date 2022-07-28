import java.util.Scanner;
class arrayentry
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

        for(int i=0; i<=num.length-1;i++)  //copy
        {
            res[i]=num[i];
        }
        for(int j=0; j<=num.length-1;j++)     //printing result
        {
            System.out.println(res[j]+"");

        }
    }
}
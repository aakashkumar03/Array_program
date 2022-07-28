import java.util.Scanner;
class arrayevenoddin
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
        int even=0;
        int odd=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                even++;
            }else{
                odd++;
            }
        }
        int[] even_arr =new int [even];
        int[] odd_arr =new int [odd];
        int x=0;
        int y=0;
        for(int i=0; i<=num.length-1; i++)
        {
            
            if(num[i]%2==0)
            {
                even_arr[x]=num[i];
                x++;
            }
            else{
                odd_arr[y]=num[i];
                y++;
            }
        }
        System.out.println("even position");
        for(int j=0; j<=even_arr.length-1;j++)
        {
           
            System.out.println(even_arr[j]+" ");
            
        }
        System.out.println("odd position");
        for(int k=0; k<=odd_arr.length-1;k++)
        {
            
            System.out.println(odd_arr[k]+" ");
            
        }
    }
}
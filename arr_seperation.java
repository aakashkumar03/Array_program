import java.util.Scanner;
class arr_seperaton
{
  int count=0;
  int[] res = new int[count];
    public static void test (int num) 
    {
      
      
      while(num>0)
      {
        num=num%10;
        int rem=num;
        if(rem!=0)
        {
            // count++;
        }
        
        num=num/10;
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
        // System.out.println(test(n1));
        // test(n1);
        Sc.close();

    }
}
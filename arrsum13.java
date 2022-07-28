import java.util.Scanner;
class arrsum13
{
    public static int sum13(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++)
        {
          if(nums[i]!=13)
          {
            sum=sum+nums[i];
          }
          else
          {
            i++;
          }
        }
        return sum;
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
        // sum13(n1);
        System.out.println(sum13(n1));
        Sc.close();
    }
}
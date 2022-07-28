//left shifting array by p number of index
import java.util.Scanner;
class left_shift
{
    public static int[] shift(int [] nums,int p ) {
        System.out.println("Initial array");
        print(nums);
        for(int k=1;k<=p;k++){
            int first=nums[0];
            for(int i=0;i<nums.length-1;i++){
                nums[i]=nums[i+1];
            }
            nums[nums.length-1]=first;
        }
        System.out.println();
        System.out.println("Result array is");
        print(nums);
        return nums;
    }

    public static void print(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int size=Sc.nextInt();
        int[]n1=new int[size];
        System.out.println("Enter array element");
        for(int i=0;i<=size-1;i++){
            n1[i]=Sc.nextInt();
        }
        System.out.println("Enter no of times to shift");
        int shft =Sc.nextInt();
        shift(n1,shft);
        Sc.close();
    }
}
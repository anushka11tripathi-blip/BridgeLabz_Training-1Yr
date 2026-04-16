import java.util.*;
public class practice {
    static Scanner sc=new Scanner(System.in);
    public static void Question1_RemoveDuplicates(){
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        System.out.println("Enter your list length: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter your element "+(i)+": ");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println("Your list: "+list);
        for(int l:list){
            set.add(l);
        }
        System.out.println("Your set: "+set);
    }

    public static void Question2_FriendlyNums(){
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        System.out.println("Enter your num1: ");
        int n1=sc.nextInt();
        System.out.println("Enter your num2: ");
        int n2=sc.nextInt();
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                list1.add(i);
            }
        }
        for(int i=1;i<n2;i++){
            if(n2%i==0){
                list2.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        int sum1=0;
        int sum2=0;
        for(int n:list1){
            sum1+=n;
        }
        for(int n:list2){
            sum2+=n;
        }
        System.out.println("Sum 1: "+sum1);
        System.out.println("Sum 2: "+sum2);

        if(n1%sum1==0&&n2%sum2==0){
            System.out.println("Yes, They are friendly");

        }else{
            System.out.println("No, They are not firendly");
        }
    }

    public static void Question3_replace0s(){
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        int original=num;
        int size=0;
        while(num!=0){
            size++;
            num/=10;
        }
        int[]arr=new int[size];
        for(int i=size-1;i>=0;i--){
            int rem=original%10;
            arr[i]=rem;
            original/=10;
        }

        int[]arr2=new int[arr.length];
        for(int i=0;i< arr2.length;i++){
            if(arr[i]==0){
                arr[i]=1;
            }
        }
        System.out.println();

        int newnum=0;
        for(int n:arr){
            newnum=newnum*10+n;
        }
        System.out.println(newnum);
    }
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        int limit=(int)Math.sqrt(n);
        for(int i=2;i<=limit;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Question4_FindPrime(){
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }

    
    public static void main(String[] args) {
        Question4_FindPrime();

    }

}
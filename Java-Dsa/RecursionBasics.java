public class RecursionBasics{
    public static void PrintDec(int n){
        //Program to Print numbers from n to 1 (Decresing order)
        //n=10 10,9,8,7,6,5,4,3,2,1

        if(n == 1){
            System.out.println(n);
            return;
        }
         
        System.out.print(n+" ");
        // PrintDec(n-1);

    }
    public static void PrintInc(int n){
        //Program to print numbers from 1 to n (Increasing Order)
        // n =10 1,2,3,4,5,6,7,8,9,10
        if( n == 1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n+" ");
    }
    public static int Fact(int n){
        //Program to find fact of N 
        //Fact is 5*4*3*2*1 =120
        //factorial of 1 and 0 is always 1
        //To solve the program we take condition first if our n is eql to 0 then return 1 because fact
        //of  0 is 1  //in recursion we calulate for small value then then large value such as
        //for the factorial of 5 we calculate first fact of 4 then multiply by 5*4

        if(n==0){
            return 1;
        }
        int fnm1 = Fact(n-1);
        int fn= n*fnm1;
        return fn;
    }
    public static int CalSum(int n){
        //Program to Calculate First natural numbers.
        //natural numbers are 1,2,3,4,,5,6,7,8,9

        if(n == 1){
            return 1; 
        }
        int Snm1 =CalSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }
    public static int Fib(int n){
        //Program to calculate nth term of Fibonacci number
        // 0 1 1 2 3 5 8 13 21 this is the fibonacci series 
        //fibnacci series is like the sum of number and their adjacent number 
        //ex 0 + 1 =1 + 1 =2 + 3 =5 +8 =13 + 21
        if( (n==0)||(n==1)){
            return n;
        }
        int Fibnm1 = Fib(n-1);
        int Fibnm2 = Fib(n-2);
        int Fibn   = Fibnm1+ Fibnm2;
        return Fibn;
    }
    public static boolean isSorted (int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
    }


    public static void main(String[] args) {

        int arr [] ={1,2,3,4,5,6,7,8};
        isSorted(arr, 1);

        // System.out.println(Fact(n));
        // System.out.println(CalSum(n));
        // System.out.println(Fib(n));




    }
}
package com.generics;

public class GenericsPractice {

public static<T> void swap(T a, T b){
System.out.println("Before swapping: "+a+" "+b);
T temp = a;
a = b;
b = temp;
System.out.println("After swapping: "+a+" "+b);
}
public static<T> void fibo(T n){
// int num = Integer.parseInt(n.toString()); int num = Integer.parseInt(n.toString());
int a = 0, b =1;
System.out.println(a+"\n"+b);
for (int i =0; i<num; i++ ){
int sum = a+b;
System.out.println(sum);
a = b;
b = sum;
}

}
public static void main(String[] args) {
swap(11,22);
swap("aa","bb");
fibo(5);

}
}
public static <T extends Number> void fiboo(int n) {
    int a = 0, b = 1;

    if (n <= 0) return;

    System.out.println(a);
    if (n == 1) return;

    System.out.println(b);

    for (int i = 2; i < n; i++) {
        int sum = a + b;
        System.out.println(sum);

        a = b;
        b = sum;
    }
}
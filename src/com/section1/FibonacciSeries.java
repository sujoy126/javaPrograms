package com.section1;

// Something wrong

public class FibonacciSeries {
	public static int fib(int n)
{
    if (n==0)
        return 0;
  else if(n==1 || n==2)
        return 1;
    return fib(n - 1) + fib(n - 2);
}

public static void main(String args[])
{
    int n = 9;
    System.out.println(fib(n));
}
	

}

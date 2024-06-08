package com.examQuestions;

public class Counter {
	static int count = 0;
	 

    public Counter() {
        count++;
    }
 
    // Method to get the current count
    public static int getCount() {
        return count;
    }
 
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
 
        // Displaying the count
        System.out.println("Count is: " + Counter.getCount()); 
    }

}

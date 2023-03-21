package Inheritance;

public class Student extends person {
	void fun() 
    { 
        System.out.print("student class"); 
    } 
    void display() 
    { 
        fun(); 
        super.fun(); 
    } 
}
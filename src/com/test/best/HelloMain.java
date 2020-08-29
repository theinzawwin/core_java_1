package com.test.best;

public class HelloMain {

	public static String phoneNumber="092343434";
	
	public static void main(String[] args) {
		/*String name="Best & Bright Institute";
		String std_name="Zaw Zaw";
		int age=21;
		double salary=900000;
		double tax=salary*0.03;
		System.out.println("Student Information");
		System.out.println("Name is "+std_name);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+salary);
		System.out.println("Tax Amount is "+tax);
		System.out.println("Training Name is "+name);
		Student std=new Student();
		System.out.println("University Name is "+std.uni_name);
		*/
		/*CalculatorMaster cm=new CalculatorMaster();
		int sum_result=cm.sum(5, 7);
		int minus_result=cm.minus(10, 2);
		System.out.println("Sum Result is "+sum_result);
		System.out.println("Minus Result is "+minus_result);
		*/
		
		//Looping
		/*int num=10;
		while(num>0) {
			System.out.println("Number is"+num);
			num=num-2;
		}
		*/
		
		/*
		for(int x=10;x<=20;x=x+1) {
			System.out.println("Value of "+x);
		}
		*/
		/*int i=10;
		do {
			System.out.println("Value of "+i);
			i--;
		}while(i>0);
		*/
		
		/*int age=16;
		if(age>18) {
			System.out.println("Your age is over "+18);
		}else {
			System.out.println("You are young");
		}
		*/
		 /*int number=12;  
		    //Check if the number is divisible by 2 or not  
		    if(number%2==0){  
		        System.out.println("even number");  
		    }else{  
		        System.out.println("odd number");  
		    }  
		    */
		   /* int year=2020;    
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println("LEAP YEAR");  
		    }  
		    else{  
		        System.out.println("COMMON YEAR");  
		    }  
		    */
		    /*int num=13;    
		    //Using ternary operator  
		    String output=(num%2==0)?"even number":"odd number";    
		    System.out.println(output);  
		    */
		checkMark();
		    
	}
	
	public void displayMessage() {
		System.out.println("Hello Welcome");
	}
	
	public static void checkMark() {
		 int marks=70;  
	      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
	}
}

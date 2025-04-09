package testingGit;

//import java.util.Scanner;


public class TestGitClass {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		//Arithmetic
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));

		//assignement operators
		int c=10;
		c += 5;
		System.out.println("c +="+ c);
		c -= 3;
		System.out.println("c -="+ c);
		c *= 2;
		System.out.println("c *="+ c);
		c /= 4;
		System.out.println("c /="+ c);
		c %= 5;
		System.out.println("c %="+ c);
		
		//Relational operator/ comparision operator
		
		System.out.println("Relational");
		
		System.out.println("a==b:"+ (a==b));
		System.out.println("a!=b:"+ (a!=b));
		System.out.println("a<b:"+ (a<b));
		System.out.println("a>b:"+ (a>b));
		System.out.println("a<=b:"+ (a<=b));
		
		// logical operators:
		System.out.println("Logical-------");
		System.out.println("a>5 && b>10:"+ (a>5 && b<10));
		System.out.println("a>5 && b>10:"+ (a>5 || b>10));
		System.out.println("!(a==b):"+ !(a>b));
		
		//Unary operators:
		int x=10;
		System.out.println("x:"+x);
		System.out.println("++x:"+ (++x));
		System.out.println("++x:"+ (x++));
		System.out.println("x:"+x);
		System.out.println("--x:"+ (--x));
		System.out.println("x--:"+ (x--));
		System.out.println("x:"+x);
		System.out.println("x:"+x);
		
		

}
}
	

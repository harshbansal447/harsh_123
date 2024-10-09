import java.util.*;
public class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
int a=sc.nextInt();
System.out.print("Enter a number");
int b=sc.nextInt();
System.out.println("Enter value between 1 to 4");
int c=sc.nextInt();

if(c==1){
	int val = sum(a,b);
	System.out.print(val);
	
}
if(c==2){
	int val=sub(a,b);
	System.out.print(val);
}
if(c==3){
	int val=mul(a,b);
	System.out.print(val);
}
if(c==4){
	int val=div(a,b);
	System.out.print(val);
}
}
public static int sum(int a,int b){
	int res=a+b;
	return res;
	
	
}
public static int sub(int a,int b){
	int res=a-b;
	return res;
	
}
public static int mul(int a,int b){
	int res=a*b;
	return res;
}
public static int div(int a,int b){
	int res=a/b;
	return res;
}
}


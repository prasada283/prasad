import java.util.Scanner;
class Demo{
public void displayMenu()
{
System.out.println("add+:");
System.out.println("sub-:\n mul*:");
System.out.println("div/");
}
public void add(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);}
public int sub(int a,int b)
{
int res=a-b;
//System.out.println(a+"+"+b+"="+res);
return res;
}
public int input()

{
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
class Test{
public static void main(String arga[]){
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}}}

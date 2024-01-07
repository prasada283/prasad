import java.util.Scanner;
class Demo1
{
public int[] input()
{                                                                                                                                    
Scanner sc=new Scanner(System.in);                                                                   
int temp=sc.nextInt();
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("please type"+n+"Integers:");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
return arr;
}
public int  add(int[] a)//with arguments and  return value
{
int  sum=0;
for( int i=0;i<a.length;i++)
{
sum +=a[i];
}
return sum;
}
}
class Test4
{ 
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Demo1 d=new Demo1();
int[] array=new int[5];
array=d.input();
int res=d.add(array);
System.out.println(res); 
}
}
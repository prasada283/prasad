import java.util.Scanner;
class Demo{
public long calculateFactorial(int n)
{ long res=1;
if( n== 0)return 1;
else{for(int i=1;i<=n;i++){res=res*i;}
return res;
//return n*calculateFactorial(n-1);
}}}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo ob=new Demo();
System.out.println(ob.calculateFactorial(p));
}
}
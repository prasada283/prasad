import java.util.Scanner;
class ArraystoMethod{
public int max(int[] array){
int max=array[0];
for(int i=0;i<array.length;i++)
{
if(array[i]>max){
max=array[i];
}
}
return max;
}
public int min(int[] array){
int min=array[0];
for(int i=0;i<array.length;i++){
if(array[i]<min){min=array[i];}
}
return min;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("entere the size of array");
int size=sc.nextInt();
int[] myarray=new int[size];
System.out.println("enter elements:");
for(int i=0;i<size;i++){
myarray[i]=sc.nextInt();}
ArraystoMethod  m =new ArraystoMethod();
System.out.println("max val in array"+m.max(myarray));
System.out.println("min val in array"+m.min(myarray));}}

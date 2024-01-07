import java.util.Scanner;
class Tranier{
private int tid;
public void setTid(int tid){this.tid=tid;}
public int getTid(){return this.tid;}
public Tranier(int tid){this.tid=tid;}
public Tranier()
{this.tid=0;}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Trainer[] =new Trainer[5];
for(int i=0;i<5;i++){ob[i]=new Trainer();
System.out.println("Enter teacher id: ");
int tidin=sc.nextInt();
}
for(int j=0;j<5;j++){
Tranier ob1=new Tranier(tidin);

System.out.println("tid: "+ob1.getTid());
}}}
}
// ob[i] = new Trainer();
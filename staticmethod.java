class Student{
int rollno;
String name;
static String college="its";
static void change(){
college="mtiet";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class St{
public static void main(String args[]){
Student s1=new Student(1,"pr");
Student s2=new Student(2,"re");
s1.display();
s2.display();
Student.change();
Student s3=new Student(3,"jaysad");
s1.display();
s2.display();
s3.display();
}}

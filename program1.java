class Student{
int rollno;
String name;
static String college="its";
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
Student.college="mtiet";
s1.display();
s2.display();
}}

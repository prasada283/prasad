class Person{
int id;
String name;
Person(int id,String name){
this.id=id;
this.name=name;
}}
class Emp extends Person{
float salary;
Emp(int id,String name,float salary){
super(id,name);
this.salary=salary;
}
void display(){
System.out.println(id+" "+name+" "+salary);}
}
class TestSuper5{
public static void main(System args[]){
Emp e1=new Emp(1,"prasad",5400f);
e1.display();}}
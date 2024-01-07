class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program{
public static void main(String args[]){
Student[] ob=new Student[3];
ob[0].setId(111);
ob[0].setName("test");
System.out.println("Id:"+ob[0].getId());
System.out.println("name:"+ob[0].getName());
ob[1].setId(23432);
ob[1].setName("itz me");
System.out.println("id:"+ob[1].getId());
System.out.println("name::"+ob[1].getName());
ob[2].setId(24424);
ob[2].setName("kewgfegw");
System.out.println("id:"+ob[2].getId());
System.out.println("Name:"+ob[2].getName());
}}



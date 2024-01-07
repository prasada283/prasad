class Author
{
String authorname;
int age;
String place;
Author(String name,int age,String place){
this.authorName=name;
this.age=age;
this.place=place;
}
class Book{
String name;
int price;
Author auther;
Book(String n,int p,Author auther){
this.name=n;
thos.price=p;
this.author=auther;
}
class Main{
public static void main(String args[]){
Author auther=new Author("jhonny",42,"usa");
Book b=new Book("java for beg",800,"author");
System.out.println("book name:"+b.name);
System.out.println("book price:"+b.price);
System.out.println(".............author details..................");
System.out.println("author name:"+b.auther.authorname);
System.out.println("author age:"+b.auther.age);
System.out.println("author place:"+b.auther.place);
}
}}
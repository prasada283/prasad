class Animal{
void eat(){
System.out.println("eating");}
}
class Dog extends Animal{
void bark(){System.out.println("barking......");
}}
class Baby extends Dog{void weep(){Sysyem.out.println("weeping...");}}
class TestInheritance{
public static void main(String args[]){
Baby d=new Baby();
d.bark();
d.eat();
d.weep();
}}

//inheritance------extend
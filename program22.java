class Animal{
void eat(){
System.out.println("i can eat");
}
}
class Dog extends Animal{
public void eat(){
System.out.println("i eat dog food");
}

//class Cat extends Animal
public void bark(){
System.out.println("i can bark");
}
}
class Test{
public static void main(String args[]){
//Cat c=new Cat();
Dog labrador=new Dog();
labrador.eat();
labrador.bark(); 
/*c.meow();
c.eat();
Dog d=new Dog();
d.bark();
d.eat();*/
}}
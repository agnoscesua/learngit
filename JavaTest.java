package com.alibaba;
import java.util.*;
/*public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World!");
        System.out.println(2+3);
	}
}*/

class Animal{
	public int age=20;
	public Animal(){
		System.out.println("父类构造方法");
	}
	void eat(){
		System.out.println("父类成员方法");
	}
}
class Dog extends Animal{
	public int age=10;
	public Dog(){
		System.out.println("子类构造方法");
	}
	void eat(){
		System.out.println("子类成员方法");
	}
}
class Cat extends Animal{
	
}
public class JavaTest{
	public static void main(String[] args) {
		
		Animal animal = new Dog();//自动类型提升 向上类型转换
		Dog dog2=(Dog)animal;
		if (animal instanceof Cat) {
			Cat cat=(Cat)animal;
		}else {
			System.out.println("无法进行类型转换");
		}
	}
}

/*class Animal{
	public void speak() {
		System.out.println("Animal speak...");
	}
}	
class Dog extends Animal{
	public void speak(){
		System.out.println("dog");
	}
}
class Cat extends Animal{
	public void speak(){
		System.out.println("cat");
	}
}
public class Test{
	public static void main(String[] args) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		makeSpeak(dog);
		makeSpeak(cat);
	}
	public static void makeSpeak(Animal animal){
		animal.speak();
	}
}*/

/*public class JavaTest{
	public static void main(String[] args) {
		System.out.println("请问您想知道第几项: ");
		Scanner scanner=new Scanner(System.in);
		int i=scanner.nextInt();
		System.out.println("Fibonacci数列第"+i+"项是："+fib(i));
	}
	static long fib(int n){
		if(n<=2){
			return 1;
		}else {
			return (fib(n-1)+fib(n-2));
		}
	}
}*/


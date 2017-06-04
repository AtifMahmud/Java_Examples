/**
 * Simple program to understand the concept of inheritance
 * 
 * @author Atif Mahmud
 * Date: 3rd June, 2017
 */

public class Main {
	public static void main(String[] args){
		//Bird.sayHello();
		//Sparrow.sayHello();
		//Bird.privateMethod(); NOT VISIBLE
		//System.out.println(Bird.privateField); NOT VISIBLE
		//Sparrow.wingFlap();
		
		Bird MyBird = new Bird();
		Bird MyChidiya = new Sparrow();
		NewClass.polymorphicArgMethod(MyBird);
		NewClass.polymorphicArgMethod(MyChidiya);
		
		System.out.print("\n\n\n");
		
		Bird BirdArray[] = new Bird [4];
		BirdArray[0] = new Sparrow();
		BirdArray[1] = new Bird();
		BirdArray[2] = new Sparrow();
		BirdArray[3] = new Bird();
		
		for (Bird b : BirdArray){
			b.sayHello();
		}
		
	}
	
	
	
}

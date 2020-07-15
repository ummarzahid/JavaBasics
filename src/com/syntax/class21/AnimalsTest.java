package com.syntax.class21;

public class AnimalsTest {

	public static void main(String[] args) {

		// object of parent class has an access to all var and methods of it is own clas
		// ONLY
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "grey";
		a.paws = 4;

		a.sleep();
		a.eat();

		// object of child class has an access to all var and methods of it is Parent
		// and it is own Class
		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;

		dog.eat();
		dog.sleep();
		dog.bark();

		// create an Object of Cat class
		
		Cat cat = new Cat();
		cat.breed = "Persian";
		cat.color = "white";
		cat.paws = 4;
		cat.tail = true;
		
		cat.eat();
		cat.sleep();
		cat.purr();
		
		Kitten k = new Kitten();
		k.breed = "Persian";
		k.color = "white";
		k.paws = 4;
		k.tail = true;
		
		k.Play();
		k.sleep();
		k.eat();
	}

}

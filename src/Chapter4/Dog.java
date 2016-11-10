package Chapter4;

public class Dog extends Animal {

	int age;
	
	public  Dog(int dogsAge){
		age = dogsAge;
	}
	
	public void bark(){
		System.out.println("Woof!");
	}
	public void run(){
		
	}
	public int getAge(){
		return age;
	}
	public static void main(String args[]){
		Dog bunty = new Dog(12);
		int buntyAge = bunty.getAge();
		System.out.println(buntyAge);
		bunty.health();
		bunty.bark();
	}
}

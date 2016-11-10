package Chapter3;

public class Mouse extends rodentia   {
	
	String name;
	public  Mouse(String name){
		this.name = name;
	}

	public void eat(){
		System.out.println(name + " " + "ate sime cheese pizza!");
	}
	
	public void solveMaze(int minutes){
		System.out.println(name + "Solved the maze in" + minutes + "minutes!");
	}
	public static void main(String args[]){
		Mouse ratly = new Mouse("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();
		ratly.siva();
		
	}

	/*private void order() {
		// TODO Auto-generated method stub
		System.out.println("This is an animal");
	}

	private void siva() {
		// TODO Auto-generated method stub
		System.out.println("My Code");
	}*/
}

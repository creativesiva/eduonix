package Chapter2;

public class Ternary {
	public static void main(String[] args) {
		
		int fuelLevel = 3;

		//char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
		char canDrive = (fuelLevel <= 3) ? 'Y' : 'N';
		System.out.println(canDrive);

	}
	
	/*public void order(){
		System.out.println("Siva Prasad");
	}*/
}

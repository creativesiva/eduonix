package Chapter2;

public class GeneralizationsB {
	public static void main(String args[]){
		int siva = 2;
		
		if(siva < 5){
			System.out.println("My name is correct");
		}else{
			System.out.println("Check you name");
		}
		
		int prasad = 10;
		switch(prasad){
		case 1 : System.out.println("Jonnalagadda");
		break;
		case 2 : System.out.println("Venkata");
		break;
		case 3 : System.out.println("Subramanya");
		break;
		default : System.out.println("Siva Prasad");
		}
	}
}

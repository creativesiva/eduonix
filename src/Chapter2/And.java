package Chapter2;

public class And {
	public static void main(String[]args){
		System.out.println(1<2 && 3<4);//true & true prints true
		System.out.println(!((10<=3)  && ((2+5) <= 7)));//false & true prints false
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
	}
}

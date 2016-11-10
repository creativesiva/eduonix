
public class power {
	public static void main(String args[]) {
		int a = 2;
		int b = 3;
		int x = 0;
		int y = 0;
		int p = 0;
		int q = 0;

		for (int i = 0; i < 10; i++) {
			x = (int) Math.pow(a, i);
			y = (int) Math.pow(b, i);
			p += x;
			q += y;

		}
		System.out.println("2^0+2^1+2^2+........+2^8+2^9 = "+p);
		System.out.println("3^0+3^1+3^2+........+3^8+3^9 = "+q);

	}

}

package power2;

public class Power {
	public static void main(String args[]) {

		int a = 2;
		int b = 3;
		int p = 0;
		int q = 0;
		int sum = 0;
		int sum2 = 0;

		for (int i = 0; i < 10; i++) {

			p = (int) Math.pow(a, i);
			q = (int) Math.pow(b, i);

			sum += p;
			sum2 += q;
		}
		System.out.println("2^0+2^1+2^3+......+2^9 = " + sum);
		System.out.println("3^0+3^1+3^3+......+3^9 = " + sum2);

	}

}

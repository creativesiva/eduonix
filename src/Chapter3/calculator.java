
package Chapter3;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    maths maths = new maths();

	    double answer = 0;
	    double inputA, inputB;
	    char operator;
	    boolean done = false;

	     while (done == false) {
	        System.out.print("Please enter your sum: ");

	        inputA = input.nextDouble();
	        operator = input.next().charAt(0);
	        inputB = input.nextDouble();        

	        switch (operator) {
	            case '+': answer = maths.add(inputA, inputB);
	                      break;
	            case '-': answer = maths.subtract(inputA, inputB);
	                      break;
	            case '*': answer = maths.multiply(inputA, inputB);
	                      break;
	            case '/': answer = maths.divide(inputA, inputB);
	                      break;
	            case '^': answer = maths.power(inputA, inputB);
	                      break;
	        }

	            System.out.println(answer);             
	    }       

	    input.close();

	  }
}

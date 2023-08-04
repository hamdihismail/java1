package Assignment_6;

public class Factorial {
	long factorial = 1;
	int i = 1;
	void factorialCalc(int num) {
		if(num<0) {
			System.out.println(num+" does not have a factorial");
		} else if(num==0) {
			System.out.println("The factorial of 0 is 1");
		} else {
			while(i<=num) {
				factorial *= i;
				i++;
			}
			System.out.println("Factorial of "+num+" is "+factorial);
		}
	}
	public static void main(String[] args) {
		Factorial calc = new Factorial();
		calc.factorialCalc(5);
	}

}

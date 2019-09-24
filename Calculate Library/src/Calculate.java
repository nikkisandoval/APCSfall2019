//Nicolina Sandoval
//APCS 3rd
//August 29,2019
public class Calculate {
	public static int square(int number) {
		//A call to square returns the square of the value passed. The method accepts an integer and returns an integer.
		int answer =0;
		answer = number * number;
		return answer;
	}
	public static int cube(int number) {
		//A call to cube returns the cube of the value passed. The method accepts an integer and returns an integer.
		int answer =0;
		answer = number * number * number;
		return answer;
	}
	public static double average(double numberx, double numbery) {
		//A call to average returns the average of the value passed. The method accepts two doubles and returns a double.
		double answer =0;
		answer = (numberx + numbery) /2;
		return answer;
	}
	public static double average(double numberx, double numbery, double numberz) {
		//A call to average returns the average of the value passed. The method accepts three doubles and returns a double.
		double answer =0;
		answer = (numberx + numbery + numberz) /3;
		return answer;
	}
	public static double toDegrees(double number) {
		//A call to toDegrees converts an angle measure from radian to degrees. The method accepts a doubles and returns a double.
		double answer =0;
		answer = number * 180 /3.14159;
		return answer;
	}
	public static double toRadians(double number) {
		//A call to toRadians converts an angle measure from degrees to radian. The method accepts a doubles and returns a double.
		double answer =0;
		answer = number * 3.14159 /180;
		return answer;
	}
	public static int toImproperFrac(int number, int num, int denom) { //unfinished
		//A call to toImproperFrac converts mixed numbers into fractions.
		int answer =0;
		answer = number/denom + num;
		return (answer) + '/' + (denom);
	}
	public static int toMixedNum(int num, int denom) { //unfinished
		//converts fractions into mixed numbers.
		int answer =0;
		answer = num/denom;
		int rem =0;
		rem =num%denom;
		return answer + rem + '/' + denom; //needs denominator
	}
	public static int foil(int numberw, int numberx, int numbery, int numberz) { //unfinished
		//converts a binomial multiplication ((ax=b)(cx=d)) into a quadratic equation (ax^2+bx+c).
		int variablea =1;
		int variableb =2;
		int variablec =3;
		int answer =0;
		variablea = (numberw * numbery);
		variableb = (numberw * numberz) + (numberx * numbery);
		variablec = (numberx * numberz);
		answer = variablea  + variableb  + variablec;
		return answer; 
	}
	
	public static boolean isDivisibleBy(int a, int b) { 
	//determines whether or not one integer is evenly divisible by another
		if(a%b == 0) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public static double absValue(double num) {
		//returns the absolute value of a number
		if(num >= 0) {
			return num;
		}
		else { 
			return num * -1;
		}
	}
	public static double max(double a, double b) {
		//returns the larger of 2 values
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static double min(double a, double b) {
		//returns the smaller of 2 values
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	/*
	public static double round2(double a) {
		//returns the smaller of 2 values
		if() {
			return ;
		}
		else {
			return ;
		}
	}
	
	public static int isPrime(int a) {
		//returns the smaller of 2 values
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	*/
}
	

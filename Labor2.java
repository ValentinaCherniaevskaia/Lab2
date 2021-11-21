package Lab22;
import java.math.BigInteger;
import java.util.Scanner;

public class Labor2 {
	
	public static void main(String[] args) {
		// write your code here
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Введите число от 1 до 15: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        if (n >= 15 || n < 1) {
	        	System.out.println("Неверное значение!");
	        	return;
	        }
	        BigInteger factorialFor = BigInteger.valueOf(1);
	        for(int i = 1; i <= n; i++){
	            BigInteger mult = BigInteger.valueOf(i);
	            factorialFor = factorialFor.multiply(mult);
	        }
	        System.out.println("Факториал равен " + factorialFor.toString());
	        
	    }
	}
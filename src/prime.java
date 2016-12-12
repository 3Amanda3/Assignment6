import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 * Mr.Hardman
 * program using method to return if a value is prime
 * December 12
 *
 */
public class prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		boolean primeCheck;
		
		System.out.println("Please enter a number");
		userNumber = userInput.nextInt();
		
		primeCheck = isPrime(userNumber);
		
		
		if(userNumber == 1){
			System.out.println("1 is not Prime");
		}
		else{
			if (primeCheck == true){
				System.out.println( +userNumber+ " is not Prime");
			}
			if(primeCheck == false){
				System.out.println(+userNumber+" is prime");
			}
		} userInput.close();

	}
	
	/**
	 * isPrime will calculate if a number is prime
	 * @param userNumber
	 * @return prime
	 */
	
	public static boolean isPrime(int userNumber){
		
		boolean prime = true;

		for(int i = 2; prime && i <= Math.sqrt(userNumber); i++){
		
			if(userNumber % i == 0){
				prime = false;
			}
		
		}

		return prime;	
	
	}
}

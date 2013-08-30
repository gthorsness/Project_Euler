public class Euler_3{
  // From stack overflow
 	public static void main(String[] args){
	
		System.out.println(largestPrime(600851475143L));
	}
	
	public static int largestPrime(long num){
		int i;
		for(i = 2; i <= num; i++){
			if(num %i == 0){
			    num /= i;
				 i--;
			}
		
		}	
	
		return i;
	}
	
}
//using sieve of Eratosthenes
public class Euler_10{
	public static void main(String[] args){
		int max = 2000001;
		prime[] numbers = new prime[max];
		
		for(int i = 2; i < max; i++){
			numbers[i] = new prime(i,true); 
		}
		
		
		for(int i = 2; i < Math.sqrt(max); i++){		
			if(numbers[(int)i].getPrime() == true){
				int x = i*i;
				while(x < max){
					numbers[x].setPrime(false);
					x+=i;
				}					
			}
		}
		
		long sum = 0;
		
		for(int i = 2; i < max;i++){
			if(numbers[i].getPrime()){
				sum += numbers[i].getNum();
			}
			
		}

	}
}

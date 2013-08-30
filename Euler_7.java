public class Euler_7{

public static int[] primes = new int[10001];
public static int size = 1;
	
	public static void main(String[] args){
		
		int num = 2;
		primes[0] = 2;
		while(primes[10000] == 0){
	
			isPrime(num);
	
			num++;
		}
		System.out.println(primes[10000]);
	
	}

	public static void isPrime(int num){
		boolean prime = true;
		for(int i = 0; i < size; i++){
			if(num%primes[i]==0){
				prime = false;
			}
		}
		if(prime==true){
			primes[size] = num;
			size++;
		}
	
	}

}
	
	
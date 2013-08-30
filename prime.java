
public class prime{
	int number;
	boolean prime;
	
	
	prime(int num, boolean prime){
		number = num;
		this.prime = prime;
		
	}
		
	public void setPrime(boolean prime){
	
		this.prime = prime;
	}
		
	public void setNum(int num){
	
		number = num;
	}
	
	public boolean getPrime(){
	
		return this.prime;
	}
	
	public int getNum(){
		return number;
	}
	

}
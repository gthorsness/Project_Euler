public class Euler_9{
	
	public static void main(String[] args){
	
		int sum = 0;
		int c = 0;
		for(int i =1; i < 1000; i++){
			for(int j =1; j < 1000; j++){
				
				c = i * i + j * j;
				if(Math.sqrt(c)%1 ==0){
					c = (int)Math.sqrt(c);
					if( i + j + c == 1000){
						sum = i * j * c;
					}
				}
			}
		}
	
		
	
		System.out.println(sum);
	}
}
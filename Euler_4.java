public class Euler_4{
	public static long c = 0;
	public static void main(String[] args){
		
		for(int i = 999; i > 99; i--){
			for(int j = 999; j > 99; j--){	
				if(pali(i,j) && c >900000){
					System.out.println(c);
				}
			}
				
		}  
			
	}
	public static boolean pali(int a, int b){
	
		boolean pali = true;
		
	   c=a*b;
	
		
		String check = Long.toString(c);
		for(int i = 0 ; i < check.length()-1/2;i++){
			if(check.charAt(i)!=check.charAt(check.length()-1- i)){
				pali = false;
			}
		}

		return pali;
	}
}
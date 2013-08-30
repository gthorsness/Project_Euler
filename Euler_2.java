public class Euler_2{
	public static int i;
	
	public static void main(String[] args){
	 
		  System.out.println(fib(1,2));
	   
	}
	
	public static int fib(int a, int b){
	    int c = a + b;
		 if(a%2 == 0){
		 	i+=a;
		 }
		 if(b <4000000){
		    fib(b,c);
		 }
		 return i;
	}
}
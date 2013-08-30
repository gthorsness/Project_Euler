public class Euler_6{

	public static void main(String[] args){
		long num1 = 0;
		long num2 = 0;
		for(int i = 1; i < 101; i++){
			num1 += i;
		}
		num1= num1 * num1;
		for(int i = 1; i < 101; i++){
			num2 += i*i;
		}
		System.out.println(num1-num2);
	}
	

}
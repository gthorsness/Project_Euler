import java.util.*;
public class Euler_12 {
	public static HashMap<Integer,int[]> div = new HashMap<Integer,int[]>();

	public static void main(String args[]){
		
		
		int rtn = 0;
		for(int i = 1; i < 1000000; i++){
			rtn+=i;
			divisors(rtn);
		}
		
		int[] nums = div.get(rtn);
		int i = 0;
		while (nums[i] != 0){
			System.out.println(nums[i]);
			i++;
		}
	}
	
	public static void divisors(int rtn){
		int[] nums = new int[500];
		int j = 0;
		for(int i = 1; i < Math.sqrt(rtn) ; i++){
			
			if(rtn%i == 0){
			
				nums[j] = i;
				j++;
				
			}	
		}
		div.put(rtn,nums);
	}
}
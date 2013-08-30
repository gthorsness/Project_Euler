import java.io.*;
import java.util.*;
public class Euler_11{

public static int[][] numbers = new int[20][20];
public static long Max = 0;

	public static void main(String args[]){
		parseFile();
		calcRight();
		calcDown();
		calcDiagUp();
		calcDiagDown();
		System.out.println(Max);
	}
	
	public static void calcRight(){
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 17; j++){
				int sum = 1;
				for(int k = 0; k < 4; k++){
					sum*=numbers[i][j+k];
					if(sum > Max){
						Max = sum;
					
					}
				}
				
			}
		}	
	}
	public static void calcDown(){

		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 20; j++){
				int sum = 1;
				for(int k = 0; k < 4; k++){
					sum*=numbers[i+k][j];
				
					if(sum > Max){					
						Max = sum;
					
					}
				
				}
				
			}
		}	
	}
	
	public static void calcDiagDown(){

		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 17; j++){
				int sum = 1;
				for(int k = 0; k < 4; k++){
					sum*=numbers[i+k][j+k];
					if(sum > Max){					
						Max = sum;		
					}
				
				}
			}
		}	
	}
	
	public static void calcDiagUp(){

		for(int i =3; i < 20; i++){
			for(int j = 0; j < 17; j++){
				int sum = 1;
				for(int k = 0; k < 4; k++){
					sum*=numbers[i-k][j+k];
					if(sum > Max){					
						Max = sum;
					}
				
				}
			}
		}	
	}
	
	
		
	public static void parseFile(){
		String line = "";
				
		try{
			BufferedReader in = new BufferedReader(new FileReader("numbers_11.txt")); 
			int row = 0;
			while(in.ready()){
				line = in.readLine();
				String[] strArr= line.split(" ");
				int col = 0;
				for (String s : strArr) {
					s.replaceFirst("^0+(?!$)","");
					numbers[row][col] = Integer.parseInt(s);
					//System.out.print(numbers[row][col]);
					//System.out.print(" ");
					col++;
				}
				//System.out.println();
				row++;
			}
			
		}catch(IOException e){
			
		}
	}
}
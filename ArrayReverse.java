
import java.util.Random;

public class ArrayReverse {
	// Kevin was here
	public static void main(String [] args){
		Random rand = new Random();
		int randomNum = rand.nextInt(10);
		
		int[]arr = new int[6];
		
		System.out.println("start of array reverse");
		System.out.println("");
		System.out.println("initial random array");
		for(int i = 0;i<arr.length;i++){
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println(" ");

		int smallest = arr[0];
		for(int i =0; i < arr.length;i++){
			if(arr[i] > smallest){
				smallest = i;
			}
		}
		
		System.out.println(smallest);
		
		
		
		
		int a = arr.length-1;
		
		for(int b = 0; b<arr.length/2;b++){
			
			int start = arr[b];
			int end = arr[a];

            arr[a] = start;
            arr[b] = end;
           		
			a--;
		}
		
		System.out.println("");
		
		System.out.println("Resulting array");
		for(int y = 0; y<arr.length;y++){
			System.out.print(arr[y]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("end of array reverse");
		
		System.out.println("");
		
			
		System.out.println("start of moving array backwards");
		
		int temp = arr[0];
		int end = arr[arr.length-1];
		
		for(int cat = 0;cat<(arr.length-1);cat++){
			

			arr[cat] = arr[cat+1];
			arr[arr.length-1] = temp;
		}
		
		arr[arr.length-2] = end;
		
		
		System.out.println("");
		System.out.println("Resulting array");
		
		for(int o = 0; o<arr.length;o++){
			System.out.print(arr[o]);
			System.out.print(" ");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("moving forward");

		int end2 = arr[arr.length-1];
		
		for(int h = arr.length-1; h>=1;h--){
			
			arr[h] = arr[h-1];
			
		}
		
		arr[0] = end2;
		
		
		System.out.println("");
		System.out.println("Resulting array");
		
		for(int o = 0; o<arr.length;o++){
			System.out.print(arr[o]);
			System.out.print(" ");
		}
		

		System.out.println("");
		System.out.println("");
		System.out.println("End of shifting arrays");
	}
}

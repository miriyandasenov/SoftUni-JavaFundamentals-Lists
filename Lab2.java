import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();//"3 3 6 1"
		
		String[] splittedLine = line.split(" ");//["3", "3", "6", "1"]
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i < splittedLine.length; i++){
			int num = Integer.parseInt(splittedLine[i]);
			numbers.add(num);
		}
		
		int halfSize = numbers.size() / 2;

		for(int i = 0; i < halfSize; i++){
			
			int sum = numbers.get(i) + numbers.get(numbers.size()-1);
			
			numbers.set(i,sum); 
			numbers.remove(numbers.size()-1);		 
		}
		
		for(Integer number: numbers){
		
			System.out.print( number + " ");
		}
	}
}
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();//"3 3 6 1"
		
		String[] splittedLine = line.split(" ");//["3", "3", "6", "1"]
		
		List<Double> numbers = new ArrayList<>();
		
		for(int i=0; i < splittedLine.length; i++){
			double num = Double.parseDouble(splittedLine[i]);
			numbers.add(num);
		}
		
		for(int i = 0; i < numbers.size() - 1; i++){
		
			if(numbers.get(i).equals (numbers.get(i + 1))){
			
				double sum = numbers.get(i) * 2;
				numbers.remove(i);
				numbers.set(i,sum);
				i=-1;
			}
		}
		
		for(Double number: numbers){
		
			System.out.print( new DecimalFormat("0.#").format(number) + " ");
		}
	}
}
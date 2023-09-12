import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task1CountCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
	
		LinkedHashMap<Character, Integer> result=new LinkedHashMap<>();
		
		//logic here
		char[] arr=input.toCharArray();
		for(char c:arr)
		{
			int count=0;
			if(result.containsKey(c))
			{
				count=result.get(c);
			}
			count++;
			result.put(c, count);
		}
		
		for(Entry<Character, Integer> e:result.entrySet())
			System.out.println(e.getKey()+"\t"+e.getValue());
	}

}

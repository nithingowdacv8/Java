import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainReplace {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,1,13,44,12,44,55,12,8,78,12);
		System.out.println(list);
		System.out.println("After replace");
//		Collections.replaceAll(list, 12, 120);
		ArrayList<Integer> result=new ArrayList<>();

		for(Integer i : list)
		{
			int x=i;
			if(i==12)
				x=120;
			result.add(x);
		}

		System.out.println(result);



//		System.out.println(list);
	}

}

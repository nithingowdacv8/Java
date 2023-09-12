import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntegerComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer a, Integer b) {
		return b-a;
	}
	
}

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(90);
		marks.add(60);
		marks.add(80);
		marks.add(70);
		marks.add(98);
		marks.add(57);
		marks.add(65);
		marks.add(45);
		
//		Collections.sort(marks, new IntegerComparator());
		Collections.sort(marks, (x,y)->y-x);
		
		for(Integer m:marks)
			System.out.println(m);
	}

}

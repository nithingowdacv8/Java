import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(20);
		marks.add(120);
		marks.add(210);
		marks.add(201);
		marks.add(40);
		marks.add(25);
		marks.add(50);
		marks.add(24);
		
		Collections.sort(marks);
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

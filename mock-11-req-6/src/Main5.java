
public class Main5 {
	
	public static void main(String[] args) {
		
		outer:
		for(int i=0;i<10;i++)
		{
			inner:
			for(int j=0;j<10;j++)
			{
				if(i==3 && j==3)
					break outer;
				System.out.println(i+"\t"+j);
			}			
		}
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.addMobile("Samsung", "S2");
		mobile.addMobile("Apple", "I10");
		mobile.addMobile("Redmi", "K20");
		mobile.addMobile("One Plus", "10+");
		mobile.addMobile("Redmi", "K20");
		mobile.addMobile("Redmi", "K20");
		mobile.addMobile("Samsung", "S3");
		mobile.addMobile("Samsung", "Galaxy S4");
		mobile.addMobile("Apple", "I11");
		mobile.addMobile("Redmi", "K20 pro");
		mobile.addMobile("One Plus", "9");
		mobile.addMobile("Vivo", "V20");
		
		
		String message = mobile.buyMobile("Redmi", "K20");
		System.out.println(message);
		
		//show all the mobiles
		HashMap<String, ArrayList<String>> mobiles = mobile.mobiles;
			
		for(Entry<String, ArrayList<String>> entry:mobiles.entrySet())
		{
			ArrayList<String> models = entry.getValue();
			if(models.isEmpty())
			{
				continue;
			}
			System.out.println("Displaying all the models of "+entry.getKey());
			
			for(String model:models)
			{
				System.out.println("--"+model);
			}
			System.out.println();
		}
	}

}

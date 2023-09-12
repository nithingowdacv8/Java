import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
		HashMap<String, ArrayList<String>> mobiles=new HashMap<>();
		
		public String addMobile(String company, String model)
		{
			//first i will get models arraylist of that company
			ArrayList<String> modelsList = mobiles.get(company);
			if(modelsList==null)
			{
				//i am adding the company for first time
				modelsList=new ArrayList<String>();
			}
			modelsList.add(model);
			mobiles.put(company, modelsList);
			return "model successfully added";
		}
		
		public ArrayList<String> getModels(String company)
		{
			return mobiles.get(company);
		}
		
		public String buyMobile(String company, String mobile)
		{
			ArrayList<String> models = mobiles.get(company);
			if(models==null)
				return "item not available";
			//check if the specific mobile is found in the models list or not
			if(models.contains(mobile))
			{
				//found we can remove it now
				models.remove(mobile);				
				return "mobile sold successfully";
			}else
			{
				return "item not available";
			}			
		}
}

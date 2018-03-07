package smartphone;

import java.util.ArrayList;
import java.util.List;

public class Samsung {
	
	public void takePic(){
		System.out.println("Picture is taken");
	}
	
	public String getModel(){
		String model = "Note";
		return model;
	}
	
	public List<String> getMobileModel(){
		List<String> mobileModel = new ArrayList<String>();
		mobileModel.add("Galaxy");
		mobileModel.add("Note");
		mobileModel.add("S8");
		mobileModel.add("S8");
		mobileModel.add(null);
		return mobileModel;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

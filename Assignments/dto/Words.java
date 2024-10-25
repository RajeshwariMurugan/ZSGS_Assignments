package dto;
import java.util.HashMap;
import java.util.Map;



public class Words {
	String Tword;
	String explanation;
	
	Words(String Tword,String explanation)
	{
		this.Tword=Tword;
		this.explanation=explanation;
	}
	Words(){
		
	}

	
	public static HashMap<String,Words>Dic=new HashMap<>();
	
	
	public static Words getWordDetails(String Eword) {
		for (Map.Entry<String, Words> entry : Dic.entrySet()) {
				Words u = entry.getValue();
					if (entry.getKey().equalsIgnoreCase(Eword)) 
						return u;
			}
		return null;
	}
}
package dto;

import java.util.Scanner;


public class Main {
		static Scanner sc=new Scanner(System.in);
		static String getStringValue() {
			String name=sc.nextLine();
			
			while(true)
			{
			if(name!=" ")
				break;
			else {
				System.out.println("Enter Valid Word");
				sc.nextLine();
			}
			}
			return name;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To English to Tamil Dictionary");
		
		
		Words word=new Words();
		Words word1=new Words("ஆப்பிள்","ஒரு பழம்");
		String Eword="Apple";
		
	    word.Dic.put(Eword,word1);
	    word.Dic.put("Ball", new Words("பந்து","விளையாடும் ஒரு பொருள் "));
	    word.Dic.put("Car", new Words("மகிழுந்து", "ஒரு வாகனம் "));
	    word.Dic.put("Doll", new Words("பொம்மை","குழந்தைகள் விளையாடும் பொருள் "));
	    word.Dic.put("Egg", new Words("முட்டை ","ஓர் உணவு பொருள்"));
	    
	    
	    word.Dic.put("Friend", new Words("நண்பன்"," தோள் கொடுப்பான் தோழன் "));
	    word.Dic.put("Glass", new Words("கண்ணாடி ","உபயோகிக்கும் பொருள் "));
	    word.Dic.put("House", new Words("வீடு" ,"வசிக்கும் இடம்"));
	    word.Dic.put("Intelligent", new Words("அறிவாளி" ,"அறிவில் சிறந்தவர் "));
	    word.Dic.put("July", new Words("ஜூலை ","ஆங்கில மாதம்"));

	    word.Dic.put("Knife", new Words("கத்தி","ஆயுதம்"));
	    word.Dic.put("Lemon", new Words("எலுமிச்சை","பழம்"));
	    word.Dic.put("Mango", new Words("மாங்கனி","முக்கனிகளில் ஒன்று"));
	    word.Dic.put("Nine", new Words("ஒன்பது","எண்"));
	    word.Dic.put("Orange", new Words("ஆரஞ்சு","நிறம்/பழம்"));

	    word.Dic.put("Peacock", new Words("மயில்","தேசிய பறவை"));
	    word.Dic.put("Queen", new Words("அரசி","H"));
	    word.Dic.put("Royal", new Words("Hii","H"));
	    word.Dic.put("Sun", new Words("Hii","HUUU"));
	    word.Dic.put("Tree", new Words("Hii","HUUU"));

	    word.Dic.put("Umbrella", new Words("Hii","HUUU"));
	    word.Dic.put("Vessal", new Words("Hii","HUUU"));
	    word.Dic.put("Window", new Words("Hii","HUUU"));
	    word.Dic.put("X-ray", new Words("Hii","HUUU"));
	    word.Dic.put("Yolk", new Words("Hii","HUUU"));
	    word.Dic.put("Zebra", new Words("Hii","HUUU"));

	   		


	    	boolean flag=true;	
	    while(flag) {
			System.out.println("Enter Which word should be translated in english?");
		String Ewords=getStringValue();
		if(Ewords.equals("quit"))
		{
		  flag=false;
		}
		else
		{
			Words letter=new Words();
			letter=letter.getWordDetails(Ewords);
			if(letter!=null)
			{
			System.out.println("HIII");
			System.out.println("தமிழ் மொழியில் "+Ewords+ " என்பதன் பொருள் "+letter.Tword);
			System.out.println("பொருள் : "+letter.explanation);
			}
			else
			System.out.println("Enter Corect value");
		
		}

	    }
		
		

		
		
		
		

	}
	
	

}

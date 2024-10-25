package dto;

public class CADOOpsBasics {

	protected int age=12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(false);
		System.out.println(1);
		
		Student student=new Student("Raji",4,23,10);
//		student.age=21;
//		System.out.println(student.age);// Before getter setter
		
		//student.setAge(21);
  	//System.out.println(student.getRollNo());// After getter setter
  	
  	
		YouTubeBase youtubeBase=new YouTubeHome();
		YouTubeSettings secondInstance=(YouTubeSettings) youtubeBase;
		youtubeBase.checkInternetConnection();

	}

}

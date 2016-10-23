
public class MyOtherClass {
	
	private String startOfSentence = "My name is ";
	
	public String getFullName(String firstName){		
		String s = startOfSentence + firstName + getLastName();
		return s;
	}
	
	private String getLastName(){
		return "Carter";
	}

}


public class MyMainClass {

	public static void main(String[] args) {
		
		MyOtherClass other = new MyOtherClass();
		
		System.out.println(other.getFullName("Suzanty"));
		
		int j = 16;
		//change
		computeValue(j);
		
		System.out.println(j);
		
		// TODO Auto-generated method stub

	}
	
	public static void computeValue(int passMeAnInteger){
		
		passMeAnInteger = passMeAnInteger*47;
		System.out.println(passMeAnInteger);
		
	}

}

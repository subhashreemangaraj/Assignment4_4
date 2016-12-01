
public class Assignment4_4_1 extends Assignment4_4{
	
	Assignment4_4_1(){
		
		System.out.println("Child class construtor");
	}
	
	public static void main(String[] args) {
		
		Assignment4_4 n = new Assignment4_4_1();
		
	}
}

//output: parent class consructor
//        Child class construtor
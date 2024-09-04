package MethodsAndConstructor;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings s1=new Greetings();
		
		s1.m1();
		String msg=s1.m2();
		System.out.println(msg);
		
		int sum=s1.m4(22, 2);
		System.out.println(sum);
		

	}

}

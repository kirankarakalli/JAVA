package OOPS;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.sid=1;
		s1.sname="scott";
		s1.grad='A';
		s1.print();
		
		new Student();
		new Student().sid=2;
		new Student().sname="john";
		new Student().grad='A';
		new Student().print();
		

	}

}

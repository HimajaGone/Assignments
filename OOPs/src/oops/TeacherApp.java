package oops;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1 = new Teacher();
		t1.id = 132;
		t1.name = "Punith";
		t1.subject = "java";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		System.out.println("id is:"+t1.id);
		System.out.println("name is:"+t1.name);
		System.out.println("subject is:"+t1.subject);
		
	}

}

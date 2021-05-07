package homework2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id =1;
		student1.firstName = "Fatma";
		student1.lastName = "Uysal";
		student1.email = "fatmauysal@gmail.com";
		
		Instructor instructor1 = new Instructor();
		instructor1.id =2;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroğ";
		instructor1.email = "bilmiyorum@gmail.com";
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student1);
		studentManager.showCourse(student1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.showCourse(instructor1);
		instructorManager.addCourse(instructor1);
		instructorManager.deleteCourse(instructor1);
		
		
	}

}

class Student{
	String name,course;
	int rollNo;
	public void printDetails() {
		System.out.println("Name: "+name+"\nRoll no.: "+rollNo+"\nCourse: "+course);
	}
}

class Driver{
	public static void main(String args[]){

	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();

	s1.name = "Nihit";
	s1.rollNo = 15;
	s1.course = "BTech-DA";
	s2.name = "Deepak";
	s2.rollNo = 12;
	s2.course = "BTech";
	s3.name = "Anmol";
	s3.rollNo = 4;
	s3.course = "BCA";
	
	s1.printDetails();
	s2.printDetails();
	s3.printDetails();
	}
}

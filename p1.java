class Student{
	//instance/class variables
	String name,course; 
	int rollNo;
	public void printDetails() {
		int percentage = 100; //local variable
		System.out.println("Name: "+name+"\nRoll no.: "+rollNo+"\nCourse: "+course);
	}
	Student(String name,int rollNo,String course){
		this.name=name;
		this.course=course;
		this.rollNo=rollNo;
}

class Driver{
	public static void main(String args[]){

	Student s1 = new Student("Nihit",15,"BTech-DA");
	Student s2 = new Student("Deepak",12,"BTech");
	Student s3 = new Student("Anmol",4,"BCA");
/*
	s1.name = "Nihit";
	s1.rollNo = 15;
	s1.course = "BTech-DA";
	s2.name = "Deepak";
	s2.rollNo = 12;
	s2.course = "BTech";
	s3.name = "Anmol";
	s3.rollNo = 4;
	s3.course = "BCA";
*/	
	s1.printDetails();
	s2.printDetails();
	s3.printDetails();
	}
}

package ba.edu.ibu.oop.week10;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentGrades {

	static List<Student> Students = new ArrayList<Student>();
	static List<Course> Courses = new ArrayList<Course>();
	static List<Advisor> Advisors = new ArrayList<Advisor>();

	static class Course {
		
		
		public String toString() {
			return getName() + "\n";
		}

		public String print() {
			String output = "";
			for (int i = 0; i < numberOfQuizes; i++) {
				output += Quizes[i];
			}
			return output;
		}

		public Course() {

		}

		public Course(String name, String code, String instructorName, int numberOfQuizes, int numberOfAssigments) {
			super();
			this.name = name;
			this.code = code;
			this.instructorName = instructorName;
			this.numberOfQuizes = numberOfQuizes;
			this.numberOfAssigments = numberOfAssigments;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getInstructorName() {
			return instructorName;
		}

		public void setInstructorName(String instructorName) {
			this.instructorName = instructorName;
		}

		public int getNumberOfQuizes() {
			return numberOfQuizes;
		}

		public void setNumberOfQuizes(int numberOfQuizes) {
			this.numberOfQuizes = numberOfQuizes;
		}

		public int getNumberOfAssigments() {
			return numberOfAssigments;
		}

		public void setNumberOfAssigments(int numberOfAssigments) {
			this.numberOfAssigments = numberOfAssigments;
		}

		public void setQuizGrade(int a, int b, double d){
			Quizes[a][b]=d;
		}
		
		double Quizes[][]=new double[100][100];
		double Assigments[][]=new double[100][100];
		String name;
		String code;
		String instructorName;
		int numberOfQuizes, numberOfAssigments;

	}

	static class Student {

		public String toString() {
			return "Student name and surname: " + getNameSurname() + "\n Student id: " + getId()
					+ "\n Student address: " + getAddress() + "\n Student phone: " + getPhone()
					+ "\n Student birthdate: " + getBirthdate() + "\n Number of courses: " + getNumberOfCourses()
					+ "\n Courses:\n" + getCourses()+ "\n"+ getGrades();
		}

		public Student() {

		}

		public Student(String nameSurname, String id, String address, String phone, String birthdate,
				int numberOfCourses, Course course) {
			super();
			setNameSurname(nameSurname);
			setId(id);
			setAddress(address);
			setPhone(phone);
			setBirthdate(birthdate);
			setNumberOfCourses(numberOfCourses);
			setCourse(course);
		}

		public String getNameSurname() {
			return nameSurname;
		}

		public void setNameSurname(String nameSurname) {
			this.nameSurname = nameSurname;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getBirthdate() {
			return birthdate;
		}

		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

		public int getNumberOfCourses() {
			return numberOfCourses;
		}

		public void setNumberOfCourses(int numberOfCourses) {
			this.numberOfCourses = numberOfCourses;
		}

		public String getCourses() {
			String output = "";
			for (Course c : MyCourses) {
				output += c.toString();
			}
			return output;
		}


		public String getGrades(){
			String output="";
			for (Course c : MyCourses) {
				for(int i=0;i<c.getNumberOfQuizes();i++){
				output += c.Quizes[Integer.parseInt(id)][i]+" ";
				}
				output+="\n";
					for(int i=0;i<c.getNumberOfAssigments();i++){
					output += c.Assigments[Integer.parseInt(id)][i]+" ";
					}
			}
			return output;
		}
		
		public void setCourse(Course course) {
			MyCourses.add(course);
		}

		public boolean checkCourse(String name) {
			for (Course c : MyCourses) {
				if (c.getName().equals(name)) {
					return true;
				}
			}
			return false;
		}

		public Course getCourse(String name) {
			for (Course c : MyCourses) {
				if (c.getName().equals(name)) {
					return c;
				}
			}
			return null;
		}

		String nameSurname;
		String id;
		String address;
		String phone;
		String birthdate;
		int numberOfCourses;
		List<Course> MyCourses = new ArrayList<Course>();
	}

	static class Advisor {

		public String displayMyStudents() {
			String output = "";
			for (Student s : MyStudents) {
				output += s.getNameSurname() + " " + s.getId() + "\n";
			}
			return output;
		}

		public String toString() {
			return "Advisor name and surname: " + getNameSurname() + "\nNumber of students: " + getNumberOfStudents()
					+ "\n Students: \n" + getStudents();
		}

		public Advisor() {

		}

		public Advisor(String nameSurname, int numberOfStudents, Student student) {
			super();
			setNameSurname(nameSurname);
			setNumberOfStudents(numberOfStudents);
			setStudent(student);
		}

		String nameSurname;
		int numberOfStudents;

		public String getNameSurname() {
			return nameSurname;
		}

		public void setNameSurname(String nameSurname) {
			this.nameSurname = nameSurname;
		}

		public int getNumberOfStudents() {
			return numberOfStudents;
		}

		public void setNumberOfStudents(int numberOfStudents) {
			this.numberOfStudents = numberOfStudents;
		}

		public String getStudents() {
			String output = "";
			for (Student s : MyStudents) {
				output += s.getNameSurname() + "\n";
			}
			return output;
		}

		public void setStudent(Student student) {
			MyStudents.add(student);
		}

		List<Student> MyStudents = new ArrayList<Student>();
	}

	public static void addStudent() {
		Student s = new Student();
		s.setNameSurname(JOptionPane.showInputDialog("Enter student name and surname"));
		s.setId(JOptionPane.showInputDialog("Enter student id"));
		s.setAddress(JOptionPane.showInputDialog("Enter student address"));
		s.setPhone(JOptionPane.showInputDialog("Enter student phone"));
		s.setBirthdate(JOptionPane.showInputDialog("Enter student birthdate"));
		s.setNumberOfCourses(Integer.parseInt(JOptionPane.showInputDialog("Enter number of courses for the student")));
		while (s.getNumberOfCourses() > Courses.size()) {
			s.setNumberOfCourses(Integer.parseInt(JOptionPane.showInputDialog(
					"Only " + Courses.size() + "  courses available. Enter new number of courses for the student")));
		}
		for (int i = 0; i < s.getNumberOfCourses(); i++) {
			String CourseName = JOptionPane.showInputDialog("Select a course: \n" + displayCourses());
			while (findCourse(CourseName) == null) {
				JOptionPane.showMessageDialog(null, "Course not avaialble.");
				CourseName = JOptionPane.showInputDialog("Select a course: \n" + displayCourses());
			}
			while (s.checkCourse(CourseName)) {
				JOptionPane.showMessageDialog(null, "Course already added. Please try again.");
				CourseName = JOptionPane.showInputDialog("Select a course: \n" + displayCourses());
				while (findCourse(CourseName) == null) {
					JOptionPane.showMessageDialog(null, "Course not avaialble.");
					CourseName = JOptionPane.showInputDialog("Select a course: \n" + displayCourses());
				}
			}
			s.setCourse(findCourse(CourseName));
		}

		Students.add(s);
	}

	public static void addAdvisor() {
		Advisor a = new Advisor();
		a.setNameSurname(JOptionPane.showInputDialog("Enter advisor name and surname"));
		a.setNumberOfStudents(
				Integer.parseInt(JOptionPane.showInputDialog("Enter number of students for the advisor")));
		while (a.getNumberOfStudents() > Students.size()) {
			a.setNumberOfStudents(Integer.parseInt(JOptionPane.showInputDialog(
					"Only " + Students.size() + " students registered. Enter new number of students for the advisor")));
		}
		if (Students.size() == 0) {
			JOptionPane.showMessageDialog(null, "No students to be added.");
		} else {
			for (int i = 0; i < a.getNumberOfStudents(); i++) {
				String StudId = JOptionPane
						.showInputDialog("Enter the id of the student you want to add: \n" + displayStudents());
				Student toBeAdded = findStudent(StudId);
				a.setStudent(toBeAdded);
			}
		}
		Advisors.add(a);
	}

	public static void addCourse() {
		Course c = new Course();
		c.setName(JOptionPane.showInputDialog("Enter course name"));
		c.setCode(JOptionPane.showInputDialog("Enter course code"));
		c.setInstructorName(JOptionPane.showInputDialog("Enter instructor name"));
		c.setNumberOfQuizes(Integer.parseInt(JOptionPane.showInputDialog("Enter number of quizzes for this course")));
		c.setNumberOfAssigments(
				Integer.parseInt(JOptionPane.showInputDialog("Enter number of assigments for this course")));

		Courses.add(c);
	}

	static Student findStudent(String id) {
		for (Student c : Students) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	static Course findCourse(String name) {
		for (Course c : Courses) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	static Advisor findAdvisor(String name) {
		for (Advisor a : Advisors) {
			if (a.getNameSurname().equals(name)) {
				return a;
			}
		}
		return null;
	}

	public static void displayAdvisorInfo() {
		String AdvisorName = JOptionPane.showInputDialog("Enter your name and surname");
		if (findAdvisor(AdvisorName) == null) {
			JOptionPane.showMessageDialog(null, "Advisor not found.");
		} else {
			Advisor a = findAdvisor(AdvisorName);
			JOptionPane.showMessageDialog(null, a.toString());
		}
	}

	public static void displayStudentInfo() {
		String studentId = JOptionPane.showInputDialog("Enter your id");
		if (findStudent(studentId) == null) {
			JOptionPane.showMessageDialog(null, "Student not found.");
		} else {
			Student s = findStudent(studentId);
			JOptionPane.showMessageDialog(null, s.toString());
		}
	}

	public static String displayCourses() {
		String output = "";
		for (Course c : Courses) {
			output += c.toString();
		}
		return output;
	}

	public static String displayStudents() {
		String output = "";
		for (Student s : Students) {
			output += s.getNameSurname() + " " + s.getId() + "\n";
		}
		return output;
	}

	public static void editStudentInfo() {
		String name = JOptionPane.showInputDialog("Welcome advisor. Enter your name and surname.");
		if (findAdvisor(name) == null) {
			JOptionPane.showMessageDialog(null, "Advisor not found.");
		} else {
			Advisor a = findAdvisor(name);
			String StudId = JOptionPane
					.showInputDialog("Enter id of the student you wish to edit.\n" + a.displayMyStudents());
			int choice = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Change student name\n 2. Change student address\n 3. Change student phone\n 4. Change student birthdate\n 5. Add grades\n 6. Exit"));
			if (choice == 1) {
				findStudent(StudId).setNameSurname(JOptionPane.showInputDialog("Enter new student name and surname"));
			} else if (choice == 2) {
				findStudent(StudId).setAddress(JOptionPane.showInputDialog("Enter new student address."));
			} else if (choice == 4) {
				findStudent(StudId).setBirthdate(JOptionPane.showInputDialog("Enter new student birthdate."));
			} else if (choice == 3) {
				findStudent(StudId).setPhone(JOptionPane.showInputDialog("Enter new student phone."));
			} else if (choice == 5) {
				String coursename = JOptionPane.showInputDialog("Enter course");
				for (int i = 0; i < findCourse(coursename).getNumberOfQuizes(); i++) {
					double d = Double.parseDouble(JOptionPane.showInputDialog("Enter quiz grade"));
					//findCourse(coursename).Quizes[Integer.parseInt(StudId)][i] = d;
					findCourse(coursename).setQuizGrade(Integer.parseInt(StudId), i, d);
				}
				for (int i = 0; i < findCourse(coursename).getNumberOfAssigments(); i++) {
					double d = Double.parseDouble(JOptionPane.showInputDialog("Enter assigment grade"));
					findCourse(coursename).Assigments[Integer.parseInt(StudId)][i] = d;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Goodbye!");
			}
		}
	}

	public static void main(String[] args) {

		Course defaultCorse = new Course("Calculus", "1", "Recep", 2, 2);
		Courses.add(defaultCorse);
		int choice = 0;
		while (choice != 7) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(
					" 1. Add a new student\n 2. Add a new advisor\n 3. Add a new course\n 4. View student information\n 5. View advisor information\n 6. Edit student information and grades\n 7. Exit"));
			if (choice == 1) {
				addStudent();
			} else if (choice == 2) {
				addAdvisor();
			} else if (choice == 3) {
				addCourse();
			} else if (choice == 4) {
				displayStudentInfo();
			} else if (choice == 5) {
				displayAdvisorInfo();
			} else if (choice == 6) {
				editStudentInfo();
			}
		}
		JOptionPane.showMessageDialog(null, "Goodbye!");
	}

}


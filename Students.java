package Week3.Day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Id: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id: "+" "+"Name: "+name);

	}
	public void getStudentInfo(String email,int phnnumber) {
		System.out.println("Email: "+" "+"PhnNumber:"+phnnumber);

	}
	public static void main(String[] args) {
		Students s =new Students();
		s.getStudentInfo(5);
		s.getStudentInfo(3,"Aishu");
		s.getStudentInfo("xyz@gmail.com",44242342);

	}

}

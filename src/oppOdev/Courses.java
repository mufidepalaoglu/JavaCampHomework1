package oppOdev;

public class Courses {
	
	public Courses() {
		System.out.println("Ben �al��t�m!");
	}
	public Courses(int courseId,String courseName, String courseInstructer,int coursePrice) {
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseInstructer = courseInstructer;
		this.coursePrice = coursePrice;
	}
	
  int courseId;
  String courseName;
  String courseInstructer;
  double coursePrice;
}

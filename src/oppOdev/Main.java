package oppOdev;

public class Main{
	
	public static void main(String[] args) {
		
       Courses course1 = new Courses(1000,"Yaz�l�m Geli�tirici Yeti�tirme Kursu(C# + Angular)","Engin Demiro�",0);
              
       Courses course2 = new Courses(1001,"Yaz�l�m Geli�tirici Yeti�tirme Kursu(Java+React)","Engin Demiro�",0);
             
       Courses course3 = new Courses(1002,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�",0);
       
       
       Courses[] courses = { course1, course2, course3};
       
       for ( Courses course : courses) {
    	   System.out.println(course.courseName);
       }
       
       System.out.println(courses.length);
       
       
       Category category1 = new Category(1,"Yaz�l�m");
       
       Category category2 = new Category(2,"Donan�m");
       
        Category[] categoryList = { category1, category2};
       
       for ( Category category : categoryList) {
    	   System.out.println(category.name);
       }
       
       CoursesManager coursesManager = new CoursesManager();
       
       coursesManager.registerToCourse();
       coursesManager.completeToCourse();
      
	}
      
}
	
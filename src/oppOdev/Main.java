package oppOdev;

public class Main{
	
	public static void main(String[] args) {
		
       Courses course1 = new Courses(1000,"Yazýlým Geliþtirici Yetiþtirme Kursu(C# + Angular)","Engin Demiroð",0);
              
       Courses course2 = new Courses(1001,"Yazýlým Geliþtirici Yetiþtirme Kursu(Java+React)","Engin Demiroð",0);
             
       Courses course3 = new Courses(1002,"Programlamaya Giriþ için Temel Kurs","Engin Demiroð",0);
       
       
       Courses[] courses = { course1, course2, course3};
       
       for ( Courses course : courses) {
    	   System.out.println(course.courseName);
       }
       
       System.out.println(courses.length);
       
       
       Category category1 = new Category(1,"Yazýlým");
       
       Category category2 = new Category(2,"Donaným");
       
        Category[] categoryList = { category1, category2};
       
       for ( Category category : categoryList) {
    	   System.out.println(category.name);
       }
       
       CoursesManager coursesManager = new CoursesManager();
       
       coursesManager.registerToCourse();
       coursesManager.completeToCourse();
      
	}
      
}
	
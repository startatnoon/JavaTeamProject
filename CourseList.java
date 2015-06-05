import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CourseList implements Comparable<Course> {

/* •	The ability for students to view an alphabetical list of courses
that includes the course identification number, course dates, name, brief summary,
the enrollment limit, and the number of students already enrolled */

private ArrayList<Course> courseCatalog;


  public String getList(ArrayList courses) {
	  System.out.println("You are currently enrolled in:\n");
	  for(Course a: courses) {
		  //for each course assemble information
	   		  System.out.println("Course " +
	   		  a.getCourseId() + " from " + a.getStartDate() + " to " + a.getEndDate() + ".  " +
	   		  a.getCourseName() + ": " +  a.getSummary() + " " +
	   		  (int) (a.getAvailableSeats() + a.getStudentsRegistered()) + " total seats with " +
	          a.getAvailableSeats() + "students already enrolled.\n");
    		}
	}

/*	public static Comparator<Course> CourseNameComparator = new Comparator<Course>() {

	   	public int compare(Course c1, Course c2) {
	   	   String courseName1 = c1.getCourseName().toUpperCase();
	   	   String courseName2 = c2.getCourseName().toUpperCase();

	   	   return courseName1.compareTo(courseName2);
	   	}
	}*/


   public String getAll() {
 		Collections.sort(listOfStudent,new Comparator<Course>(){
		                     	   	public int compare(Course c1, Course c2) {
							 	   	   String courseName1 = c1.getCourseName().toUpperCase();
							 	   	   String courseName2 = c2.getCourseName().toUpperCase();

							 	   	   return courseName1.compareTo(courseName2);
	   	}});

	   System.out.println("Course Catalog:\n");

	   	  for(Course b: courseCatalog) {
	   		  //for each course assemble information
	   		  System.out.println("Course " +
	   		  b.getCourseId() + " from " + b.getStartDate() + " to " + b.getEndDate() + ".  " +
	   		  b.getCourseName() + ": " +  b.getSummary() + " " +
	   		  (int) (b.getAvailableSeats() + b.getStudentsRegistered()) + " total seats with " +
	          b.getAvailableSeats() + "students already enrolled.\n");
    		}
   }  //end getAll()

  public void addCourse(Course tempCourse) {
	  courseCatalog.add(tempCourse);
  }
   public void removeCourse(Course tempCourse) {
	  courseCatalog.remove(courseCatalog.indexOf(tempCourse));
  }

}

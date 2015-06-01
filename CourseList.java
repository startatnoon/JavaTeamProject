import java.util.ArrayList;
import java.util.Collections;

public class CourseList implements Comparable {

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

   public String getAll() {
	   Collections.sort(courseCatalog); /*if this doesn't work may need to look into 
	   http://docs.oracle.com/javase/6/docs/api/java/lang/Comparable.html#compareTo(T)  and
	   http://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property*/
	   System.out.println("Course Catalog:\n");
	   
	   	  for(Course b: courseCatalog) {
	   		  //for each course assemble information
	   		  System.out.println("Course " +
	   		  b.getCourseId() + " from " + b.getStartDate() + " to " + b.getEndDate() + ".  " +
	   		  b.getCourseName() + ": " +  b.getSummary() + " " +
	   		  (int) (b.getAvailableSeats() + b.getStudentsRegistered()) + " total seats with " +
	          b.getAvailableSeats() + "students already enrolled.\n");
    		}
   }

  public void addCourse(Course tempCourse) {
	  courseCatalog.add(tempCourse);
  }
   public void removeCourse(Course tempCourse) {
	  courseCatalog.remove(courseCatalog.indexOf(tempCourse));
  }

}

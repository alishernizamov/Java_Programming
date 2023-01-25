package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //StudentGroup HAS a Student

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) { //creates the StudentGroup object by setting th groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;

        //students = new ArrayList<>();//instantiated
    }

    public void addStudent(Student student) {
        students.add(student);
    } //Takes one student object and adds it to the arrayList of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } //Takes one array of students and adds them array of students to the arrayList of students

    //overloading the add students method
    public void addStudent(String name, int age, char gender, String ID) {         //Student student = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, ID));
    }

    //takes an ID and removes student
    public void removeStudent(String ID){
        students.removeIf( p -> p.ID.equals(ID) );
    }


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students.size() + //number fo students in the group
                '}';
    }
}

/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */

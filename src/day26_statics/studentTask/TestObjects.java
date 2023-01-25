package day26_statics.studentTask;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");

        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3, student4, student5}; //student2 - 3 were added to this array

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1); //

        group1.addStudent(student1); //added student1 object with this method to group1

        group1.addStudent(students); //added an array of students with this method

        group1.addStudent("Khashavar", 34, 'M', "F35"); //added a student by name

        System.out.println(group1);

        //remove student
        group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

        for (Student each : group1.students) {
            System.out.println(each.name +" : "+ each.ID);
        }


        System.out.println("--------------------Home Work---------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);

        StudentsGroup[] groups = {group1, group2, group3, group4};

        //iterate groups to get the students' names




    }
}

/*
3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentsGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
 */

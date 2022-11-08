public class Person {
    private String fullName;
    private char gender;
    private String email;

    public Person(String fullName, char gender, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
    }
    public Person(){

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void timetable(Student[] allStudents) {
        for (Student student : allStudents) {
            if (student.getProgram().equals("Java-8 teoriya")){
                System.out.println("Lesson Java 8 teoriya start 18:00 PM for students "+student.getFullName().toString());
            }else if (student.getProgram().equals("Java-8 day")) {
                System.out.println("Lesson Java 8 day start 11:00 AM for students "+student.getFullName().toString());
            }else if (student.getProgram().equals("Java-8 evening")){
                System.out.println("Lesson Java 8 evening start 18:00 PM for students "+student.getFullName().toString());
            }else if(student.getProgram().equals("Java 8 online")){
                System.out.println("Lesson Java 8 online start 18:00 PM for students "+student.getFullName().toString());
            }
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}

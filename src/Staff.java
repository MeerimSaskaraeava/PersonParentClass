public class Staff extends Person{
    private String school;
    private double salary;
    private Student[]students;

    public Staff(){}

    public Staff(String fullName, char gender, String email, String school, double salary, Student[] students) {
        super(fullName, gender, email);
        this.school = school;
        this.salary = salary;
        this.students = students;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    void maxMinSalary(Staff[] staffs){
        double max=staffs[0].getSalary();
        double min=staffs[0].getSalary();
        for (Staff staff : staffs) {
            max=Math.max(max,staff.getSalary());
            min=Math.min(min,staff.getSalary());
        }
        System.out.println("Max salary: "+max);
        System.out.println("Min salary: "+min);
    }
    void allStaff(Staff[] staffs){
        for (Staff staff : staffs) {
            System.out.println(staff.toString());

        }
    }
}

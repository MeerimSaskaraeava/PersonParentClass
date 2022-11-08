public class Student extends Person{
    private String program;
    private int year;
    private  double fee;

    public Student(){}

    public Student(String fullName, char gender, String email, String program, int year, double fee) {
        super(fullName, gender, email);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    void findFemale(Student[] allStudents){
        int counter=0;
        for (Student allStudent : allStudents) {
            if (allStudent.getGender()=='F') {
                System.out.println(allStudent.toString());
            counter++;}
        }System.out.println(counter+" qty female students");
    }
    void totalFee(Student[] allStudents){
        int counter = 0;
        double fee = 0;
        for (Student allStudent : allStudents) {
                counter++;
                fee=allStudent.getFee();}
        System.out.println("students  "+counter+" qty * "+fee+" total: "+(counter*fee));
    }
}

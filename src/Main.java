import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);

        Person person=new Person();
        Staff staff=new Staff();
        Student student=new Student();

        Student student1=new Student("Askar Sydykov",'M',"askarsydykov@gmail.com","Java-8 teoriya",2000,12000);
        Student student2=new Student("Jibek Smatova",'F',"smatova@gmail.com","Java-8 teoriya",1996,12000);
        Student student3=new Student("Erkin Orozov",'M',"orozov@gmail.com","Java-8 teoriya",1999,12000);
        Student student4=new Student("Chinara Ergeshova",'F',"ergeshova@gmail.com","Java-8 teoriya",1999,12000);
        Student[]students1={student1,student2,student3,student4};

        Student student5=new Student("Adil Aitbaev",'M',"aitbaevadil17@gmail.com","Java-8 day",2001,12000);
        Student student6=new Student("Aigerim Bektenova",'F',"abdulakimovaaigerim205@gmail.com","Java-8 day",1999,12000);
        Student student7=new Student("Kutman Kaseiinov",'M',"kkutman18@gmail.com","Java-8 day",1998,12000);
        Student student8=new Student("Zamirbek kyzy Milana",'F',"milanaamanova17@gmail.com","Java-8 day",2002,12000);
        Student[]students2={student5,student6,student7,student8};

        Student student9=new Student("Chyngyz Turusbek uulu",'M',"chyngyzturusbekov1@gmail.com","Java-8 evening",2001,12000);
        Student student10=new Student("Kanykei Akjoltoi kyzy",'F',"akjoltoikyzykanykei@gmail.com","Java-8 evening",1999,12000);
        Student student11=new Student("Malikov Nurzhigit",'M',"nurchik.malikov@gmail.com","Java-8 evening",1998,12000);
        Student student12=new Student("Zarina Sydykova",'F',"zsydykova401@gmail.com","Java-8 evening",2002,12000);
        Student[]students3={student9,student10,student11,student12};

        Student student13=new Student("Iskhak Abdukhamitov",'M',"abdulhamitov.bstn@gmail.com","Java-8 online",2001,12000);
        Student student14=new Student("Lira Kanaatova",'F',"lira.kanaatova.ch@gmail.com","Java-8 online",1984,12000);
        Student student15=new Student("Kanaibek uulu Baiel",'M',"nurseiit.nurs@gmail.com","Java-8 online",1998,12000);
        Student student16=new Student("Madina Halikova",'F',"halikovamadina656@gmail.com","Java-8 online",2002,12000);
        Student[]students4={student13,student14,student15,student16};

        Staff staff1=new Staff("Aijamal Asangazieva",'F',"aa.asangazieva@gmail.com","Peak soft house",1456.76,students1);
        Staff staff2=new Staff("Rahim Kurbanov",'M',"rahimkurbanov45@gmail.com","Peak soft house",1367.90,students2);
        Staff staff3=new Staff("Mukhammed Toichubai uulu",'M',"muhammedtoichubai@gmail.com","Peak soft house",1366.56,students3);
        Staff staff4=new Staff("Maksat Akyl",'M',"maxakylbek@gmail.com","Peak soft house",1356.87,students4);
        Student[] allStudents={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10,student11,student12,student13,student14,student15,student16};
        Staff[]staffs={staff1,staff2,staff3,staff4};

        System.out.println("Method time table - 1, method max min salary- 2, method all staff- 3, method find female & their qty-4," +
                " method total fee-5");
        int choose= scanner1.nextInt();
        if (choose == 1) {
        person.timetable(allStudents);}
        else if (choose==2) {
        staff.maxMinSalary(staffs);}
        else if (choose==3) {
        staff.allStaff(staffs);}
        else if (choose==4) {
        student.findFemale(allStudents);}
        else if (choose==5) {
        student.totalFee(allStudents);}

    }
}
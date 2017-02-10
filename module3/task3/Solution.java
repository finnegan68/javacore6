package module3.task3;


import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course javaCourse = new Course(new Date(20), "GoIT Java");
        Course pythonCourse = new Course(new Date(14), "Python for beginners");
        Course charismaCourse = new Course(36, "Improve your charisma with John","John Jones");
        Course mathCourse = new Course(50, "Math Course", "Pifagor");
        Course leadership = new Course(25, "Be a LEADER!", "Brian Tracy");
        Student ilya = new Student("Ilya", "Prokopenko", 31);
        Student ann = new Student("Petrova",new Course[] {javaCourse, mathCourse});
        CollageStudent petr = new CollageStudent("Peter", "Parker", 32);
        CollageStudent liza = new CollageStudent("Ololosh", new Course[] {leadership, charismaCourse});
        CollageStudent alex = new CollageStudent("Alex","Brown", 43, "Niagara collage", 5, 3214);
        SpecialStudent spec1 = new SpecialStudent("James", "Bond", 6,"Mi6",5,007);
        SpecialStudent spec2 = new SpecialStudent("Nyasha", new Course[] {pythonCourse});
        SpecialStudent spec3 = new SpecialStudent("Bruce","Lee", 3, 45678);
    }

}

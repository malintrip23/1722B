public class Problema5_Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Malin");
        person.setEmail("malin@yahoo.com");

        Student student = new Student();
        int[] grades = {10, 9, 9, 8};
        student.setGrades(grades);
        student.setName("Sergiu");
        student.setEmail("sergiu@gmail.com");

        Profesor profesor = new Profesor();
        String[] courses = {"Info", "Engleza"};
        profesor.setCourses(courses);

    }
}

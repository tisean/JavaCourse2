package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 13);
        Schoolar schoolar2 = new Schoolar("Мария", 15);

        Student student1 = new Student("Николай", 20);
        Student student2 = new Student("Ксения", 18);

        Employee employee1 = new Employee("Заур", 32);
        Employee employee2 = new Employee("Михаил", 47);

        Team <Schoolar> schoolarTeam = new Team<>("Драконы");
        Team <Student> studentTeam = new Team<>("Тараканы");
        Team <Employee> employeeTeam = new Team<>("Мутанты");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team <Schoolar> schoolarTeam2 = new Team<>("Помидоры");
        Schoolar schoolar3 = new Schoolar("Олег", 16);
        Schoolar schoolar4 = new Schoolar("Катя", 14);

        schoolarTeam.playWith(schoolarTeam2);














    }
}

package comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(105, "Zaur", "Tregulov", 123456);
        Employee emp2 = new Employee(100, "Sergey", "Tit", 234567);
        Employee emp3 = new Employee(103, "Svetlana", "Polevik", 345678);
        Employee emp4 = new Employee(108, "Sergey", "Abramov", 456789);

        Arrays.sort(new Employee [] {emp1, emp2, emp3, emp4}); //компилятор не ругугается

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println(list);
        Collections.sort(list); //компилятор ругается без implements Comparable
        System.out.println(list);

    }
}


class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Employee{");
//        sb.append("id=").append(id);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", surname='").append(surname).append('\'');
//        sb.append(", salary=").append(salary);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) { // ещё ожин способ сравнения, придерживаться одного способа
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }


//        return this.id-anotherEmp.id; //обычный способ для сравнения

//        return this.id.compareTo(anotherEmp.id); //более редкий способ сравнения (нужно исп-ть Integer, а не int

//        return this.name.compareTo(anotherEmp.name); //способ при сравнении объектов по String

        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0){
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;

    }

}

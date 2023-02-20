
public class Employee {
    String name;
    String surname;
    float salary;

    public Employee(String name, String surname, float salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
       // return " Name: " + name + " \n Surname: " + surname + "\n Salary: " + salary +"\n";
        return "Salary for " +name + " " +  surname +" is " + salary + "\n";
    }

    }


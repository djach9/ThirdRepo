import java.util.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Company comp = new Company();

        addingNewEmployee(console, comp.listofemployee);

        for (int i=1;i<5;i++){
            addingNewEmployee(console, comp.listofemployee);
        }

        optionsForUser(console, comp.listofemployee);

        GenerateAllData(comp.listofemployee);

        for (int i=0;i<5;i++){
            addingNewEmployee(console, comp.listofemployee);
        }

    }

    private static void GenerateAllData(ArrayList<Employee> listofemployee) {
        for (Employee e: listofemployee) {
            System.out.println(e);
        }
    }

    private static void optionsForUser(Scanner console, ArrayList<Employee> listofemployee) {
        System.out.println("""
                Choose a option\s
                1 – Print sum of all employees salary

                2 – Display all employees data

                3 – Add new employee

                4 – End program""");
        int option= console.nextInt();

        switch(option)
        {
            case 1: Allsalaries(listofemployee); optionsForUser(console, listofemployee);
            case 2: GenerateAllData(listofemployee); optionsForUser(console, listofemployee);
            case 3: addingNewEmployee(console, listofemployee); optionsForUser(console, listofemployee);
            case 4: break;
        }
    }

    private static void addingNewEmployee(Scanner console, ArrayList<Employee> listofemployee) {
        Employee emp;
        String z, y;
        double x;
        System.out.print("What is Employee Name? \n");
        z = console.next();
        System.out.print("What is Employee Surname? \n");
        y = console.next();

        System.out.print("What is Employee Salary? \n");
        x = console.nextDouble();
        x = checking(console, x);


        emp = new Employee((z), (y), (float) x);
        listofemployee.add(emp);
    }

    private static void Allsalaries(ArrayList<Employee> listofemployee) {
        float sumofsalary = 0;
        for (Employee e : listofemployee) {
            sumofsalary +=e.salary;
        }
        System.out.println("" + sumofsalary);
    }

    private static double checking(Scanner console, double x) {
        if(x ==0) {
            System.out.println("Variables can't be empty");

            System.out.print("What is Employee Salary? \n");
            x = console.nextDouble();
            x = checking(console, x);
        }
        return x;
    }
}



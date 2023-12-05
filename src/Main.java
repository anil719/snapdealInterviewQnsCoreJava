import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*  Qn1 : Assume Employee list of 10 instances &  form a new list of employee which has
            salary greater than 30000 and name start with letter 'A'
         */

          //  Qn2 : Form List of employee names whom has maximum salary in the company

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(50000, "Anil"));
        empList.add(new Employee(25000, "Arun"));
        empList.add(new Employee(48000, "Murali"));
        empList.add(new Employee(50000, "Ajay"));
        empList.add(new Employee(25000, "kalyan"));
        empList.add(new Employee(28000, "navin"));
        empList.add(new Employee(42000, "chandra"));
        empList.add(new Employee(41000, "shravan"));
        empList.add(new Employee(46000, "Asif ali"));
        empList.add(new Employee(50000, "ABCDEF"));

        List<Employee> newList = empList.stream().filter(e->e.getSalary()>30000 && e.getName().startsWith("A"))
                                .toList();

        for(Employee e : newList) System.out.println(e.getName() + " " + e.getSalary());



        //forming 2nd problem answer

        //get Maximum salary in the company first

        int maxSalary = empList.stream().mapToInt(Employee::getSalary).max().getAsInt();
        System.out.println(maxSalary);

        //streaming to for required names
        List<String> list2 = empList.stream().filter(e->e.getSalary() == maxSalary)
                .map(Employee::getName).toList() ;


        //printing answer
        for(String e : list2) System.out.println(e);

    }
}
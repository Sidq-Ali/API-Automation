public class MyMain {
    public static void main(String[] args){
        Person person = new Person();
        Person.Employee employee = person.new Employee();

        person.getFirstName("Sidq");
        person.getLastName("Ali");
        employee.getEmployeeId(5254);
        person.printinfo();
        employee.printinfo();


    }
}

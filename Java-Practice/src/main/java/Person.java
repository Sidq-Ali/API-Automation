public class Person {
    String  Firstname;
    String Lastname;
    int empid;
    public void getFirstName(String firstname){
        this.Firstname = firstname;

    }
    public void getLastName(String lastname){
        this.Lastname = lastname;

    }
    public void printinfo(){
        System.out.println("The First Name of Employee is "+this.Firstname +"The Last Name of Employee"+ this.Lastname);
    }
    class Employee extends Person{
        public void getEmployeeId(int id){
            this.empid = id;

        }
        public void printinfo(){
            System.out.println("The ID"+ this.empid);
        }
    }





}

public class Student {
    String Name;
    int Age;
    String id;

    public void printinfo(){
        System.out.println(this.Age + this.Name + this.id);
    }
    Student(String name, int age, String Id){
        this.Name = name;
        this.Age = age;
        this.id = Id;

    }
}

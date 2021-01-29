public class Person {
    private  String name;
    public String getName(){
        return this.name;
//TODO: return the person's name
    }

    public void setName(String newName){
//TODO: change the name property to the passed value
        this.name = newName;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println( "hello from" + this.name);
    }

    Person(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        Person person5 = new Person("John");
        Person person6 = person1;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person2.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}

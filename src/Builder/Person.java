package Builder;

public class Person {
    private String name;
    private int age;
    private String phone;
    private String address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  static PersonBuilder builder(){
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private Person person;

        public PersonBuilder() {
            person = new Person();
        }

        public PersonBuilder name(String name){
            person.name = name;
            return this;
        }
        public PersonBuilder age(int age){
            person.age = age;
            return this;
        }
        public PersonBuilder address(String address){
            person.address = address;
            return this;
        }
        public PersonBuilder phone(String phone){
            person.phone = phone;
            return this;
        }
        public Person build(){
            return person;
        }
    }
}

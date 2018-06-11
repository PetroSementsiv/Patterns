package CreationPattern.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args){
        Person person = Person.builder().name("Ivan").age(27).address("Ivano-Frankivsk").phone("13451354131").build();
        System.out.println(person);
        Person person2 = Person.builder().name("Vasyl").age(28).address("Ivano-Frankivsk").build();
        System.out.println(person2);
    }
}

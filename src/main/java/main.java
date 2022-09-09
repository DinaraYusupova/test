public class main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Program person = new Program();
        person.age = 19;
        System.out.println(person.checkIsAdult(person.age));
    }
}

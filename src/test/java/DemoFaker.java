import com.github.javafaker.Faker;

public class DemoFaker {
    public static void main(String[] args) {

        //first automation

        Faker faker= new Faker();
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.address().firstName());
        System.out.println(faker.address().lastName());
        System.out.println(faker.chuckNorris().fact());
    }
}

package OOp;

public class TestAuthor {
    public static void main(String[] args){
        Author ahTeck = new Author("Tan Hoang", "hoackhg170@gmail.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@somewhere.com");
        System.out.println("name is: " +ahTeck.getName());
        System.out.println("gender is: " +ahTeck.getGender());
        System.out.println("gender is: " +ahTeck.getEmail());
    }
}

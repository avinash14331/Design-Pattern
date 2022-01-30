package builder;

public class Driver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Avinash","Kumar")
                .phone("9037872999")
                .age(33)
                .address("Asstez Builder").build();
        System.out.println(user.toString());
    }
}

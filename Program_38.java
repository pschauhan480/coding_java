class NewUser {
    public String firstName;
    public String lastName;

    public void output()
    {
        System.out.println(firstName + " " + lastName);
    }
}

public class Program_38 {
    public static void main(String[] args) {
        NewUser user = new NewUser();
        user.firstName = "Sub";
        user.lastName = "Scriber";
        // System.out.println(user.firstName);
        user.output();
    }
}
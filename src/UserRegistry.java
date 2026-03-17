import java.util.HashSet;
import java.util.Set;

/*
Rules:
1. register new users
2. Prevent duplicate usernames
3. Display registered users
 */
public class UserRegistry {
    private Set<String> usernames;

    public UserRegistry() {
        usernames = new HashSet<>();
    }

    public boolean registerUser(String username) {
        if (usernames.contains(username)) {
            return false;
        }
        usernames.add(username);
        return true;
    }

    public void displayUsers() {
        System.out.println("Registered Users: " + usernames);
    }
}

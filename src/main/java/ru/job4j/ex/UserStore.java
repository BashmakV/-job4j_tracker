package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String username) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                result = user;
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("User is not found: " + username);
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not found or has less than 3 letters in username");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("The user is invalid");
            e.printStackTrace();
        } catch (UserNotFoundException eu) {
            System.out.println("The user is not found");
            eu.printStackTrace();
        }
    }
}

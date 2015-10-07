import java.util.Scanner;

/**
 * Created by Polina on 30.09.2015.
 */
public class AuthorizationService {

    private UserStore userStore;

    public AuthorizationService(UserStore userStore) {
        this.userStore = userStore;
    }

    void startAuthorization() {
        if (isLogin()) {
            login();
        } else {
            creatUser();
            //login();
        }
    }

    User login() {
//            1. Ask for name
//            2. Ask for password
//            3. Ask UserStore for user:  userStore.getUser(name, pass)

        System.out.println("Enter your Name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (userStore.isUserExist(name)) {
            System.out.println("Enter your Password!");
            String pass = scanner.next();

            if (userStore.getUser(name, pass) != null) {
                System.out.println("Congrats!");
            } else {
                System.out.println(" Password is not True:(, try to join !");
                login();
            }
        } else {
            System.out.println("You dont't find in our base,Please auttorization");
            startAuthorization();
        }


        return null;
    }

    User creatUser() {
        // 1. Ask for name
        // 2. Ask for pass
        // 3. Add user to UserStore: userStore.addUser(user)
        WorkWithFile workfile = new WorkWithFile();
        System.out.println("Enter your Name!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (userStore.isUserExist(name)) {
            System.out.println("name is busy, write smh another");
            creatUser();
        }

        System.out.println("Enter your Password!");
        String pass = scanner.next();
        User newUser = new User(name, pass);
        userStore.addUser(newUser);
        workfile.WriteUserInFile(workfile.FILE_NAME, newUser);

        System.out.println("Please, join to us!");
        login();
        return null;
    }

    boolean isLogin() {
        System.out.println("Do you want Autorization or Join? if you want Autorizatio,press a , else prees j!");
        Scanner scanner = new Scanner(System.in);
        String auto = scanner.next();
        if (auto.equals("a") == false && auto.equals("j") == false) {
            System.out.println("Invalid input, please try again!");
            isLogin();
        }

        if (auto != null && auto.equals("j")) {
            return true;
        }


        if (auto != null && auto.equals("a")) {

            return false;
        } else {

            return false;
        }
    }
}
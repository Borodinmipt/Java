/**
 * Created by Polina on 30.09.2015.
 */

public class Main {

    public static void main(String[] args) {

        UserStore userStore = new UserStore();
        AuthorizationService service = new AuthorizationService(userStore);

        service.startAuthorization();

    }
}
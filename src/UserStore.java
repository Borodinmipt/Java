import java.util.ArrayList;

/**
 * Created by Polina on 30.09.2015.
 */

public class UserStore {

ArrayList<User> listUser = new ArrayList<>();
    // Вам нужно выбрать, как вы будете хранить ваших пользователей, например в массиве User users[] = new User[100];

    // проверить, есть ли пользователь с таким именем
    // если есть, вернуть true
    boolean isUserExist(String name) {
        boolean isUser = false;
        for (User user: listUser)
        {
            if (user.getName()!=null && user.getName().equals(name))
            {
                isUser=true;
            }
        }
        return isUser;
    }

    // Добавить пользователя в хранилище
    void addUser(User user) {
        listUser.add(user);

    }

    // Получить пользователя по имени и паролю
    User getUser(String name, String pass) {
int numberUser=-1;
        for (int i=0;i<listUser.size();i++)
        {
            if (listUser.get(i).getName()!=null && listUser.get(i).getName().equals(name))
            {
               if(listUser.get(i).getPass()!=null && listUser.get(i).getPass().equals(pass))
               {
                   numberUser=i;
               }
            }
        }
        if(numberUser>=0)
        {
            return listUser.get(numberUser);
        }
        else

        return null;
    }
}
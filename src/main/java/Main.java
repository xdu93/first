import entity.Auto;
import entity.User;
import services.AutoService;
import services.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

//        UserService userService = new UserService();
//        User user = new User("Kira",18);
//        userService.saveUser(user);
//        Auto lada = new Auto("Lada", "red");
//        lada.setUser(user);
//        user.addAuto(lada);
//        Auto tayota = new Auto("Tayota", "black");
//        tayota.setUser(user);
//        user.addAuto(tayota);
//        userService.updateUser(user);

//        UserService userService = new UserService();
//        User user = new User("Gosha",32);
////        userService.saveUser(user);
//        Auto ferrari = new Auto("Tayota", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Lada", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
////        userService.updateUser(user);
////        user.setName("Sasha");
//        userService.updateUser(user);

//        UserService userService = new UserService();
//        User user = new User("Grisha",19);
//        userService.saveUser(user);
//        Auto ferrari = new Auto("Ferrari", "red");
//        user.addAuto(ferrari);
//        Auto ford = new Auto("Ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
//        user.setName("Pahsa");
//        userService.updateUser(user);
//        userService.removeUser(user);

//        UserService userService = new UserService();
//        User user = userService.findUser(22);
//        System.out.println(userService.findAutoById(43).getUser());
//        System.out.println(userService.findAutoById(37).getColor());
//
//        List<Auto> myAutos = new ArrayList<>();
//        myAutos = userService.findUser(22).getAutos();
//        System.out.println(myAutos);
//        while (!myAutos.isEmpty()){
//            System.out.println(myAutos.get(myAutos.size()-1));
//            myAutos.remove(myAutos.size()-1);
//        };

//        List<Auto> updAuto = new ArrayList<>();
//        updAuto = user.getAutos();
//        updAuto.remove(0);
//        user.setAutos(updAuto);

//        userService.updateUser(user);
//        userService.updateUser(user);
//        userService.removeUser(user);
//        List<Auto> autos = new ArrayList<>();
//        List<User> users = userService.findAllUsers();
//        Auto tayota = new Auto("Tayota", "black");
//        for (User u:users) {
//            u.setAutos(autos);
//            userService.updateUser(u);
//            userService.removeUser(u);
//            userService.updateUser(u);

//        UserService userService = new UserService();
//        AutoService autoService = new AutoService();
//        autos = autoService.findAllAutos();
//
//        for (Auto a: autos
//             ) {
//            System.out.println(a);
//            autoService.removeAuto(a);
//        }
//
//        for (User u: users
//             ) {
//            System.out.println(u);
////            userService.removeUser(u);
//        }


        UserService userService = new UserService();
        AutoService autoService = new AutoService();
        List<User> users = userService.findAllUsers();
        for (User u: users) {
            userService.removeUser(u);
        }

//        System.out.println(userService.findUser(44));
//        userService.removeUser(userService.findUser(44));

    }


//        userService.updateUser(user);

    }
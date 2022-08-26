package services;

import dao.UserDAOImpl;
import entity.Auto;
import entity.User;

import java.util.List;

public class UserService {

    private UserDAOImpl userDAOImpl = new UserDAOImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return userDAOImpl.findById(id);
    }

    public void saveUser(User user) {userDAOImpl.save(user);}

    public void removeUser(User user) {
        userDAOImpl.delete(user);
    }

    public void updateUser(User user) {
        userDAOImpl.update(user);
    }

    public List<User> findAllUsers() {
        return userDAOImpl.findAll();
    }

    public Auto findAutoById(int id) {
        return userDAOImpl.findAutoById(id);
    }

}

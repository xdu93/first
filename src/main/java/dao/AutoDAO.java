package dao;

import entity.Auto;
import entity.User;

import java.util.List;

public interface AutoDAO {

    void delete(Auto auto);
    void update(Auto auto);
    List<Auto> findAll();
}

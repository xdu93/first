package services;

import dao.AutoDAOImpl;
import entity.Auto;
import entity.User;

import java.util.List;

public class AutoService {

    private AutoDAOImpl autoDAOIml = new AutoDAOImpl();

    public void removeAuto(Auto auto) {
        autoDAOIml.delete(auto);
    }

    public void updateAuto(Auto auto) {
        autoDAOIml.update(auto);
    }

    public List<Auto> findAllAutos() {
        return autoDAOIml.findAll();
    }
}

package dao;

import entity.Auto;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class AutoDAOImpl implements AutoDAO{
    @Override
    public void delete(Auto auto) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(auto);
        tx1.commit();
        session.close();
        System.out.println("Auto removed");
    }

    @Override
    public void update(Auto auto) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.merge(auto);
        tx1.commit();
        session.close();
    }

    @Override
    public List<Auto> findAll() {
        List<Auto> autos = (List<Auto>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Auto ").list();
        return autos;
    }
}

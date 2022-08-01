package cinema.project.dao.impl;

import cinema.project.dao.OrderDao;
import cinema.project.exception.DataProcessingException;
import cinema.project.lib.Dao;
import cinema.project.model.Order;
import cinema.project.model.User;
import cinema.project.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class OrderDaoImpl implements OrderDao {
    @Override
    public Order add(Order order) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add order to db. Order: " + order, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return order;
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Order> query = session.createQuery("FROM Order o "
                    + "LEFT JOIN FETCH o.tickets t "
                    + "LEFT JOIN FETCH o.user u "
                    + "LEFT JOIN FETCH t.movieSession m "
                    + "LEFT JOIN FETCH m.cinemaHall "
                    + "LEFT JOIN FETCH m.movie "
                    + "WHERE u = :user", Order.class);
            query.setParameter("user", user);
            return query.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get orders by User: " + user, e);
        }
    }
}

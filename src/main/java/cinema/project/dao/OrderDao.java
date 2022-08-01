package cinema.project.dao;

import java.util.List;
import cinema.project.model.Order;
import cinema.project.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}

package cinema.project.service;

import java.util.List;
import cinema.project.model.Order;
import cinema.project.model.ShoppingCart;
import cinema.project.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}

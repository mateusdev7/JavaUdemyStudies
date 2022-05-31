package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private OrderStatus status;
    private Date moment;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(OrderStatus status, Date moment, Client client) {
        this.status = status;
        this.moment = moment;
        this.client = client;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}

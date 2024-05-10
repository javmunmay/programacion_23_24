package U9.T3PreparedStatements;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private Employee employee;
    private List<Product> products;

    public Order(int id, Customer customer, Employee employee, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

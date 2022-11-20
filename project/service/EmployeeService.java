package warehouse.project.service;

import warehouse.project.entity.Product;
import warehouse.project.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void printAllProducts(List<Product> products);

    void printAllProductsSortedByOption(List<Product> products, String option);

    void printProduct(List<Product> products, int id, String productName);

    void printAllProductsWithPriceHigherThanCurrent(List<Product> products, double price);

    void printAllProductsWithPriceLowerThanCurrent(List<Product> products, double price);

    void printAllProductsWithQuantityHigherThanCurrent(List<Product> products, int quantity);

    void printAllProductsWithQuantityLowerThanCurrent(List<Product> products, int quantity);

    void addProduct(List<Product> products, Product product);

    void changeProductPrice(List<Product> products, int productId, double price);

    void changeProductQuantity(List<Product> products, int productId, int quantity);

    void changeProductName(List<Product> products, int productId, String name);

    void removeProduct(List<Product> products, int productId);

    void printEmployeesSortedByOption(List<Employee> employees, String option);

    void printEmployeeMenu();

    void login(int id, String name);

    void operationsManagement(String operation);
}

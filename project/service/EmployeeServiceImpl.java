package warehouse.project.service;

import warehouse.project.entity.Employee;
import warehouse.project.entity.Product;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void printAllProducts(List<Product> products) {

    }

    @Override
    public void printAllProductsSortedByOption(List<Product> products, String option) {

    }

    @Override
    public void printProduct(List<Product> products, int id, String productName) {

    }

    @Override
    public void printAllProductsWithPriceHigherThanCurrent(List<Product> products, double price) {

    }

    @Override
    public void printAllProductsWithPriceLowerThanCurrent(List<Product> products, double price) {

    }

    @Override
    public void printAllProductsWithQuantityHigherThanCurrent(List<Product> products, int quantity) {

    }

    @Override
    public void printAllProductsWithQuantityLowerThanCurrent(List<Product> products, int quantity) {

    }

    @Override
    public void addProduct(List<Product> products, Product product) {

    }

    @Override
    public void changeProductPrice(List<Product> products, int productId, double price) {

    }

    @Override
    public void changeProductQuantity(List<Product> products, int productId, int quantity) {

    }

    @Override
    public void changeProductName(List<Product> products, int productId, String name) {

    }

    @Override
    public void removeProduct(List<Product> products, int productId) {

    }

    @Override
    public void printEmployeesSortedByOption(List<Employee> employees, String option) {

    }

    @Override
    public void printEmployeeMenu() {
        System.out.printf("What do you want ot do ? \n 1 print all products \n 2 print all products sorted by :" +
                "name, price, expire date ( when there is such a date) \n 3 Printing certain products by ID or name " +
                " \n 4 printing all products with price equals or higher than price entered from the user \n " +
                "5 printing all products with price equals or lower than price entered from the user \n " +
                "6 Print all products with a quantity greater than or equal to the user defeat quantity \n " +
                "7 Print all products with quantity less than user specified quantity \n " +
                "8 adding a product\n " +
                "9 Change the price of a product (by id) \n " +
                "10 Change the quantity of a product (by id) \n" +
                "11 Change product name (by id) \n" +
                "12 Deleting a product (by id) \n " +
                "Sorting employees (by name or salary ");
    }

    @Override
    public void login(int id, String name) {
        //TODO: invoke operationsManagement method after successful login
    }

    @Override
    public void operationsManagement(String operation) {

        //TODO: Implement loop which include printEmployeeMenu method and will process some of the chosen operations

    }
}

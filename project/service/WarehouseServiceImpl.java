package warehouse.project.service;

import warehouse.project.entity.Warehouse;

public class WarehouseServiceImpl implements WarehouseService {

    private EmployeeServiceImpl employeeService;
    private CustomerServiceImpl customerService;

    public void loginInWarehouse() {

        //TODO: Implement logic to enter file's names and invoke 'processFile' method





        //TODO: if person is logged in as customer or employee successfully then setup service needed

        if (CUSTOMER) {
            this.customerService = new CustomerServiceImpl();
        } else if (EMPLOYEE) {
            this.employeeService = new EmployeeServiceImpl();
        }

        //TODO: invoke processFile method

        //TODO: invoke processMenu method

    }

    public Warehouse processFile(String fileName) {
        // TODO: Implement logic to read csv file

        // TODO: Invoke parse data from csv file to Warehouse object and return it

    }

    public void processMenu(String menuName) {
        switch (menuName) {
            case "CUSTOMER" : customerService.printCustomerMenu();
            case "EMPLOYEE": employeeService.login();
        }
    }
}

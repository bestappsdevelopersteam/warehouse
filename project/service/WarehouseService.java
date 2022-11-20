package warehouse.project.service;

import warehouse.project.entity.Warehouse;

public interface WarehouseService {

    void loginInWarehouse();

    Warehouse processFile(String fileName);

    void processMenu(String menuName);
}

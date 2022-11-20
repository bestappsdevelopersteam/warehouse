package warehouse.project;
import warehouse.project.entity.Warehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WarehouseManagementSystem {
    public static void main(String[] args) {

        //TODO: call loginInWarehouse method

//        ArrayList<Product> products = new ArrayList<>();
//
//        do {
//            switch (whoYouAre()) {
//                case "Employee":
//                    break;
//                case "Customer":
//
//            }
//            System.out.println("Press enter to continue or input \"exit\" to close the program.");
//        } while (!(sc.nextLine()).equals("exit"));
//    }
//
//    private static boolean validateInput(String input) {
//        if (input.equalsIgnoreCase("Customer") || input.equalsIgnoreCase("Employee") ) {
//            return true;
//        }
//        System.out.println("Invalid command! Try again!");
//        return false;
//    }
//
//    private static String whoYouAre() {
//        System.out.println("Are you Customer or Employee ?");
//        String command;
//        while (!validateInput(command = sc.nextLine())) {
//        }
//        return command;
//    }




        String file = "file";
        BufferedReader reader = null;
        String line = "";

        String [] inputEmployees = null;
        String [] inputProducts = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                inputEmployees = line.split(",");
                inputProducts = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Warehouse warehouse = Warehouse.parseDataToObject(inputEmployees, inputProducts);


    }

}

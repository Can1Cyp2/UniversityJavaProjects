package ;

import java.util.Objects;

public class VendingMachine {
        // TODO: implement this class
        final int NUM_OF_PRODUCTS = 4;  // The number of products in the vending machine

        String message = "Empty VM Started";     // The message the vending machine is displaying

        int[] units = { 0, 0, 0, 0 };  // The units of products in the vending machine

        String[] products = {   // The products in the vending machine
                "Cheetos Crunchy",
                "Coke",
                "Doritos Nacho Cheese",
                "Red Bull",
        };




        public String getMessage(){
            // Gets the current message on the vending machine
            return this.message;
        }


        public String checkStock(){
            // Checks stock of items in vending machine

            int count = 0; // The number of items in the vending machine
            String items = "Stock: "; // The items and stock

            for (int x = 0; x < NUM_OF_PRODUCTS; x++) {
                count += units[x];

                // Building the output string:
                items += products[x] + " (" + units[x] + ")";

                if (x != NUM_OF_PRODUCTS - 1) items += ", ";
            }

            return items;
        }


        public String checkStock(String product){
            // Checks stock of an item in vending machine

            int stock = 0; // The amount of units left of an item
            String items = ""; // The items and stock

            for (int x = 0; x < NUM_OF_PRODUCTS; x++){

                if (product.equals(products[x])){
                    stock = units[x];

                    // Making the output string:
                    items = products[x] + " (" + units[x] + ")";

                    break; // Exits the loop because items are set
                }

                else if (x == NUM_OF_PRODUCTS - 1){
                    items = "Invalid product: " + product;
                }
            }

            return items;
        }


        public void add(String product, int stock) {
            // Adds units to the stock of a product if valid

            for (int x = 0; x < NUM_OF_PRODUCTS; x++) {
                if (product.equals(products[x])) {
                    units[x] += stock;
                    message = "Product added: " + product + " (" + stock + ")";
                    break; // Exits the loop because the message is completed and stock is updated
                }

                else if (x == NUM_OF_PRODUCTS - 1) {
                    message = "Invalid product: " + product;
                }

            }
        }


        public void dispense(String product, int stock){
            // Dispenses units from the vending machines stock if valid

            for (int x = 0; x < NUM_OF_PRODUCTS; x++){
                if (product.equals(products[x])){
                    units[x] -= stock;
                    message = "Product removed: " + product + " (" + stock + ")";
                    break; // Exits the loop because the message is completed and stock is updated
                }

                else if (x == NUM_OF_PRODUCTS - 1){
                    message = "Invalid product: " + product;
                }
            }
        }

}

package lab4;

import org.junit.Test;

import static org.junit.Assert.*;


public class VendingMachineTest {
    /*
     * Tests included in this class serve as documentation on how instances of a vending machine work.
     */

    /*
     * Tests related to an initial, empty vending machine
     */
    @Test
    public void test_VendingMachine_01a() {
        VendingMachine vm = new VendingMachine();
        String result = vm.getMessage();
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01b1() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock("Coke");
        assertEquals("Coke (0)", result);
        result = vm.getMessage(); // status remains initialized
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01b2() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock("Cheetos Crunchy");
        assertEquals("Cheetos Crunchy (0)", result);
        result = vm.getMessage(); // status remains initialized
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01b3() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock("Doritos Nacho Cheese");
        assertEquals("Doritos Nacho Cheese (0)", result);
        result = vm.getMessage(); // status remains initialized
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01b4() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock("Red Bull");
        assertEquals("Red Bull (0)", result);
        result = vm.getMessage(); // status remains initialized
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01b5() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock("Lay's BBQ Chips"); // invalid product name
        assertEquals("Invalid product: Lay's BBQ Chips", result); // Notice the space between colon (:) and the invalid product's name.
        result = vm.getMessage(); // status remains initialized
        assertEquals("Empty VM Started", result);
    }

    @Test
    public void test_VendingMachine_01c() {
        VendingMachine vm = new VendingMachine();
        String result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (0), Coke (0), Doritos Nacho Cheese (0), Red Bull (0)", result);
    }

    /*
     * Tests related to adding stock to the vending machine
     */
    @Test
    public void test_VendingMachine_02() {
        VendingMachine vm = new VendingMachine();

        /*
         * Add stock of Coke
         */
        vm.add("Coke", 5); // this changes the status

        String result = vm.getMessage();
        assertEquals("Product added: Coke (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Coke");
        assertEquals("Coke (5)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (0), Coke (5), Doritos Nacho Cheese (0), Red Bull (0)", result);

        /*
         * Add stock of Cheetos Crunchy
         */
        vm.add("Cheetos Crunchy", 5); // this changes the status

        result = vm.getMessage();
        assertEquals("Product added: Cheetos Crunchy (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Cheetos Crunchy");
        assertEquals("Cheetos Crunchy (5)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (5), Coke (5), Doritos Nacho Cheese (0), Red Bull (0)", result);

        /*
         * Add stock of Doritos Nacho Cheese
         */
        vm.add("Doritos Nacho Cheese", 5); // this changes the status

        result = vm.getMessage();
        assertEquals("Product added: Doritos Nacho Cheese (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Doritos Nacho Cheese");
        assertEquals("Doritos Nacho Cheese (5)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (5), Coke (5), Doritos Nacho Cheese (5), Red Bull (0)", result);

        /*
         * Add stock of Red Bull
         */
        vm.add("Red Bull", 5); // this changes the status

        result = vm.getMessage();
        assertEquals("Product added: Red Bull (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Red Bull");
        assertEquals("Red Bull (5)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (5), Coke (5), Doritos Nacho Cheese (5), Red Bull (5)", result);

        /*
         * Add stock of an invalid product
         */
        vm.dispense("Maltesers Chocolate", 4); // this changes the status

        result = vm.getMessage();
        assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.

        result = vm.checkStock("Maltesers Chocolate");
        assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.

        result = vm.checkStock(); // stock of existing products remain the same
        assertEquals("Stock: Cheetos Crunchy (5), Coke (5), Doritos Nacho Cheese (5), Red Bull (5)", result);
    }

    /*
     * Tests related to reducing stock from the vending machine
     */
    @Test
    public void test_VendingMachine_03() {
        VendingMachine vm = new VendingMachine();

        /*
         * Add stocks of products
         */
        vm.add("Coke", 5);
        vm.add("Cheetos Crunchy", 6);
        vm.add("Doritos Nacho Cheese", 7);
        vm.add("Red Bull", 8);
        String result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (6), Coke (5), Doritos Nacho Cheese (7), Red Bull (8)", result);

        /*
         * Remove stock of Coke
         */
        vm.dispense("Coke", 1); // this changes the status

        result = vm.getMessage();
        assertEquals("Product removed: Coke (1)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Coke");
        assertEquals("Coke (4)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (6), Coke (4), Doritos Nacho Cheese (7), Red Bull (8)", result);

        /*
         * Remove stock of Cheetos Crunchy
         */
        vm.dispense("Cheetos Crunchy", 2); // this changes the status

        result = vm.getMessage();
        assertEquals("Product removed: Cheetos Crunchy (2)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Cheetos Crunchy");
        assertEquals("Cheetos Crunchy (4)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (4), Coke (4), Doritos Nacho Cheese (7), Red Bull (8)", result);

        /*
         * Remove stock of Doritos Nacho Cheese
         */
        vm.dispense("Doritos Nacho Cheese", 3); // this changes the status

        result = vm.getMessage();
        assertEquals("Product removed: Doritos Nacho Cheese (3)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Doritos Nacho Cheese");
        assertEquals("Doritos Nacho Cheese (4)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (4), Coke (4), Doritos Nacho Cheese (4), Red Bull (8)", result);

        /*
         * Remove stock of Red Bull
         */
        vm.dispense("Red Bull", 4); // this changes the status

        result = vm.getMessage();
        assertEquals("Product removed: Red Bull (4)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".

        result = vm.checkStock("Red Bull");
        assertEquals("Red Bull (4)", result);

        result = vm.checkStock();
        assertEquals("Stock: Cheetos Crunchy (4), Coke (4), Doritos Nacho Cheese (4), Red Bull (4)", result);

        /*
         * Remove stock of an invalid product
         */
        vm.dispense("M & M's Chocoloate Bag", 4); // this changes the status

        result = vm.getMessage();
        assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.

        result = vm.checkStock("M & M's Chocoloate Bag");
        assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.

        result = vm.checkStock(); // stock of existing products remain the same
        assertEquals("Stock: Cheetos Crunchy (4), Coke (4), Doritos Nacho Cheese (4), Red Bull (4)", result);
    }

    /*
     * Additional tests related to using a vending machine
     */
    @Test
    public void test_VendingMachine_04() {
        VendingMachine vm = new VendingMachine();

        /* You may add additional, similar tests on other products */

        vm.add("Doritos Nacho Cheese", 7);
        assertEquals("Doritos Nacho Cheese (7)", vm.checkStock("Doritos Nacho Cheese"));
        assertEquals("Stock: Cheetos Crunchy (0), Coke (0), Doritos Nacho Cheese (7), Red Bull (0)", vm.checkStock());

        vm.dispense("Doritos Nacho Cheese", 3);
        assertEquals("Doritos Nacho Cheese (4)", vm.checkStock("Doritos Nacho Cheese"));
        assertEquals("Stock: Cheetos Crunchy (0), Coke (0), Doritos Nacho Cheese (4), Red Bull (0)", vm.checkStock());

        vm.add("Doritos Nacho Cheese", 5);
        assertEquals("Doritos Nacho Cheese (9)", vm.checkStock("Doritos Nacho Cheese"));
        assertEquals("Stock: Cheetos Crunchy (0), Coke (0), Doritos Nacho Cheese (9), Red Bull (0)", vm.checkStock());
    }

}
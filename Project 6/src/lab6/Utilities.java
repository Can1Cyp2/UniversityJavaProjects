package ;



public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers) {
        int count = 0;


        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 3 == 0) {
                count += 1;
            }
        }


        int[] multiples = new int[count];
        count = 0;

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 3 == 0) {
                multiples[count] = numbers[x];
                count += 1;
            }
        }



        return multiples; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers) {


        int count = 0;

        String[] values = new String[numbers.length];

        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y <= x; y++) {
                if (y == 0) {
                    values[x] = "[" + String.valueOf(numbers[y]);
                } else {
                    values[x] += String.valueOf(numbers[y]);
                }

                if (y == x) {
                    values[x] += "]";
                } else {
                    values[x] += ", ";
                }

            }
        }


        return values; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers) {

        
        int output[] = new int[numbers.length];

        int g1Offset = 0;
        int g2offset = 0;
        int g3Offset = 0;

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 3 == 0) g2offset++;
            else if(numbers[x] % 3 == 1) g3Offset++;
        }


        g3Offset += g2offset;

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % 3 == 0) {
                output[g1Offset] = numbers[x];
                g1Offset++;
            }
            else if (numbers[x] % 3 == 1) {
                output[g2offset] = numbers[x];
                g2offset++;
            }
            else if (numbers[x] % 3 == 2) {
                output[g3Offset] = numbers[x];
                g3Offset++;
            }
        }

        return output;
    }



    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray) {


        if (twoDimArray.length == 0) {
            return new int[]{};
        }


        int count = 0; // Counts if there are integers
        for (int x = 0; x < twoDimArray.length; x++) {
            for (int y = 0; y < twoDimArray[x].length; y++) {
                if (twoDimArray[x][y] == (int) twoDimArray[x][y]) {
                    count++;
                }
            }
        }

        if (count == 0) return new int[]{};

        int[] flat = new int[count]; // Makes the array
        count = 0;

        for (int x = 0; x < twoDimArray.length; x++) {
            if (x % 2 == 0) {
                for (int y = 0; y < twoDimArray[x].length; y++) {
                    if (twoDimArray[x][y] == (int) twoDimArray[x][y]) {
                        flat[count] = twoDimArray[x][y];
                        count += 1;
                    }
                }
            }

            else {
                for (int y = twoDimArray[x].length - 1; y >= 0; y--) {
                    if (twoDimArray[x][y] == (int) twoDimArray[x][y]) {
                        flat[count] = twoDimArray[x][y];
                        count += 1;
                    }
                }
            }
        }


        return flat; // You need to replace this line by returning the proper result.

    }
}

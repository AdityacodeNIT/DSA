public class DecimalToBinary {

    public static int getIthBit(int binary, int n) {
        int bitmask = 1 << n;
        int value = binary & bitmask;
        if (value == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void BinaryToDecimal(int binary) {
        int decimal = 0;
        int p = 0;
        int k = 0;
        if (binary == 0) {
            System.out.println(0);
        }

        while (binary != 0) {
            p = binary % 10;

            decimal = decimal + p * (int) Math.pow(2, k);

            binary = binary / 10;
            k++;

        }
        System.out.println(decimal);
    }

    public static void decimalToBinary(int decimal) {
        int binary = 0;
        int p = 0;

        int placeValue = 1;
        while (decimal != 0) {
            p = decimal % 2;

            binary = binary + p * placeValue;

            decimal = decimal / 2;
            placeValue = placeValue * 10;

        }
        System.out.println(binary);
    }





    public static void main(String[] args) {
        int decimal = 1000;
        
        // BinaryToDecimal(decimal);

        System.out.println(getIthBit(decimal, 1));

    }
}

public class DataStructure {
    public static void main(String[] args) {

        // Exercise: Array Initialization and Element Access
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fifth element: " + numbers[4]);

        // Exercise: List Creation and Element Manipulation
        java.util.List<String> fruits = new java.util.ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits list: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

      // Exercise: Basic Two-Dimensional Array Declaration and Access

            int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            System.out.println(numbers[0][0]);
            System.out.println(numbers[1][2]);
            System.out.println(numbers[2][1]);

             // Exercise: Converting Primitive Balance to Class Type and Using Object Methods

                float accountBalancePrimitive = 1000.75f;

                Float accountBalanceObject = accountBalancePrimitive;

                System.out.println(accountBalanceObject);
                System.out.println(accountBalanceObject.toString().length());


    }
}
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

    // Exercise 1: List creation and element manipulation
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits list: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

    // Exercise 2: Integer list modification
        List<Integer> members = Arrays.asList(1, 2, 3, 4, 5);
        members.set(3, 100);

        System.out.println(members);
        System.out.println(members.get(3));

    // Exercise 3: String list operations
        List<String> pilots = new ArrayList<>();
        pilots.add("Maryam");
        pilots.add("Farhat");
        pilots.add("Saida");
        pilots.add("Masouda");
        pilots.add("Saida22");

        System.out.println(pilots);

        pilots.set(1, "Farwa");
        System.out.println(pilots.get(2));

        pilots.remove(2);

        System.out.println(pilots.size());
        System.out.println(pilots);

    // Exercise 4: Nested lists
        List<String> engineers = new ArrayList<>();
        engineers.add("Sediqa");
        engineers.add("Hadid");

        System.out.println(engineers);

        List<List<String>> groups = new ArrayList<>();
        groups.add(engineers);
        groups.add(pilots);

        System.out.println(groups);

    // Exercise 5: HashMap operations
        HashMap<String, Integer> membership = new HashMap<>();
        membership.put("Bob", 22);
        membership.put("John", 33);
        membership.put("Banan", 38);
        membership.put("Hadid", 25);

        System.out.println(membership);
        System.out.println(membership.get("Bob"));
        System.out.println(membership.size());
        System.out.println(membership.containsKey("Bob"));


    }
}
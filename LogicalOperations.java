class LogicalOperations {
    public static void main(String[] args) {

        // Exercise: Fuel Consumption and Remaining Fuel Evaluation
        int fuelCapacity = 1500;
        int consumptionPerHour = 120;
        int flightDurationHours = 2;

        int remainingFuel = fuelCapacity - (consumptionPerHour * flightDurationHours);

        boolean hasEnoughFuelForNextJourney = remainingFuel > (fuelCapacity / 2);

        System.out.println("Enough fuel for the next journey? " + hasEnoughFuelForNextJourney);

        // Exercise: Weather Condition Classification Based on Cloud Coverage

        int cloudCoveragePercentage = 30;

        if (cloudCoveragePercentage < 20) {
            System.out.println("clear skies");
        } else if (cloudCoveragePercentage < 50) {
            System.out.println("partly cloudy skies");
        } else {
            System.out.println("too cloudy skies");
        }

        // Exercise: Comet Speed Evaluation Using Ternary Operator

            int cometSpeed = 60;

            String action = cometSpeed < 50 ? "Chasing comet!" : "Comet too fast, let it go!";
            System.out.println(action);

    }
}

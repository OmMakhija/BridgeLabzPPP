class TravelComputation {
    public static void main(String[] args) {
        // Create a variable name to indicate the person traveling
        String name = "Eric";

        // Cities
        String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

        // Distances
        double distanceFromToVia = 156.6;      // Chennai -> Vellore
        double distanceViaToFinalCity = 211.8; // Vellore -> Bangalore

        // Times (in minutes)
        int timeFromToVia = 4 * 60 + 4;
        int timeViaToFinalCity = 4 * 60 + 25;

        // Totals
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");
    }
}
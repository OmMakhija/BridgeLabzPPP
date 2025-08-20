import java.util.Scanner;

// Program: YoungestTallestFriends
// Purpose: From ages/heights of Amar, Akbar, Anthony — find youngest and tallest
class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int htAmar  = input.nextInt();

        int ageAkbar = input.nextInt();
        int htAkbar  = input.nextInt();

        int ageAnthony = input.nextInt();
        int htAnthony  = input.nextInt();

        String youngest;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony)      youngest = "Amar";
        else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) youngest = "Akbar";
        else                                                  youngest = "Anthony";

        String tallest;
        if (htAmar > htAkbar && htAmar > htAnthony)          tallest = "Amar";
        else if (htAkbar > htAmar && htAkbar > htAnthony)    tallest = "Akbar";
        else                                                  tallest = "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);

        input.close();
    }
}

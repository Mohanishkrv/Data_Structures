
public class Medals {

    public static void main(String[] args) 
    {
        final int COUNTRIES = 10;
        final int MEDALS = 3;
        int gold = 0;
        int silver = 0;
        int bronze = 0;
        String[] countries
                = {
                    "Germany",
                    "Netherlands",
                    "China",
                    "France",
                    "United States",
                    "Sweden",
                    "Austria",
                    "Switzerland",
                    "Norway",
                    "Russia"
                };
        int[][] counts
                = {
                    {8, 5, 2},
                    {6, 4, 2},
                    {5, 3, 2},
                    {3, 6, 2},
                    {7, 6, 3},
                    {5, 3, 3},
                    {5, 6, 4},
                    {3, 0, 5},
                    {9, 5, 7},
                    {4, 6, 8}
                };
        System.out.println(" Country Gold Silver Bronze Total");
        int imax = 0, goldMax = 0;
        for (int i = 0; i < COUNTRIES; i++) {
            if (counts[i][0] >= goldMax) {
                goldMax = counts[i][0];
                imax = i;
            }
            System.out.printf("%15s", countries[i]);
            int total = 0;
            {
                for (int j = 0; j < MEDALS; j++) {
                    System.out.printf("%8d", counts[i][j]);
                    total = total + counts[i][j];
                }
                System.out.printf(("%8d\n"), total);
            }

            gold = gold + counts[i][0];
            silver = silver + counts[i][1];
            bronze = bronze + counts[i][2];
        }
        System.out.printf("\n%15s", "Total Medals:");
        System.out.printf(("%8d%8d%8d"), gold, silver, bronze);
        System.out.println();
        System.out.print("\nWinner of max gold: " + countries[imax] + " with "
                + goldMax + " gold medals");
    }
}

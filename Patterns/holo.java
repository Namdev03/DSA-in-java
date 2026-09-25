public class holo {

    public static void main(String[] arg) {

        int n = 5;

        // Each row
        for (int i = 1; i <= n; i++) {

            // Each column
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else {

                    if (j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }

            System.out.println();
        }

    }   // main()

}       // class

/*
* * * * *
*       *
*       *
*       *
* * * * *
*/
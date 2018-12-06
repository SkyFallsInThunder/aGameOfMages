package exercises;

public class ex_002 {

    public static void main( String[] args){

        // extra large coffee
        // large coffee
        // medium coffee
        // small coffee

        // small coffee
        // medium coffee
        // large coffee
        // extra large coffee

        //roi 2%

        String XC = "extra large coffee";
        String LC = "large coffee";
        String MC = "medium coffee";
        String SC = "small coffee";
        String[] Menu = {XC, LC, MC, SC};
        double XCp = 10.0;
        double LCp = 7.0;
        double MCp = 5.0;
        double SCp = 3.0;
        double [] Price = {XCp, LCp, MCp, SCp};
        double roi = 0.02;

        for (int i = 0; i < 4; i++) {
            System.out.println(Menu[i] + " - " + (Price[i] + (Price[i] * roi)) + " you can thank the govt for that");

        }
        System.out.println("====================");
        for (int i = 3; i >= 0; i--) {
            System.out.println(Menu[i] + " - " + (Price[i] + (Price[i] * roi)) + " you can thank the govt for that");

        }

//        for (int i = 0; i < ; i++) {

//        }

    }


}

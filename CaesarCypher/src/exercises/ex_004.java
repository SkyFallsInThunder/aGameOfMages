package exercises;

public class ex_004 {

    // methods aka functions

    // voids - does not return any results
    // int   - returns a result of type int
    // double   - returns a result of type double
    // String   - returns a result of type String
    // boolean   - returns a result of type boolean
    // *[] - * means any of the aforementioned data types

    public void main(String[] args) {
        // call a method that adds 2 whole numbers
        // and prints the result
        int a = 3;
        int b = 5;
        int c = 4;
        int d = 9;
        int[] test = {1, 2, 3, 4, 5};
        int e = Addition(a, b);
        int f = Multiplication(Addition(a, b), Addition(a, b));
//        Addition(test);
//        Addition(a, b);
//        Addition(a, b, c);
//        Addition(a, b, c, d);
        System.out.println(f);
        System.out.println(Multiplication(e, e));
        // extend your method, so that it adds 3 numbers

        Mage myProgrammingSkillz = new Mage("myProgrammingSkillz");

        myProgrammingSkillz.castFireball();

//        NPC Djon = new NPC("Nerries");



//        Djon.takeDamage (12.5);


    }

    static int Addition(int first, int second) {

//        System.out.println(first + second);
        return first + second;
    }

    static int Multiplication(int first, int second) {

//        System.out.println(first + second);
        return first * second;
    }

    static void Addition(int first, int second, int third) {

        System.out.println(first + second + third);

    }
    static void Addition(int first, int second, int third, int fourth) {

        System.out.println(first + second + third + fourth);

    }
    static int Addition(int[] potato) { //adds an array of numbers
        int tempResult = 0;
        for (int i = 0; i <= potato.length; i++) {
            tempResult += i;

        }
        return tempResult;
//        System.out.println( tempResult );


    }
}

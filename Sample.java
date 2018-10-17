package samplePackage;

public class Sample {

    static void findMultiples(int n) {
        int a = 3; // To check multiples of 3
        int b = 5; // To check multiples of 5 
        for (int i = 1; i <= n; i++) {
            String gameString = "";

            if (i == a) {
                a = a + 3; 
                gameString = gameString + "Fizz"; //Multiple of 3.
            }

           
            if (i == b) {
                b = b + 5; 
                gameString = gameString + "Buzz"; //Multiple of 5.
            }

            if (gameString == "")
                System.out.println(i);
            else
                System.out.println(gameString);
        }
    }

    public static void main(String[] args) {
        findMultiples(100);
    }
}

package gr.aueb.cf.lef.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfSecondo = cf.indexOf("o", 2); //11 //ψαχνει για ο απο τη ΔΕΥΤΕΡΗ θεση και μετα
        int lastPositionOfo = cf.lastIndexOf("o"); //11

        String cf2 = cf.substring(0, 5); // Παίρνει μέχρι δύο παραμέτρους που ο πρώτος ειναι το start index και ο δέυτερος είναι ο end index -1

        System.out.println(cf2);
    }
}

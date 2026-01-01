/// Question no 1 ///

public class Task1 {
    public static void main(String[] args) {

        int totalTime = 3456789;
        int year = totalTime / (60 * 24 * 365);
        int days = (totalTime / 1440) % 365;

        System.out.println(totalTime + " minutes is approximately "+ year + " years " + days + " days");
    }
}

/// Question no 2 ///

public class Task2 {
    public static void main(String[] args) {

        int a = 2, b = 5, c = 8;
        
        int d = ((2*b) * ((c - a) / 3)) + 7;
        
        System.out.println(d);
    }
}

/// Question no 3 ///

public class Task3 {
    public static void main(String[] args) {

        int id = 1000054943;
        
        int lastTwoDigit = id % 100;

        System.out.println( lastTwoDigit % 10 );
        System.out.println( lastTwoDigit / 10 );

    }
}

/// Question no 4 ///

public class Task4 {
    public static void main(String[] args) {

        int length = 10;
        int width = 13;
        double diagonal = Math.sqrt( (length * length) + (width * width) );

        System.out.printf("Shortest distance = %.3f", diagonal);
    }
}

/// Question no 5 ///

public class Task5 {
    public static void main(String[] args) {

        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt( (a * a) + ( b * b) );

        double sinA = a / c;
        double sinB = b / c;
        double cosA = b / c;
        double cosB = a / c;

        System.out.printf("Sin A = %.2f\nCos A = %.2f\nSin B = %.2f\nCos B = %.2f", sinA, cosA, sinB, cosB);

    }
}

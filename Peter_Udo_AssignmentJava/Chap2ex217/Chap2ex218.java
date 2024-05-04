package Chap2ex217; 
/*
 * (Displaying Shapes with Asterisks) 
 * Write an application that displays a box, an oval,
 * an arrow and a diamond using asterisks (*)
 */

public class Chap2ex218{

    public static void main(String[] args) {
        drawBox(); 
        System.out.println();
        drawOval();
        System.out.println();
        drawArrow();
        System.out.println();
        drawDiamond();
    }

    // Method to draw a box
    public static void drawBox() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to draw an oval
    public static void drawOval() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (((i == 1 || i == 5) && (j >= 3 && j <= 8)) ||
                    ((i == 2 || i == 4) && (j >= 2 && j <= 9)) ||
                    (i == 3 && (j >= 1 && j <= 10))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to draw an arrow
    public static void drawArrow() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && (j == 3)) ||
                    (i == 2 && (j >= 2 && j <= 4)) ||
                    (i == 3) ||
                    (i == 4 && (j >= 2 && j <= 4)) ||
                    (i == 5 && (j == 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to draw a diamond
    public static void drawDiamond() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 1 && (j == 3)) ||
                    (i == 2 && (j == 2 || j == 4)) ||
                    (i == 3) ||
                    (i == 4 && (j == 2 || j == 4)) ||
                    (i == 5 && (j == 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


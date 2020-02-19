/*
 * Arianna Biernacki
 * Student ID: 991270882
 * PROG24178 - Object Oriented Programming 2 - Java
 */
package Game;

public class Main {
    public static void main(String[] args){
        System.out.println("*********************************************************");
        System.out.println("***************   Welcome to the table!   ***************");
        System.out.println("*********************************************************");
        BlackJack game = new BlackJack();
        game.start();
    }
}

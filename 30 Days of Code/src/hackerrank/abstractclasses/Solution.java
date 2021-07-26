package hackerrank.abstractclasses;

/**
 * Creado por: Victor Roman Garrido
 * Fecha:26/07/2021 6:13:58 p. m.
 */


import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

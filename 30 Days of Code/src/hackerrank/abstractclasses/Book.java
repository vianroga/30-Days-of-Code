/**
 * Creado por: Victor Roman Garrido
 * Fecha:26/07/2021 6:13:06 p. m.
 */
package hackerrank.abstractclasses;

/**
 * @author Victor Roman Garrido
 *
 */
abstract public class Book {
	String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();

}

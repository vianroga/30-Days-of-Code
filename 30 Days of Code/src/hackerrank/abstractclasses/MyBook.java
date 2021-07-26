/**
 * Creado por: Victor Roman Garrido
 * Fecha:26/07/2021 6:18:20 p. m.
 */
package hackerrank.abstractclasses;

/**
 * @author Victor Roman Garrido
 *
 */
 class MyBook extends Book {
	private int precio;

	MyBook(String title, String author, int precio) {
		super(title, author);
		this.precio=precio;
		// TODO Auto-generated constructor stub
	}



	@Override
	void display() {
		// TODO Auto-generated method stub
		 System.out.println(
					"Title: " + title 
				+ 	"\nAuthor: " + author
				+ 	"\nPrice: " + precio); 
		}
		
	}


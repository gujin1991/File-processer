/*
 * Database class to encapsulate the database operation.
 * Facade pattern can be applied here.
 */
public class SQLDataBase {
	
	public boolean insert(Product p) {
		return true;
	}
	
	public boolean update(Product oldProduct, Product newProduct, String type) {
		return true;
	}
	
	public boolean delete(Product p) {
		return true;
	}
}

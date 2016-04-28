/*
 * Class for a supplier inventory.
 */
public class SupplierInventory {
	private SQLDataBase database;
	private CSVFormat csvConerter;
	private ExcelFormat excelConerter;
	private TabdelimitedFormat delimitedConerter;
	
	/* Initialize class variables here. Singleton pattern 
	 * can be applied here.
	 */ 
	public void buildInventory() {
		
	}
	
	/* Run function, user can perform insert, delete or update 
	 * product information here.
	 */
	public void run() {
		String format = checkFormat("InputString");
		Product p = getProductArrordingtoFormat();
		/* type can be insert, update or delete */
		perform(p, "type");
			
	}
	
	private void perform(Product p, String string) {
		// TODO Auto-generated method stub
		
	}

	private Product getProductArrordingtoFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	private String checkFormat(String string) {
		
		return "format";
	}	
	
	
}

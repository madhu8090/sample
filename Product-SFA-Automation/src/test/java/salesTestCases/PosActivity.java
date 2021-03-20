package salesTestCases;

public class PosActivity {

	private String  productName;
    private String  productcode;
    private String quantity;
 
   
    
    PosActivity(){
    	
    }

	public PosActivity(String productName, String productcode, String quantity) {
		this.productName = productName;
		this.productcode = productcode;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}


public class TRES extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String faultString;

	public TRES(String faultString) {
		super(faultString);
		this.faultString = faultString;
	}

}

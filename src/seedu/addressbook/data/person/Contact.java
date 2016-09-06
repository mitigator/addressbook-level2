package seedu.addressbook.data.person;

/*
 * 
 *Parent class of address, email and phone. 
 *Guarantees: immutable; is valid as declared in the subclasses
 */

public class Contact {
	
		
	public final String value;
	private boolean isPrivate;

	/*
	 * Constructor for subclasses name values
	 * 
	 */
	public Contact ( String value, boolean isPrivate ){
		
		this.value = value;
		this.isPrivate = isPrivate;
	}
	
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    @Override
    public String toString() {
        return value;
    }
}

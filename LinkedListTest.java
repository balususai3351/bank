
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
 
class Contact{
	String contactName;
	String contactAddress;
	public Contact(String contactName, String contactAddress) {
		super();
		this.contactName = contactName;
		this.contactAddress = contactAddress;
	}
	@Override
	public String toString() {
		return "contact [contactName=" + contactName + ", contactAddress=" + contactAddress + "]";
	}
	
}
class PhoneContact extends Contact{
	String contactNumber;
	String emailAddress;
	public PhoneContact(String contactName, String contactAddress, String contactNumber, String emailAddress) {
		super(contactName, contactAddress);
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		super.toString();
		return "PhoneContact [contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
}
import java.io.IOException;


public class PhoneBillTest {

	public static void main(String[] args) throws IOException {
		// Test the PhoneBillFile class

		PhoneBillFile file = new PhoneBillFile("phonebill.obj");
		PhoneBill bill = new PhoneBill("8675309");
		PhoneCall call = new PhoneCall("1/1/1970", "Me", 30, .1);
		TextMessage text = new TextMessage("2/2/2002", "555-0124", .1, .05);

		bill.addItem(call);
		bill.addItem(text);

		file.writePhoneBill(bill);

		PhoneBill bill2 = file.readPhoneBill();
		System.out.println(bill2.getAmountDue());
		
		file.writePhoneBillToText(bill2, "test.txt");
	}

}

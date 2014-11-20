import java.io.*;

public class PhoneBillFile {

	private String fileName;

	public PhoneBillFile(String fileName)
	{
		this.fileName = fileName;
	}

	// Write a PhoneBill object to a binary file
	public void writePhoneBill(PhoneBill bill) throws IOException
	{
		// Create an output stream to the file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.fileName));
		try {
			// Write the object to the stream
			oos.writeObject(bill);
		}
		finally {
			// Close the stream
			oos.close();
		}
	}

	// Read a Phonebill object from a binary file
	public PhoneBill readPhoneBill() throws IOException
	{
		// Create an input stream to the file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.fileName));
		try {
			// Read the object from the stream
			PhoneBill phoneBill = (PhoneBill) ois.readObject();
			// Return the object
			return phoneBill;
		} catch (ClassNotFoundException e) {
			throw new IOException(e);
		} finally {
			// Close the stream
			ois.close();
		}
	}

	// Write details of a PhoneBill object to a text file
	public void writePhoneBillToText(PhoneBill bill, String textFileName)
	{
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(textFileName));
			try {
				out.println("Phone Number: " + bill.getPhoneNo());
				out.println("Number of items: " + bill.getNumberOfItems());
				out.println("Phone call minutes: " + bill.getPhoneCallMinutes());
				out.println("Amount due: " + bill.getAmountDue());
			}
			finally {
				out.close();
			}
		} catch (IOException e) {
			System.out.println("Error writing to file");
		}
	}

}

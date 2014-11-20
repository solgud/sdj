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


}

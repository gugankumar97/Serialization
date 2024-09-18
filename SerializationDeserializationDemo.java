package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDeserializationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		StudentSerialization stuSer = new StudentSerialization("Megha", 8, "Hyderabad",9934567654L);

		
		String fileName = "C:\\Users\\GUGAN\\Documents\\java documents\\Documents\\Studentserializationsample.txt";
		


		
		// Serialization

		
			FileOutputStream fout = new FileOutputStream(fileName);
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			
			
			objOut.writeObject(stuSer);

			objOut.close();
			fout.close();
			
			System.out.println("Object is Serialized : \n" + stuSer);

	

		
		// Deserialization

		
			
		FileInputStream	fIn = new FileInputStream(fileName);
		ObjectInputStream objIn = new ObjectInputStream(fIn);
			
			StudentSerialization stuObject = (StudentSerialization)objIn.readObject();
			
			System.out.println(" Object is DEserialized : \n"+ stuObject);
			
			

		
	}
}


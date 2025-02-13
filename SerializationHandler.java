package com.ust.lms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationHandler implements SerializationService{
	public void serializeLibrary(Library library , String fileName) {
		try {
			FileOutputStream fout = new FileOutputStream(fileName);
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(library);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public library deserializeLibrary(String fileName) {
		library lobj = null;
		
		try {
			FileInputStream fis = new FIleInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			lobj = (Library)ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lobj;
	}

}

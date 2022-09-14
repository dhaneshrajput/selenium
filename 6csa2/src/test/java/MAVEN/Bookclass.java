package MAVEN;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Bookclass {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
  // Book1 b= new Book1();// this for non static 
   Book1.readdatafromsheet("sheet1",2,1	);// this for static
	}

}

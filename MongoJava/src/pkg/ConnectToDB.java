package pkg;

import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  

public class ConnectToDB { 
   
   public static void main( String args[] ) {  
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
      MongoCredential credential; 
      credential = MongoCredential.createCredential("sampleUser", "myDb","password".toCharArray()); 
      System.out.println("Connected to the database successfully");  
      MongoDatabase database = mongo.getDatabase("myDb"); 
      System.out.println("Credentials ::"+ credential);     
   } 
}
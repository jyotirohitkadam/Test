import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDBDemo {
	static{  
		  System.out.println("static block is invoked   ======== MongoDBDemo");  
		  } 
	public static void main(String[] args) {
		final List<String> lst = new ArrayList<String>();
		lst.add("aaa");
		lst.add("bbb");
		lst.add("ccc");
		lst.add("ddd");
		lst.add("eee");
		lst.add("fff");
		List<String> lst1 = new ArrayList<String>();;
		lst1.add("ggg");
		//lst = lst1;
		
		//final String a = "xxx";
		A3 a = new A3();
		
	}
	/*public static void main(String[] args) {
		try {
			MongoClient	mongoClient = new MongoClient("10.10.221.174",27017);
			
			DB db = mongoClient.getDB("vtm");
			Set<String> collections = db.getCollectionNames();
			

			DBCollection vtmWL = db.getCollection("vTMWorkLists");
			vtmWL.getDB();
			
			System.out.println("Connect to database successfully");
			boolean	auth =	db.authenticate("aaa",new char[]{'s','s'});
			System.out.println("Authentication: " + auth);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}

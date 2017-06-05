/**
 * 
 * @author atifmahmud
 *  Date: 31st May 2017
 *  
 *  This program is used to demonstrate the purpose of the keyword static, and examine
 *  object references and variable values
 *
 *  Making a new upload to get rid of commit message from an accidental "git add -a"
 *  Need to "git add -a" this too
 * 
 */


public class Object {
	public String name;
	public int fieldOne;
	public int fieldTwo;
    public static int staticField = 75; // This will remain same for all instances of object
	
	
	// Constructor without the use of keyword "this" did not work out: ended up getting zeroes and nulls for non-static fields
	public Object (String name, int fieldOne, int fieldTwo){
		this.name = name;
		this.fieldOne = fieldOne;
		this.fieldTwo = fieldTwo;
	}
	

	
	public static void main (String [] args){
		
		System.out.println("foobar");
		
		// Instantiating the objects here allow me to call the static method on them: *static reference to non-static....*
		Object object = new Object("Object One", 5, 7);
		Object SecondObject = object;
		
		SecondObject.name = "Changed the name, HAHAH!"; // To see effect of object reference
		object.staticField+=10;  // To demonstrate static property
		
		printObject(object);
		printObject(SecondObject);
		
	}
	
	public static void printObject (Object object){	
		System.out.println(object.name);
		System.out.println(object.fieldOne);
		System.out.println(object.fieldTwo);
		System.out.println(object.staticField);
	}
	
}

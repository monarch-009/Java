public class InstanceVar {
    // Instance Variables
	// Declared Instance Variable
	public String str;
	public int i;
	public Integer I;
	public InstanceVar()
	{
		// Default Constructor
		// initializing Instance Variable
		this.str = "Aditya Singh";
	}

	// Main Method
	public static void main(String[] args)
	{
		// Object Creation
		InstanceVar name = new InstanceVar();

		// Displaying O/P
		System.out.println("Name is " + name.str);
		System.out.println("Default value for int is " + name.i);
	
		// toString() called internally
		System.out.println("Default value for Integer is " + name.I);
		
	}
}

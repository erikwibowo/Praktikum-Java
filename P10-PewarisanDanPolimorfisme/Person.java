public class Person{
	protected String name;
	protected String address;

	/*
	 * Default constructor
	*/
	
	public Person(){
		System.out.println("Inside Person : constructor");
		name="";
		address="";
	}

	/*
	 * Constructor dengan dua parameter
	*/

	public Person(String vname, String vaddress){
		this.name = vname;
		this.address = vaddress;
	}

	/*
	 * Constructor dengan dua parameter
	*/
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address
	}

	public void setName(String vname){
		this.name = vname;
	}

	public void setAddress(String vaddress){
		this.address = vaddress;
	}

}
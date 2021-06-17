
public class Customer {
	
	    int customerid;
	    String name;
	    int age;
	    String city;
	    int pinCode;

	    public Customer() {
	    }

	    public Customer(int customerid, String name, int age, String city, int pinCode) {
	        this.customerid = customerid;
	        this.name = name;
	        this.age = age;
	        this.city = city;
	        this.pinCode = pinCode;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getCustomerid() {
	        return customerid;
	    }

	    public void setCustomerid(int customerid) {
	        this.customerid = customerid;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public int getPinCode() {
	        return pinCode;
	    }

	    public void setPinCode(int pinCode) {
	        this.pinCode = pinCode;
	    }
	    
	    void printDetails()
	    {
	    	System.out.println("Customer ID : " + customerid);
	        System.out.println("name : " + name);
	        System.out.println("Age : " + age);
	        System.out.println("City : " + city);
	        System.out.println("Pincode : " + pinCode);
	    }
	    public static void main(String[] args) {
	       Customer c = new Customer(1, "Dharmik", 22, "Surat", 394101);
	       c.printDetails();
	       
	    }
	}



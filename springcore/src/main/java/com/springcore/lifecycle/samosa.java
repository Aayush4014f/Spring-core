package com.springcore.lifecycle;

public class samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("setting property");
	this.price = price;
}

public samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "samosa [price=" + price + "]";
}


/*these are init() and destroy method
 as we know we can change their name but not signature 
 so we change init() name as hello and destroy() name as bye 
  
 */
@SuppressWarnings("unused")
private void hello() {
	System.out.println("Inside init() method ");

}
@SuppressWarnings("unused")
private void bye() {
	System.out.println("Inside destroy() method ");

}


}

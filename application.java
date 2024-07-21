// File: MyClass.java

// A class with public access specifier
public class MyClass {
    
    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

       
 feature202
        // Accessing the public
		
		// A subclass of Animal
public class Dog extends Animal {

    // Public method to access protected members
    public void displayInfo() {
        // Accessing the protected field from the superclass
        System.out.println("Species: " + species);

        // Calling the protected method from the superclass
        makeSound();
	}		
#feature202 by ethan for reports modules in oct2023
}

        // Accessing the publicpublic class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
 development

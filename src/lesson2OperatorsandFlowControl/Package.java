package lesson2OperatorsandFlowControl; // used for data encapsulation/data-hiding, pseudocode - package packageName;

import java.util.Vector; // This is required for the code to work 

//Package names and directory structures are closely related
//Sub-package - packages that are inside another package, it is NOT imported by default, must be done explicitly.
/*import java.util.vector; - util is an example of a subpackage, we can import the Vector class from the util package
* import all classes from util package - import java.util.*;
* import package.classname, e.g. import java.util.*;
* 
* Built-in packages - consists of large number of classes that are a part of the Java API.
* java.lang = contains language support classes, automatically imported
* java.io = Contains classes for supporting the input and output
* java.util = Utility classes that implement data structures
* java.applet = Contains classes for creating Applets
* java.awt = Contains classes to implement components for GUIs
* java.net = Classes for networking operations.
* 
*/

public class Package {
	
	public Package() {
		
		Vector newVector = new Vector(); // java.util.Vector is imported to be able to access the code
		
		java.util.ArrayList newList = new java.util.ArrayList();
	}

	public static void main(String[] args) {
		new Package();
	}

}

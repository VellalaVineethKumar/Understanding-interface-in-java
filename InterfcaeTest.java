
public class InterfcaeTest {
	public static void main(String [] args)
	{
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();   //the reference of interface has been taken and object of Circle has been created
					// very important point to note here is
					//the method draw is common for both rectangle and circle but the method which gets executed depends on the type of object declared and not on the reference

	}				
}

interface Drawable{  
void draw();  
}  
//
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}   
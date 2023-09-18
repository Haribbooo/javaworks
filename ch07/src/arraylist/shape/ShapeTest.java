package arraylist.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> shapeList = new ArrayList<>();
		
		shapeList.add(new Circle());
		shapeList.add(new Triangle());
		shapeList.add(new Shape());
		
		
		
		for(Shape shape : shapeList) {
			shape.draw();
		}
		
	}

}

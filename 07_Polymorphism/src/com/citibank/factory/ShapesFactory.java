package com.citibank.factory;
import com.citibank.domain.*;

public class ShapesFactory {
	public Shapes createShape(int shapesChoice) {
		switch (shapesChoice) {
		case 1:
			return new Circle();
		case 2:
			return new Triangle();
		case 3:
			return new Line();
		default:
			return null;
		}
	}

}

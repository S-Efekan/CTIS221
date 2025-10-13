
public class Circle {
	double radius, area, perimeter;
	
	
	Circle(){
		radius=5.0;
	}
	
	Circle(double newRadius){
		radius=newRadius;
	}
	
	
	
	double findArea() {
		return (radius * radius * Math.PI);
	}

	
	
}

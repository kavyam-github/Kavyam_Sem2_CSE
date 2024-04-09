public class lab5_1 {
	public static void main(String[] args){
		//create object of cicle
		
		Circle c1 = new Circle();
		System.out.println(c1.radius);
		

		Circle c2 = new Circle(4);
		System.out.println(c2.radius);


		System.out.println(c1.areaOfCircle());
		System.out.println(c2.areaOfCircle());

			}
	}
	

class Circle{
	int radius;
	//properties

				//defalut const
					public Circle() {
					this.radius=5;
		}
		

					//parameter const
						public Circle(int radius){
							this.radius=radius;
		}
		

		//find area
					public double areaOfCircle(){
							return 3.14*this.radius*this.radius;
		}
}


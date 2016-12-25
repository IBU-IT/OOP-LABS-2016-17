package ba.edu.ibu.oop.week10;


public class GeometricShapes {

	public static class Shape{
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isFilled() {
			return filled;
		}

		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		private String name;
		private String color;
		private boolean filled;
		
		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public double area() {
			return 0;
		}
		
		public void draw(){
			
		}
		
		public boolean equals(Object o) {
			return false;
		}
		
		public String toString() {
			return "I am a shape";
		}
	}

	public static class Rectangle extends Shape {

		public void draw(){
			char c = getColor().toUpperCase().charAt(0);
			for(int i=0;i<getLength();i++){
				for(int j=0;j<getWidth();j++){
					if(i>0 && i <getLength()-1 && j>0 && j<getWidth()-1 && isFilled()==false){
						System.out.print(" ");
					}
					else{
					System.out.print(c);
					}
				}
				System.out.println();
			}
		}
		
		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		private int length, width;

		Rectangle() {
			this(0, 0);
		}

		Rectangle(int length, int width) {
			this(length, width, "Rectangle");
		}

		Rectangle(int length, int width, String name) {
			setLength(length);
			setWidth(width);
			setName(name);
		}

		public double area() {
			return length * width;
		}
		
		public String toString(){
			String s;
			if(getWidth()==getLength()){
				s = "A square named " + getName()+" with side "+ getLength();
			}
			else{
			s = "A rectangle named "+ getName()  +" with length " 	+ length+ " and width "+ width;
			}
			return s;
		}

	}

	public static class Diamond extends Shape{
		public Diamond(int radius) {
			super();
			this.radius = radius;
		}
		public Diamond(){
			
		}
		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public void draw(){
			char c = getColor().toUpperCase().charAt(0);
			String output="";
			if(getRadius()%2!=0){
			for(int i=1;i<=getRadius();i+=2){
				for(int j=0;j<(getRadius()-i)/2;j++){
					output+=" ";
				}
				for(int j=0;j<i;j++){
					output+=c;
				}
				output+="\n";
			}
			for(int i=getRadius()-2;i>=1;i-=2){
				for(int j=0;j<(getRadius()-i)/2;j++){
					output+=" ";
				}
				for(int j=0;j<i;j++){
					output+=c;
				}
				output+="\n";
			}
			}
			else{
				for(int i=0;i<=getRadius();i+=2){
					for(int j=0;j<(getRadius()-i)/2;j++){
						output+=" ";
					}
					if(i==0)output+=c;
					for(int j=0;j<i;j++){
						output+=c;
					}
					output+="\n";
				}
				for(int i=getRadius()-2;i>=0;i-=2){
					for(int j=0;j<(getRadius()-i)/2;j++){
						output+=" ";
					}
					if(i==0)output+=c;
					for(int j=0;j<i;j++){
						output+=c;
					}
					output+="\n";
				}
			}
			System.out.print(output);
		}	
		
		private int radius;
		
		public double area(){
			return getRadius()*getRadius()*3.14;
		}
		
		public String toString(){
			String s;
			s = "A diamond named " + getName() + " with radius "+ getRadius();
			return s;
		}
	}
	
	public static void main(String[] args) {
		Rectangle rekt = new Rectangle();
		rekt.setLength(10);
		rekt.setWidth(10);
		rekt.setFilled(false);
		rekt.setName("kvadrat");
		rekt.setColor("blue");
		System.out.println(rekt.toString()+ " "+rekt.area());
		rekt.draw();
		System.out.println();
		Rectangle rect = new Rectangle(7,8,"pravougaonik");
		rect.setFilled(true);
		rect.setColor("Green");
		System.out.println(rect.toString()+ " "+rect.area());
		rect.draw();
		System.out.println();

		Diamond d = new Diamond();
		d.setName("diamant");
		d.setRadius(6);
		d.setFilled(true);
		d.setColor("White");
		System.out.println(d.toString() + " "+d.area());
		d.draw();
		System.out.println();
		Diamond diamant = new Diamond(3);
		diamant.setName("diamond");
		diamant.setColor("Yellow");
		System.out.println(diamant.toString() + " "+diamant.area());
		diamant.draw();
	}
}

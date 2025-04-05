class Circle{
private double radius;

 public Circle(double radius){
   this.radius=radius;
}

public double AreaofCircle(){
  return Math.PI*radius*radius;
}
  public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

      public void display(){
	  System.out.println("Circle radius:"+radius);
	  System.out.println("Area:"+ AreaofCircle());
	  System.out.println("circumfernece"+ calculateCircumference());
	  System.out.println("--------------------------------------");
	  
	  }

public static void main(String[] args){
    Circle circle1=new Circle(5.0);
	Circle circle2=new Circle(7.0);
	
	circle1.display();
	circle2.display();

}



}
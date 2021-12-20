public class Area{
public static void main (String[]args){
Scanner input = new Scanner(System.in);
System.out.println("the area will be shown here");
System.out.print("enter thee length and breadth:");
int length = input.nextInt();
int breadth = input.nextInt();
  
Area rectangleArea = new Area(length,breadth);
System.out.println("the area of th rectanglr of length" + length + 
" and breadth" + breadth + "is"  rectangleArea.getArea());
}
}
class Area{
int length;
int breadth;
 public Area(int length , int breadth){
this.length = length;
this.breadth = breadth;
}
public double getArea(){
double area = length * breadth;
return area;
}
}
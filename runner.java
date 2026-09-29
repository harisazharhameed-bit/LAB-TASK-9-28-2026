//Activity 2
//class rectangle{
//    public int length,width;
//public rectangle(){
//    length=5;
//    width=2;
//}
//public rectangle(int l,int w){
//    length=l;
//    width=w;
//}
//public int calculatearea(){
//    return (length*width);
//}
//}
//public class runner{
//    public static void main(String[]args){
//        rectangle rect=new rectangle();
//        System.out.println(rect.calculatearea());
//    rectangle rect1=new rectangle(10,20);
//    System.out.println(rect1.calculatearea());
//    }
//}
//Activity 3
//class point{
//    private int x;
//    private int y;
//    public point(){
//        x=1;
//        y=2;
//    }
//    public point(int a,int b){
//        x=a;
//        y=b;
//    }
//    public void setX(int a){
//        x=a;
//    }
//    public void setY(int b){
//        y=b;
//    }
//    public void display(){
//        System.out.println("x coordinate = "+x+" , y coordinate =  "+y);
//    }
//public void movepoint(int a,int b){
//        x=x+a;
//        y=y+b;
//        System.out.println("x coordinate after moving = "+x+" , y coordinate after moving = "+y);
//}
//}
//public class runner {
//    public static void main(String[] args) {
//        point p1 = new point();
//        p1.display();
//        p1.movepoint(2, 3);
//        p1.setX(2);
//        point p2 = new point(6, 7);
//        p2.display();
//        p2.movepoint(1, 1);
//        p2.setY(2);
//    }
//}
//LAB TASK 1
//class circle {
//    public int radius;
//
//    public circle() {
//        radius = 2;
//    }
//
//    public circle(int a) {
//        radius = a;
//    }
//
//    public void display() {
//        System.out.println("Radius is = " + radius);
//    }
//
//    public double circumfrence(int a) {
//        return (2 * 3.18 * radius);
//    }
//}
//    public class runner {
//        public static void main(String[] args) {
//            circle c1 = new circle();
//            c1.display();
//            System.out.println(c1.circumfrence(2));
//        }
//    }
//LAB TASK 2 Create a class Account class with balance as data member. Create two constructors (no argument, and two arguments) and methods to withdraw and deposit balance.
//class account {
//    int balance, withdraw, deposit;
//    public account() {
//        balance = 3000;
//        withdraw = 2000;
//        deposit = 1000;
//    }
//    public account(int b, int w, int d) {
//        balance = b;
//        withdraw = w;
//        deposit = d;
//    }
//    public int withdraww() {
//        return balance = (balance - withdraw);
//    }
//    public int depositt() {
//        return balance = (balance + deposit);
//    }
//}
//public class runner{
//    public static void main(String[]args){
//        account a1=new account();
//        System.out.println("Balance after withdraw is = "+a1.withdraww());
//        System.out.println("Balance after deposit is = "+a1.depositt());
//    }
//    }
//LAB TASK 3
//class distance{
//    int feet,inches,valueF,valueI;
//    public distance(){
//        feet=14;
//        inches=168;
//    }
//    public distance(int f,int i){
//        feet=f;
//        inches=i;
//    }
//    public void display(){
//        System.out.println("Distance in feet is = "+feet+"Distance in inches is = "+inches);
//    }
//    public double convertI(){
//        return valueI=(feet*12);
//    }
//    public double convertF(){
//        return valueF=(inches/12);
//    }}
//    public class runner{
//        public static void main(String[]args){
//            distance d1=new distance();
//            d1.display();
//            System.out.println(d1.convertF());
//            System.out.println(d1.convertI());
//        }
//    }
//LAB TASK 4
//class marks {
//    private double mark1;
//    private double mark2;
//    private double mark3;
//    public marks() {
//        this.mark1 = 0.0;
//        this.mark2 = 0.0;
//        this.mark3 = 0.0;
//    }
//    public marks(double mark1, double mark2, double mark3) {
//        this.mark1 = mark1;
//        this.mark2 = mark2;
//        this.mark3 = mark3;
//    }
//    public double calculateSum() {
//        return mark1 + mark2 + mark3;
//    }
//}
//    public class runner {
//        public static void main(String[] args) {
//            marks student1 = new marks();
//            System.out.println("Student 1 Sum : " + student1.calculateSum());
//            marks student2 = new marks(85.5, 90.0, 78.5);
//            System.out.println("Student 2 Sum : " + student2.calculateSum());
//        }
//    }
//LAB TASK 5
class time {
    private int hr;
    private int min;
    private int sec;
    public time() {
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }
    public time(int hr, int min, int sec) {
        setTime(hr, min, sec);
    }
    public void setTime(int hr, int min, int sec) {
        if (hr >= 0 && hr <= 23) {
            this.hr = hr;
        } else {
            this.hr = 0;
        }
        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            this.min = 0;
        }
        if (sec >= 0 && sec <= 59) {
            this.sec = sec;
        } else {
            this.sec = 0;
        }
    }
    public void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }
}
public class runner{
    public static void main(String[] args) {
        time t1 = new time();
        t1.display();
        time t2 = new time(14, 30, 45);
        t2.display();
        time t3 = new time(25, -5, 80);
        t3.display();
    }
}
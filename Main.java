class student{
    String name;
    String studentid;
    String grade;
    String department;
    public void display(){
        System.out.println("Student ID:"+studentid+" "+"\n Name:"+name+" "+
                "\n Grade:"+grade+" "+"\n Department:"+department);

    }
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Hiba";
        s1.studentid = "FA25-BMD-234";
        s1.grade = "A";
        s1.department = "Maths";
        s1.display();

    }
}

//---------------------------------------------------------------------------------
//Task:
class Time{
    int hours;
    int minutes;
    int seconds;
    public void display(){
        System.out.println("Time ="+hours+":"+minutes+":"+seconds);
    }
    public static void main(String[] args){
        Time t1 = new Time();
        t1.hours = 24;
        t1.minutes = 58;
        t1.seconds = 48;
        t1.display();
    }

}
//----------------------------------------------------------------------------------
// Task: 3:

class Car{
    int year;
    int speed;
    String company;
    String model;
    String color;
    public void display(){
        System.out.println("Year:"+ year+"\nSpeed:"+speed+"\nCompany:"+
                company+"\nModel:"+model+"\nColour:"+color);
    }
    public static void main(String[] args){
        Car c1 = new Car();
        c1.year = 2008;
        c1.speed = 120;
        c1.company = "Toyota";
        c1.model = "Civic";
        c1.color = "Black";
        c1.display();
    }
}

class Rectangle{
    int length;
    int height;
    public void display(){
        System.out.println("Length:"+length+"\nHeight:"+height);
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 20;
        r1.height = 12;
        r1.display();
    }
}
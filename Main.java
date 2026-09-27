class Circle{
    double radius;
    Circle(){
        radius = 1;

    }
    Circle(double r,double x){
        radius = r;

    }
    double circumference(){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5,10);
        System.out.println("Circumference of c1 = " + c1.circumference());

        System.out.println("Circumference of c1 = " + c2.circumference());
    }
}

class Account{
    double balance;
    Account(){
        balance = 0;

    }
    Account(double b,int x){
        balance = b;
    }
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        balance = balance - amount;
    }
    public static void main(String[] args){
        Account a1 = new Account();
        Account a2 = new Account(5000,1);
        a2.deposit(1000);
        a2.withdraw(2000);
        System.out.println("Final Balance ="+ a2.balance);
    }
}

class Distance{
    int feet,inches;
    Distance(){
        feet = 0;
        inches = 0;
    }
    Distance(int f,int i){
        feet = f;
        inches = i;
    }
    public void display(){
        System.out.println("Feet ="+ feet);
        System.out.println("Inches ="+ inches);
    }
    public static void main(String[] args){
        Distance d = new Distance(5,6);
        d.display();

    }
}

class Marks{
    int m1,m2,m3;
    Marks(){
        m1 = m2 =  m3 =0;
    }
    Marks(int a,int b,int c){
        m1 = a;
        m2 = b;
        m3 = c;
    }
    public int sum(){
        return m1+m2+m3;
    }
    public static void main(String[] args){
        Marks m = new Marks(70,80,90);
        System.out.println("Sum = "+ m.sum());
    }
}

class Time{
    int hr,min,sec;
    Time(){
        hr = min = sec = 0;
    }
    Time(int h,int m,int s){
        hr = h;
        min = m;
        sec = s;
    }
    public void check(){
        if (hr<= 23 && min <= 59 && sec <= 59 )
            System.out.println("Valid Time");
        else
            System.out.println("Invalid Time");

    }
    public void display(){
        System.out.println(hr + ":" + min + ":" + sec);
    }
    public static void main(String[] args){
        Time t = new Time(12,30,45);
        t.check();
        t.display();

    }
}
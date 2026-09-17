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
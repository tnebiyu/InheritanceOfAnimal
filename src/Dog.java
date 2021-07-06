public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight,int legs, int tail, int teeth) {
        super(name, 1, 1, size, weight);
this.coat =coat;
this.eyes = eyes;
this.legs = legs;
this.tail = tail;
this.teeth = teeth;
    }
    private void chew(){
        System.out.println("Dog.chew is called");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat is called");
        chew();
        super.eat();
    }
    private void moveLegs(int speed){
        System.out.println("dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(12);
        super.move(speed);
        }



    public void walk(){
        System.out.println("dog.walk() called");
   super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);

    }
}


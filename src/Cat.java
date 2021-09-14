public class Cat extends Animals{

    public Cat(String name, String color, int weight, int numberLegs) {
        super(name, color, weight, numberLegs);
    }

    public void makeMeow(){
        System.out.println(getName()+" makes meow");
    }



    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(getName()+" can't eat cucumbers");
    }


}
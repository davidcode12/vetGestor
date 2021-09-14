public class Dog extends Animals{

    String dogBreed;

    public Dog(String name, String color, int weight, int numberLegs, String dogBreed) {
        super(name, color, weight, numberLegs);
        this.dogBreed = dogBreed;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("WARNING! "+getName() +" is a "+dogBreed  +"and it can't eat chocolate");

    }



    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}

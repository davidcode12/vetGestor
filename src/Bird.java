import java.util.Scanner;

public class Bird extends Animals{
    int wings;

    public Bird(String name, String color, int weight, int numberLegs, int wings) {
        super(name, color, weight, numberLegs);
        this.wings = wings;
    }

    public void fly(int kilometers){
        System.out.println("How far does " +getName() +"want to fly?");
        Scanner scanner = new Scanner(System.in);
        kilometers = scanner.nextInt();
        if(getWeight()>3 && kilometers>10){
            System.out.println("Sorry "+getName()+ " can't fly until there");
        }else{
            System.out.println(getName()+ " can go there");
        }
        System.out.println();
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(getName()+" can't eat just meat");
    }
}

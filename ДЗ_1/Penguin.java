public class Penguin extends Animal {

    String creature = "Penguin";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = true;

    public Penguin(String name, String color, Integer age, String creature, Boolean run, Boolean fly, Boolean swim) {

        super(name, color, age, creature, run, fly, swim);
        this.creature = creature;
        this.run = true;
        this.fly = fly;
        this.swim = swim;
        
    }

    public Penguin(String name, Integer age) {

        super(name, age);
        this.creature = "Penguin";
        this.run = true;

    }



    
}

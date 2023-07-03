public class Animal {
    private String name;
    private Integer age;
    private Boolean vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;
    private Boolean run;
    private Boolean fly;
    private Boolean swim;
    private String creature;

    public Animal(String name, Integer age, String vaccination2, String color,
            String species, Owner owner, Integer legsCount, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.run = run;
        this.fly = fly;
    }

    public Animal(String name, String color, Integer age, Boolean vaccination, String species, Integer legsCount,
            String creature, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.creature = creature;
        this.run = run;
        this.color = color;
        this.fly = fly;
        this.swim = swim;
        this.vaccination = vaccination;
        this.species = species;
        this.legsCount = legsCount;
        this.run = run;
        this.fly = fly;
        this.swim = swim;
    }

    public Animal(String name, String color, Integer age, String creature, Boolean run, Boolean fly, Boolean swim) {
        this.name = name;
        this.age = age;
        this.creature = creature;
        this.run = run;
        this.color = color;
        this.fly = fly;
        this.swim = swim;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toRun() {

        if (this.run) {
            System.out.println(this.creature + " " + this.name + ": \"Животное может передвигаться по суше\" ");
        } else {
            System.out.println("Животное не может двигаться ");
        }

    }

    public void toFly() {

        if (this.fly) {
            System.out.println(this.creature + " " + this.name + ": \"Оно может летать\" ");
        } else {
            System.out.println(this.creature + " " + this.name + ": \"полет не возможен\" ");
        }

    }

    public void toSwim() {

        if (this.swim) {
            System.out.println(this.creature + " " + this.name + ": \"Оно может плавать\" ");
        } else {
            System.out.println(this.creature + " " + this.name + ": \"плавать не может\" ");
        }

    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}


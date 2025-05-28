public class Dog {

    private String name;
    private String breed;

    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("hi", "bark");
        Dog dog2 = new Dog("hello", "not bark");

       
        dog1.setName("bye");
        dog1.setBreed("run");

        dog2.setName("tata");
        dog2.setBreed("walk");

        
        System.out.println("Details updated :");
        System.out.print("Dog1 name: " + dog1.getName() + "    ");
        System.out.println( "Dog1 Breed: " + dog1.getBreed());
        System.out.print("Dog2 name: " + dog2.getName()  + "    ");
        System.out.println("Dog2 Breed: " + dog2.getBreed());
    }
}

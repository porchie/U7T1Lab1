import java.util.ArrayList;


public class MainRunner
{
    public static void main(String[] args)
    {
        ArrayList<Dog> dogList = new ArrayList<>();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();
    }
}

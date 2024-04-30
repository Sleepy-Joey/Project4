import java.util.ArrayList;

public class PetRecord {
    private ArrayList<Pet> petArrayList = new ArrayList<>();
    private ArrayList<Dog> dogArrayList = new ArrayList<>();
    private ArrayList<Cat> catArrayList = new ArrayList<>();
    public ArrayList<Pet> getPetArrayList(){
        return petArrayList;
    }

    public void addPet(Pet pet){
        petArrayList.add(pet);
    }
    public void removePet(Pet pet){
        petArrayList.remove(pet);
    }
    public Pet getPet(String petName){
        Pet foundPet = null;
        for(Pet pet : petArrayList){
            if(pet.getName().equals(petName)){
                foundPet = pet;
                break;
            }
        }
        return foundPet;
    }
    public void addDog(Dog dog){
        dogArrayList.add(dog);
    }
    public void addCat(Cat cat){
        catArrayList.add(cat);
    }
    public void removeDog(Dog dog){
        dogArrayList.remove(dog);
    }
    public void removeCat(Cat cat){
        catArrayList.remove(cat);
    }
    public Dog getDog(String dogName){
        Dog foundDog = null;
        for(Dog dog : dogArrayList){
            if (dog.getName().equals(dogName)) {
                foundDog = dog;
                break;
            }
        }
        return foundDog;
    }
    public Cat getCat(String catName){
        Cat foundCat = null;
        for(Cat cat : catArrayList){
            if (cat.getName().equals(catName)) {
                foundCat = cat;
                break;
            }
        }
        return foundCat;
    }
    public ArrayList<Dog> getDogArrayList(){
        return dogArrayList;
    }
    public ArrayList<Cat> getCatArrayList(){
        return catArrayList;
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);
    PetRecord petRecord = new PetRecord();
    public void displayMenu(){
        while(true){
            System.out.println("********* MENU *********\nPlease make a selection: \n1) Add a Pet\n2) Remove a Pet \n3) Display all Pet Info \n4) Display all Cats \n5) Display all Dogs \n6) Exit");
            String playerChoice = scnr.nextLine();
            if(playerChoice.equals("1")){
                addPet();
            } else if (playerChoice.equals("2")) {
                removePet();
            } else if (playerChoice.equals("3")) {
                displayPets();
            } else if (playerChoice.equals("4")) {
                displayCats();
            } else if (playerChoice.equals("5")) {
                displayDogs();
            } else if (playerChoice.equals("6")) {
                break;
            }
        }
    }

    private void addPet(){
        System.out.print("Enter the number corresponding to the animal you are checking in: \n1: Dog \n2: Cat");
        int animalNum = Integer.parseInt(scnr.nextLine());
        String animalType;
        if(animalNum == 1){
            animalType = "dog";
            System.out.print("Enter the " + animalType + "'s name: ");
            String animalName = scnr.nextLine();
            System.out.print("Enter " + animalName + "'s age in years: ");
            int animalAge = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter " + animalName + "'s approximate height: ");
            double animalHeight = Double.parseDouble(scnr.nextLine());
            System.out.print("Is the dog friendly? Please enter 1 for yes and 2 for no:");
            int isFriendlyNum = Integer.parseInt(scnr.nextLine());
            boolean isFriendly;
            if(isFriendlyNum == 1){
                isFriendly = true;
            } else {
                isFriendly = false;
            }
            Dog newDog = new Dog(animalName, animalType, animalAge, animalHeight, isFriendly);
            Pet newPet = new Pet(animalName, animalType, animalAge, animalHeight);
            petRecord.addPet(newPet);
            petRecord.addDog(newDog);
            System.out.println(animalName + " added to pet record!\n");
        } else {
            animalType = "cat";
            System.out.print("Enter the " + animalType + "'s name: ");
            String animalName = scnr.nextLine();
            System.out.print("Enter " + animalName + "'s age in years: ");
            int animalAge = Integer.parseInt(scnr.nextLine());
            System.out.print("Enter " + animalName + "'s approximate height: ");
            double animalHeight = Double.parseDouble(scnr.nextLine());
            System.out.print("Does the cat have claws? Please enter 1 for yes and 2 for no:");
            int hasClawsNum = Integer.parseInt(scnr.nextLine());
            boolean hasClaws;
            if(hasClawsNum == 1){
                hasClaws = true;
            } else {
                hasClaws = false;
            }
            Cat newCat = new Cat(animalName, animalType, animalAge, animalHeight, hasClaws);
            Pet newPet = new Pet(animalName, animalType, animalAge, animalHeight);
            petRecord.addPet(newPet);
            petRecord.addCat(newCat);
            System.out.println(animalName + " added to pet record!\n");
        }
    }
    private void removePet(){
        System.out.print("Enter the name of the pet you want to remove: ");
        String petName = scnr.nextLine();
        Pet delete = petRecord.getPet(petName);
        if(delete == null){
            System.out.println("Pet not found!");
        } else {
            String deleteType = delete.getType();
            if (deleteType.equals("dog")){
                Dog deleteDog = petRecord.getDog(petName);
                petRecord.removeDog(deleteDog);
                petRecord.removePet(delete);
                System.out.println(petName + " removed from record!\n");

            } else if (deleteType.equals("cat")) {
                Cat deleteCat = petRecord.getCat(petName);
                petRecord.removeCat(deleteCat);
                petRecord.removePet(delete);
                System.out.println(petName + " removed from record!\n");
            }
        }
    }
    private void displayPets(){
        ArrayList<Pet> displayArray = petRecord.getPetArrayList();
        int num = 1;
        for(Pet displayPet : displayArray){
            System.out.println(num + ". Name: " + displayPet.getName() + "\nType: " + displayPet.getType() + "\nAge: " + displayPet.getAge() + "\nHeight: " + displayPet.getHeight());
            System.out.println();
            num += 1;
        }
        System.out.println();
    }
    private void displayCats(){
        ArrayList<Cat> displayArray = petRecord.getCatArrayList();
        int num = 1;
        for(Cat displayCat : displayArray){
            System.out.println(num + ". Name: " + displayCat.getName() + "\nAge: " + displayCat.getAge() + "\nHeight: " + displayCat.getHeight() + "\nHas Claws?: " + displayCat.getHasClaws());
            System.out.println();
            num += 1;
        }
        System.out.println();
    }
    private void displayDogs(){
        ArrayList<Dog> displayArray = petRecord.getDogArrayList();
        int num = 1;
        for(Dog displayDog : displayArray){
            System.out.println(num + ". Name: " + displayDog.getName() + "\nAge: " + displayDog.getAge() + "\nHeight: " + displayDog.getHeight() + "\nIs Friendly?: " + displayDog.getIsFriendly());
            System.out.println();
            num += 1;
        }
        System.out.println();
    }
}

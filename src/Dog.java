public class Dog extends Pet{
    private boolean isFriendly;
    public Dog(String name, String type, int age, double height, boolean isFriendly){
        super(name, type, age, height);
        this.isFriendly = isFriendly;
    }
    public boolean getIsFriendly(){
        return isFriendly;
    }
    public void setIsFriendly(boolean isFriendly){
        this.isFriendly = isFriendly;
    }

    @Override
    public String toString(){
        return String.format(isFriendly ? "Yes" : "No");
    }
}

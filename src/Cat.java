public class Cat extends Pet{
    private boolean hasClaws;
    public Cat(String name, String type, int age, double height, boolean hasClaws){
        super(name, type, age, height);
        this.hasClaws = hasClaws;
    }

    public boolean getHasClaws(){
        return hasClaws;
    }
    public void setHasClaws(boolean hasClaws){
        this.hasClaws = hasClaws;
    }

    @Override
    public String toString(){
        return String.format(hasClaws ? "Yes" : "No");
    }
}

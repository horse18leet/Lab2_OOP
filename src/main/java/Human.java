public class Human implements Action{
    private double MaxHeight;
    private int MaxLength;
    private String Name;

    @Override
    public void Run(int distance) {
        if(distance <= MaxLength){
            System.out.println(Name + " пробежал " + distance + "м");
        }
        else {
            System.out.println(Name + " устал бежать " + distance + "м");
        }
    }

    @Override
    public void Jump(double distance) {
        if(distance <= MaxHeight){
            System.out.println(Name + " прыгнул на " + distance + "м");
        }
        else
        {
            System.out.println(Name + " не смог прыгнуть на " + distance + "м");
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getType() {
        return "Человек";
    }

    Human(String name, double maxHeight, int maxLength){
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}

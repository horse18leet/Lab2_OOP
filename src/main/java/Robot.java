public class Robot implements Action{

    private double MaxHeight;
    private int MaxLength;
    private String Name;

    @Override
    public void Run(int distance) {
        if(distance <= MaxLength){
            System.out.println(Name + " пробежал " + distance + "м");
        }
        else
        {
            System.out.println("У " + Name + " села батарейка и он не смог пробежать " + distance + "м");
        }
    }

    @Override
    public void Jump(double distance) {
        if(distance <= MaxHeight){
            System.out.println(Name + " прыгнул на " + distance + "м");
        }
        else {
            System.out.println(Name + " не смог прыгнуть на " + distance + "м");
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getType() {
        return "Робот";
    }

    Robot(String name, double maxHeight, int maxLength){
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }



}

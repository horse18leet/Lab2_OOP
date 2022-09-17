public class Robot implements Action {
    private double MaxHeight;

    private int MaxLength;

    private String Name;

    public boolean Run(int distance) {
        if (distance <= this.MaxLength) {
            System.out.println("Робот " + this.Name + " пробежал " + distance + "м");
            return true;
        }
        System.out.println("Робот " + this.Name + " не смог пробежать " + distance + "м");
        return false;
    }

    public boolean Jump(double distance) {
        if (distance <= this.MaxHeight) {
            System.out.println("Робот " + this.Name + " прыгнул на " + distance + "м");
            return true;
        }
        System.out.println("Робот " + this.Name + " не смог прыгнуть на " + distance + "м");
        return false;
    }

    Robot(String name, double maxHeight, int maxLength) {
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}

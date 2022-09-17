
public class Cat implements Action {
    private double MaxHeight;

    private int MaxLength;

    private String Name;

    public boolean Run(int distance) {
        if (distance <= this.MaxLength) {
            System.out.println("��� " + this.Name + " �������� " + distance + "�");
            return true;
        }
        System.out.println("��� " + this.Name + " �� ���� ��������� " + distance + "�");
        return false;
    }

    public boolean Jump(double distance) {
        if (distance <= this.MaxHeight) {
            System.out.println("��� " + this.Name + " ������� �� " + distance + "�");
            return true;
        }
        System.out.println("��� " + this.Name + " �� ���� �������� �� " + distance + "�");
        return false;
    }

    Cat(String name, double maxHeight, int maxLength) {
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}

public class Robot implements Action {
    private double MaxHeight;

    private int index = 1;

    private int MaxLength;

    private String Name;

    public boolean Run(int distance) {
        if (distance <= this.MaxLength) {
            System.out.println("����� " + this.Name + " �������� " + distance + "�");
            return true;
        }
        System.out.println("����� " + this.Name + " �� ���� ��������� " + distance + "�");
        return false;
    }

    public boolean Jump(double distance) {
        if (distance <= this.MaxHeight) {
            System.out.println("����� " + this.Name + " ������� �� " + distance + "�");
            return true;
        }
        System.out.println("����� " + this.Name + " �� ���� �������� �� " + distance + "�");
        // ����� ������ ��� ������ ��� �������
        if (index == 1) {
            index--;
            System.out.println("����� " + this.Name + " ��������� �� ������ �������� � ���� �������� �� " + distance + "�");
            return true;
        }
        else return false;
    }

    Robot(String name, double maxHeight, int maxLength) {
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }
}

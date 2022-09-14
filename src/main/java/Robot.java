public class Robot implements Action{

    private double MaxHeight;
    private int MaxLength;
    private String Name;

    @Override
    public void Run(int distance) {
        if(distance <= MaxLength){
            System.out.println(Name + " �������� " + distance + "�");
        }
        else
        {
            System.out.println("� " + Name + " ���� ��������� � �� �� ���� ��������� " + distance + "�");
        }
    }

    @Override
    public void Jump(double distance) {
        if(distance <= MaxHeight){
            System.out.println(Name + " ������� �� " + distance + "�");
        }
        else {
            System.out.println(Name + " �� ���� �������� �� " + distance + "�");
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getType() {
        return "�����";
    }

    Robot(String name, double maxHeight, int maxLength){
        this.MaxHeight = maxHeight;
        this.MaxLength = maxLength;
        this.Name = name;
    }



}

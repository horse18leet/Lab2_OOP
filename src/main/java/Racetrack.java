public enum Racetrack implements Barrier {
    LOW("��������", 50),
    MIDDLE("�������", 100),
    HIGH("�������", 150),
    VERYHIGH("����� ����� �������", 250);

    private String Desc;
    private int Length;

    Racetrack(String desc, int length) {
        this.Desc = desc;
        this.Length = length;
    }

    public String getDesc() {
        return Desc;
    }

    public int getDistance() {
        return Length;
    }

    @Override
    public boolean getReady(int height, Action a) {
        if(height <= Length){
            a.Run(height);
            return true;
        }
        else { return false; }
    }



}

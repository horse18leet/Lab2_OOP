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

    public int getDistance() {
        return this.Length;
    }

    public boolean getReady(Barrier barrier, Action a) {
        if (a.Run(barrier.getDistance()))
            return true;
        return false;
    }
    }

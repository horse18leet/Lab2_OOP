public enum Wall implements Barrier {
    LOW("������", 1),
            MIDDLE("�������", 2),
                    HIGH("������� ", 3),
                            VERYHIGH("����� ����� �������", 5);

    private String Desc;

    private int Height;

    Wall(String desc, int height) {
        this.Desc = desc;
        this.Height = height;
    }

    public int getDistance() {
        return this.Height;
    }

    public boolean getReady(Barrier barrier, Action a) {
        if (a.Jump(barrier.getDistance()))
            return true;
        return false;
    }
    }

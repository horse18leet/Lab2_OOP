public enum Wall implements Barrier {
    LOW("Низкая", 1),
            MIDDLE("Средняя", 2),
                    HIGH("Высокая ", 3),
                            VERYHIGH("Очень супер высокая", 5);

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

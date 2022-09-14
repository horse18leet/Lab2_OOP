public enum Wall implements Barrier {
    LOW("Низкая", 1),
    MIDDLE("Средняя", 2),
    HIGH("Высокая", 3),
    VERYHIGH("Очень супер высокая", 5);

    private String Desc;
    private int Height;

    Wall(String desc, int height) {
        this.Desc = desc;
        this.Height = height;
    }

    public String getDesc() {
        return Desc;
    }

    public int getDistance() {
        return Height;
    }

    @Override
    public boolean getReady(int height, Action a) {
        if(height <= Height){
            a.Jump(height);
            return true;
        }
        else { return false; }
    }

}

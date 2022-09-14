public interface Barrier {

    String getDesc();

    int getDistance();

    boolean getReady(int height, Action a);
}

public interface Barrier {
    int getDistance();

    boolean getReady(Barrier paramBarrier, Action paramAction);
}

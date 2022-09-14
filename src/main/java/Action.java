public interface Action {
    void Run(int distance);
    void Jump(double distance);

    String getName();
    String getType();
}

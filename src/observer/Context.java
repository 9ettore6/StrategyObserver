package observer;


public class Context extends Observer {
    private Strategy st;
    private int value = 0;

    public Context(Strategy st) {
        this.st = st;
    }

    @Override
    public void update(Subject s) {
        value = s.getValue();
        if (value == 0) {
            st = StratA.getInstanceA();
            st.algorithm();
        } else
            st.algorithm();
    }
}

public class Counter implements AutoCloseable {
    private static Integer count;
    static {
        count = 1;
    }
    public void add() {
        count++;
    }
    public void sub() {
        count--;
    }

    public Integer getCount() {
        return count;
    }
    public Integer getCountToPrint() {
        return count-1;
    }
    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

}

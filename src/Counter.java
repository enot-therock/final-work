public class Counter {
    private static int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(count);
//    }
}

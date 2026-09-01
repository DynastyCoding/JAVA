package practice.exception;

public class CrashMain {
    public static void main(String[] args) {
        CrashDemo dm = new CrashDemo();

        dm.crashNull();
        dm.crashIndex();
        dm.crashNumber();
        dm.crashCast();
        dm.crashArithmetic();

    }
}

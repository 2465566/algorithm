package pattern.behavior.status;

import pattern.behavior.status.impl.StartStatus;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStatus(new StartStatus());
        context.print();
        context.print();
    }
}

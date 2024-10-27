package cl.ravenhill;

import java.io.IOException;

public class RiskyOperation {
    public static void main(String[] args)
            throws IOException {
        throw new IOException("This is a risky operation");
    }
}

package cl.ravenhill.sheeran;

public class EdSheeran {
    public static void validateAge(int age) throws EdSheeranException {
        if (age >= 70) {
            throw new EdSheeranException(
                    "And, darling, I will be loving you 'til we're 70"
            );
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(70);
        } catch (EdSheeranException e) {
            System.out.println(e.getMessage());
        }
        /* Output:
        And, darling, I will be loving you 'til we're 70
        */
    }
}

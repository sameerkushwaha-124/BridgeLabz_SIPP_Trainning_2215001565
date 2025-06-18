public class NullPointerDemo {
    static void throwException() {
        String t = null;
        System.out.println(t.length());
    }

    static void handleException() {
        try {
            String t = null;
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Null error");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        // throwException();
        handleException();
    }
}

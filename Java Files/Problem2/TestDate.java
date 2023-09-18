public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(18, 9, 2023);

        System.out.println(date.toString());

        // Added a bit of new code to further test the Date class.

        date.setDay(2);

        System.out.println("New date:" + date.toString());
    }
}
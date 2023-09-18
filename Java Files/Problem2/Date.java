public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int d) {
        this.day = d;
    }

    public void setMonth(int m) {
        this.month = m;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void setDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public String toString() {
        String newDay = "";
        String newMonth = "";
        if (this.day <= 9) {
            newDay = "0" + this.day;
        }
        if (this.month <= 9) {
            newMonth = "0" + this.month;
        }
        if (newDay == "") {
            newDay = String.valueOf(this.day);
        }
        if (newMonth == "") {
            newMonth = String.valueOf(this.month);
        }
        return newDay + "/" + newMonth + "/" + this.year;
    }
}
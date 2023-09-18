public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int h) {
        this.hour = h;
    }

    public void setMinute(int m) {
        this.minute = m;
    }

    public void setSecond(int s) {
        this.second = s;
    }

    public String toString() {
        String newHour = "";
        String newMinute = "";
        String newSecond = "";
        if (this.hour <= 9) {
            newHour = "0" + this.hour;
        }
        if (this.minute <= 9) {
            newMinute = "0" + this.minute;
        }
        if (this.second <= 9) {
            newSecond = "0" + this.second;
        }
        if (newHour == "") {
            newHour = String.valueOf(this.hour);
        }
        if (newMinute == "") {
            newMinute = String.valueOf(this.minute);
        }
        if (newSecond == "") {
            newSecond = String.valueOf(this.second);
        }
        return newHour + ":" + newMinute + ":" + newSecond;
    }

    // Not sure if these two are exactly what you wanted, but they're what I
    // gathered from the explanation.
    public Time nextSecond() {
        this.second += 1;
        return this;
    }

    public Time previousSecond() {
        this.second -= 1;
        return this;
    }
}
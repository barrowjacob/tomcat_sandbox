package classes;

import java.sql.Date;

public class ClassDates {

    private long id;
    private String type;
    private String date;
    private int seats_booked;

    public ClassDates(long id, String type, String date, int seats_booked) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.seats_booked = seats_booked;
    }

    public ClassDates(String type, String date, int seats_booked) {
        this.type = type;
        this.date = date;
        this.seats_booked = seats_booked;
    }

    public ClassDates() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeats() {
        return seats_booked;
    }

    public void setSeats(int seats_booked) {
        this.seats_booked = seats_booked;
    }
}

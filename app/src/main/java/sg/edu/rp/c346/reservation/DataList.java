package sg.edu.rp.c346.reservation;

public class DataList {

    private String name;
    private int Telephone;
    private int size;
    private boolean isSmoking;
    private String date;
    private String time;

    public DataList(String name, int telephone, int size, boolean isSmoking, String date, String time) {
        this.name = name;
        Telephone = telephone;
        this.size = size;
        this.isSmoking = isSmoking;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DataList{" +
                "name='" + name + '\'' +
                ", Telephone=" + Telephone +
                ", size=" + size +
                ", isSmoking=" + isSmoking +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

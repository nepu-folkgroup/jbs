package jbs.Entity;

public class Auto {
    private String autocard;
    private String bno;
    private String tno;
    private String color;
    private int seat;
    private String gear;
    private String tubo;
    private double dayrent;
    private byte[] pic;

    public String getAutocard() {
        return autocard;
    }

    public void setAutocard(String autocard) {
        this.autocard = autocard;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getTubo() {
        return tubo;
    }

    public void setTubo(String tubo) {
        this.tubo = tubo;
    }

    public double getDayrent() {
        return dayrent;
    }

    public void setDayrent(double dayrent) {
        this.dayrent = dayrent;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}
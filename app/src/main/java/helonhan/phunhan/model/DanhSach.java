package helonhan.phunhan.model;

/**
 * Created by DELL on 10/20/2017.
 */

public class DanhSach {
    private String Name;
    private String Quoctich;
    private int Hinh;



    @Override
    public String toString() {
        return "DanhSach{" +
                "Name='" + Name + '\'' +
                ", Quoctich='" + Quoctich + '\'' +
                '}';
    }

    public DanhSach(String name, String quoctich, int hinh) {
        Name = name;
        Quoctich = quoctich;
        Hinh = hinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQuoctich() {
        return Quoctich;
    }

    public void setQuoctich(String quoctich) {
        Quoctich = quoctich;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public DanhSach() {

    }
}

package helonhan.phunhan.congty.activities;
//đã đổi tên packpage

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import helonhan.phunhan.adapters.Danhsachadapter;
import helonhan.phunhan.model.DanhSach;

public class MainActivity extends AppCompatActivity {
        ListView lvDanhSach;
        ArrayList<DanhSach> arrdanhsach;//Kiểu list thì đặt tên biến phải để số nhiều, thêm s, hoặc es như trong tiếng Anh
        Danhsachadapter dsadapter;//Đặt tên lại rõ ràng hơn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvDanhSach = (ListView) findViewById(R.id.lvDanhSach);
        arrdanhsach = new ArrayList<>();

        dsadapter = new Danhsachadapter(MainActivity.this,
                R.layout.item,
                arrdanhsach);
        lvDanhSach.setAdapter(dsadapter);
        fakedanhsach();
    }
    //Để trống một dòng rồi viết phương thức tiếp theo.

    private void fakedanhsach(){//Viêt lại tên phương thức, sửa lại thành fakeDanhSac() nên viết một phương thức getAll() ở trong model rồi gọi ra chứ không nên viết ở Activity.
        arrdanhsach.add(new DanhSach("Chelsea","Anh",R.drawable.chelsea));
        arrdanhsach.add(new DanhSach("acmilan","Phap",R.drawable.acmilan));
        arrdanhsach.add(new DanhSach("barcelona","Duc",R.drawable.barcelona));
        arrdanhsach.add(new DanhSach("bayernmunchen","Y",R.drawable.bayernmunchen));
        arrdanhsach.add(new DanhSach("boro","Nhat Ban",R.drawable.boro));
        arrdanhsach.add(new DanhSach("celtic","Trung Quoc",R.drawable.celtic));
        arrdanhsach.add(new DanhSach("intermilan","My",R.drawable.intermilan));
        arrdanhsach.add(new DanhSach("liverpool","VietNam",R.drawable.liverpool));
        arrdanhsach.add(new DanhSach("manunited","Thai LAn",R.drawable.manunited));
    }
//Không được để dòng trống ở đây
}

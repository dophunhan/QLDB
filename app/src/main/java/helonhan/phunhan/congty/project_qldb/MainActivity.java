package helonhan.phunhan.congty.project_qldb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import helonhan.phunhan.adapter.Danhsachadapter;
import helonhan.phunhan.model.DanhSach;

public class MainActivity extends AppCompatActivity {
        ListView lvDanhSach;
        ArrayList<DanhSach> arrdanhsach;
        Danhsachadapter dsadapter;

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
    private void fakedanhsach(){
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

}

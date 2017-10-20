package helonhan.phunhan.adapter;

import android.app.Activity;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import helonhan.phunhan.congty.project_qldb.R;
import helonhan.phunhan.model.DanhSach;

/**
 * Created by DELL on 10/20/2017.
 */

public class Danhsachadapter extends ArrayAdapter<DanhSach>{
    Activity context;
    @LayoutRes int resource;
    @NonNull List<DanhSach> objects;
    public Danhsachadapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<DanhSach> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(resource,null);
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtQuocTich = (TextView) row.findViewById(R.id.txtQuocTich);
        ImageView imgHinh = (ImageView) row.findViewById(R.id.imgHinh);
        final DanhSach danhSach = this.objects.get(position);

        txtTen.setText(danhSach.getName());
        txtQuocTich.setText(danhSach.getQuoctich());
        imgHinh.setImageResource(danhSach.getHinh());

        return row;
    }




}

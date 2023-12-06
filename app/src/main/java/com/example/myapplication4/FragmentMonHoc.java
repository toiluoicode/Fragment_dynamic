package com.example.myapplication4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentMonHoc extends Fragment {
    public FragmentMonHoc(Monhoc monHoc) {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monhoc, container, false);

        if (getArguments() != null) {
            String image= getArguments().getString("TenHinh");
            String maMH = getArguments().getString("maMH");
            String tenHP = getArguments().getString("TenHP");
            String tenGV = getArguments().getString("TenGV");
            // Cập nhật các TextView, ImageView, etc.
            ImageView imageView = view.findViewById(R.id.imgMonhoc);
            TextView txtHocPhan = view.findViewById(R.id.txtMonhoc);
            TextView txtGiaoVien = view.findViewById(R.id.txtGv);
            String mon= tenHP + ": "+ maMH;
            txtHocPhan.setText(mon);
            txtGiaoVien.setText(tenGV);
            int imageResId = getResources().getIdentifier(image, "drawable", getActivity().getPackageName());
            if (imageResId != 0) {
                imageView.setImageResource(imageResId);
            }
        }
        return  view;
    }
    public static FragmentMonHoc newInstance(Monhoc monHoc) {
        FragmentMonHoc fragment = new FragmentMonHoc(monHoc);
        Bundle args = new Bundle();
        args.putString("TenHinh", monHoc.getTenHinh());
        args.putString("maMH", monHoc.getMaMh());
        args.putString("TenHP", monHoc.getTenMH());
        args.putString("TenGV", monHoc.getTenGV());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

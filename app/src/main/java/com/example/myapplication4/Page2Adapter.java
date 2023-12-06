package com.example.myapplication4;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class Page2Adapter extends FragmentStateAdapter {
    private List<Monhoc> listmh;
    public Page2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Page2Adapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public Page2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {

        super(fragmentManager, lifecycle);
        listmh = Monhoc.getlist();
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Monhoc monhoc = listmh.get(position);

        return FragmentMonHoc.newInstance(monhoc);
    }

    @Override
    public int getItemCount() {
        return listmh.size();
    }
}

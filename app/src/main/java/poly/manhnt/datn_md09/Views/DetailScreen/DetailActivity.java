package poly.manhnt.datn_md09.Views.DetailScreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import poly.manhnt.datn_md09.Adapters.DanhGiaAdapter;
import poly.manhnt.datn_md09.R;

public class DetailActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    DanhGiaAdapter danhGiaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        recyclerView = findViewById(R.id.recyclerDanhGia);

        List<String> list = new ArrayList<>();
        for(int i=0; i<20; i++){
            String ten = "Đánh giá "+ i;
            list.add(ten);
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false );
        danhGiaAdapter = new DanhGiaAdapter(this, list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(danhGiaAdapter);
        danhGiaAdapter.notifyDataSetChanged();
    }
}
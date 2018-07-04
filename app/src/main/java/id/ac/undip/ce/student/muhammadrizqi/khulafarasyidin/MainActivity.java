package id.ac.undip.ce.student.muhammadrizqi.khulafarasyidin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Khulafa>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(KhulafaData.getListData());
        showRecylerCardView();

    }

    private void showRecylerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewKhulafaAdapter cardViewPresidentAdapter= new CardViewKhulafaAdapter(this);
        cardViewPresidentAdapter.setListKhulafa(list);
        rvCategory.setAdapter(cardViewPresidentAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                if(v.getId() == R.id.btn_set_detail) {
                    showSelectedKhulafa(list.get(position));
                }
            }
        });
    }
    private void showSelectedKhulafa(Khulafa khulafa){
        Intent intent = new Intent(this, DetailKhulafaActivity.class);
        intent.putExtra("key", khulafa);
        startActivity(intent);
    }
}

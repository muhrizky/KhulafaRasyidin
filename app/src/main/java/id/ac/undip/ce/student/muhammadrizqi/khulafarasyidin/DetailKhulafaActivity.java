package id.ac.undip.ce.student.muhammadrizqi.khulafarasyidin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailKhulafaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_khulafa);
        Khulafa khulafaditerima = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView wafat = (TextView)findViewById(R.id.content_wafat);

        Glide.with(this).load(khulafaditerima.getPhoto()).override(350,550).into(gamabar);
        name.setText(khulafaditerima.getName());
        remarks.setText(khulafaditerima.getRemarks());
        deskripsi.setText(khulafaditerima.getDeskripsi());
        lahir.setText(khulafaditerima.getLahir());
        wafat.setText(khulafaditerima.getWafat());

    }
}

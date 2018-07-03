package id.ac.undip.ce.student.muhammadrizqi.khulafarasyidin;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewKhulafaAdapter extends RecyclerView.Adapter<CardViewKhulafaAdapter.CardViewHolder> {

    private ArrayList<Khulafa>listKhulafa;
    private Context context;

    public CardViewKhulafaAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Khulafa> getListKhulafa() {
        return listKhulafa;
    }

    public void setListKhulafa(ArrayList<Khulafa> listKhulafa) {
        this.listKhulafa = listKhulafa;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_khulafa, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Khulafa k = getListKhulafa().get(position);
        Glide.with(context).load(k.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvname.setText(k.getName());
        holder.tvremarks.setText(k.getRemarks());

        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "FAvorite"+getListKhulafa().get(position).getName(),Toast.LENGTH_SHORT).show();

            }
        }));

        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share"+getListKhulafa().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListKhulafa().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
         ImageView imgPhoto;
         TextView tvname, tvremarks;
         Button btnFavorite, btnsahre;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvname = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvremarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share);
            btnFavorite = (Button)itemView.findViewById(R.id.btn_set_favorite);

        }
    }
}

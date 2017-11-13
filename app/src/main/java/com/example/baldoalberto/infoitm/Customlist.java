package com.example.baldoalberto.infoitm;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Customlist extends ArrayAdapter<String>{
    private String[] edificio;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public Customlist(Activity context, String[] edificio, String[] desc, Integer[] imgid) {
        super(context, R.layout.lista_plantilla, edificio);

        this.context = context;
        this.edificio = edificio;
        this.desc = desc;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r = convertView;
        ViewHolder viewHolder = null;
        if(r==null)
        {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.lista_plantilla, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.imv.setImageResource(imgid[position]);
        viewHolder.tv1.setText(edificio[position]);
        viewHolder.tv2.setText(desc[position]);

        return r;
    }

    class ViewHolder
    {
        TextView tv1, tv2;
        ImageView imv;

        ViewHolder(View v)
        {
            tv1 = (TextView) v.findViewById(R.id.edificio);
            tv2 = (TextView) v.findViewById(R.id.descripcion);
            imv = (ImageView) v.findViewById(R.id.imagen);
        }
    }


}

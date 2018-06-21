package com.example.shlokpatel.mywhatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> con=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con.add(new Contact("Shlok","Hii","19:09",R.drawable.shlok));
        con.add(new Contact("Abhishek","I'll bring your CD","12:12",R.drawable.abhi));
        con.add(new Contact("Prayas","oye","03:59",R.drawable.prayas));
        con.add(new Contact("Ronaldo","I am going ","09:45",R.drawable.ron));
        con.add(new Contact("City","Are you coming??","16:53",R.drawable.city));
        con.add(new Contact("Adish","Kya hua??","09:12",R.drawable.adi));
        ListView listView=findViewById(R.id.lv);
        listView.setAdapter(new MyAdapter());

    }
    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return con.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
            View rv=layoutInflater.inflate(R.layout.item,viewGroup,false);
            Contact contact=con.get(i);
            CircleImageView imageView=rv.findViewById(R.id.profile_image);
            TextView tvName=rv.findViewById(R.id.name);
            TextView tvMssge=rv.findViewById(R.id.msg);
            TextView tvTime=rv.findViewById(R.id.hour);
            imageView.setImageResource(contact.getImageSrc());
            tvName.setText(contact.getName());
            tvMssge.setText(contact.getMessage());
            tvTime.setText(contact.getTime());
            return rv;
        }
    }
}

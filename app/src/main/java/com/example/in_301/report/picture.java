package com.example.in_301.report;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IN-301 on 2018-05-03.
 */

public class picture extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture);


        setTitle("배달");

        TextView tv_title = (TextView)findViewById(R.id.title);
        TextView tv_telephone = (TextView)findViewById(R.id.telephone);
        TextView tv_address = (TextView)findViewById(R.id.address);
        TextView tv_site = (TextView)findViewById(R.id.site);
        TextView tv_menuone_name = (TextView)findViewById(R.id.menuone_name);
        TextView tv_menutwo_name = (TextView)findViewById(R.id.menutwo_name);
        TextView tv_menuthree_name = (TextView)findViewById(R.id.menuthree_name);
        TextView tv_menufour_name = (TextView)findViewById(R.id.menufour_name);
        TextView tv_menufive_name = (TextView)findViewById(R.id.menufive_name);
        TextView tv_menusix_name = (TextView)findViewById(R.id.menusix_name);
        ImageView iv_picture = (ImageView)findViewById(R.id.picture);
        ImageView iv_map = (ImageView)findViewById(R.id.map);
        ImageView iv_menuone = (ImageView)findViewById(R.id.menuone);
        ImageView iv_menutwo = (ImageView)findViewById(R.id.menutwo);
        ImageView iv_menuthree = (ImageView)findViewById(R.id.menuthree);
        ImageView iv_menufour = (ImageView)findViewById(R.id.menufour);
        ImageView iv_menufive = (ImageView)findViewById(R.id.menufive);
        ImageView iv_menusix = (ImageView)findViewById(R.id.menusix);

        Intent it = getIntent();
        String tag = it.getStringExtra("it_tag");

        Resources res = getResources();

        int id_title = res.getIdentifier("title" + tag, "string", getPackageName());
        String title = res.getString(id_title);
        tv_title.setText(title);

        int id_telephone = res.getIdentifier("telephone" + tag, "string", getPackageName());
        String telephone = res.getString(id_telephone);
        tv_telephone.setText(telephone);

        int id_address = res.getIdentifier("address" + tag, "string", getPackageName());
        String address = res.getString(id_address);
        tv_address.setText(address);

        int id_site = res.getIdentifier("site" + tag, "string", getPackageName());
        String site = res.getString(id_site);
        tv_site.setText(site);

        int id_menuone_name = res.getIdentifier("menuone_name" + tag, "string", getPackageName());
        String menuone_name = res.getString(id_menuone_name);
        tv_menuone_name.setText(menuone_name);

        int id_menutwo_name = res.getIdentifier("menutwo_name" + tag, "string", getPackageName());
        String menutwo_name = res.getString(id_menutwo_name);
        tv_menutwo_name.setText(menutwo_name);

        int id_menuthree_name = res.getIdentifier("menuthree_name" + tag, "string", getPackageName());
        String menuthree_name = res.getString(id_menuthree_name);
        tv_menuthree_name.setText(menuthree_name);

        int id_menufour_name = res.getIdentifier("menufour_name" + tag, "string", getPackageName());
        String menufour_name = res.getString(id_menufour_name);
        tv_menufour_name.setText(menufour_name);

        int id_menufive_name = res.getIdentifier("menufive_name" + tag, "string", getPackageName());
        String menufive_name = res.getString(id_menufive_name);
        tv_menufive_name.setText(menufive_name);

        int id_menusix_name = res.getIdentifier("menusix_name" + tag, "string", getPackageName());
        String menusix_name = res.getString(id_menusix_name);
        tv_menusix_name.setText(menusix_name);

        int id_picture = res.getIdentifier("picture" + tag, "string", getPackageName());
        String picture = res.getString(id_picture);
        int id_img = res.getIdentifier(picture, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(id_img);
        iv_picture.setBackground(drawable);

        int id_map = res.getIdentifier("map" + tag, "string", getPackageName());
        String map = res.getString(id_map);
        int id_img2 = res.getIdentifier(map, "drawable", getPackageName());
        Drawable drawable2 = res.getDrawable(id_img2);
        iv_map.setBackground(drawable2);

        int id_menuone = res.getIdentifier("menuone" + tag, "string", getPackageName());
        String menuone = res.getString(id_menuone);
        int id_img3 = res.getIdentifier(menuone, "drawable", getPackageName());
        Drawable drawable3 = res.getDrawable(id_img3);
        iv_menuone.setBackground(drawable3);

        int id_menutwo = res.getIdentifier("menutwo" + tag, "string", getPackageName());
        String menutwo = res.getString(id_menutwo);
        int id_img4 = res.getIdentifier(menutwo, "drawable", getPackageName());
        Drawable drawable4 = res.getDrawable(id_img4);
        iv_menutwo.setBackground(drawable4);

        int id_menuthree = res.getIdentifier("menuthree" + tag, "string", getPackageName());
        String menuthree = res.getString(id_menuthree);
        int id_img5 = res.getIdentifier(menuthree, "drawable", getPackageName());
        Drawable drawable5 = res.getDrawable(id_img5);
        iv_menuthree.setBackground(drawable5);

        int id_menufour = res.getIdentifier("menufour" + tag, "string", getPackageName());
        String menufour = res.getString(id_menufour);
        int id_img6 = res.getIdentifier(menufour, "drawable", getPackageName());
        Drawable drawable6 = res.getDrawable(id_img6);
        iv_menufour.setBackground(drawable6);

        int id_menufive = res.getIdentifier("menufive" + tag, "string", getPackageName());
        String menufive = res.getString(id_menufive);
        int id_img7 = res.getIdentifier(menufive, "drawable", getPackageName());
        Drawable drawable7 = res.getDrawable(id_img7);
        iv_menufive.setBackground(drawable7);

        int id_menusix = res.getIdentifier("menusix" + tag, "string", getPackageName());
        String menusix = res.getString(id_menusix);
        int id_img8 = res.getIdentifier(menusix, "drawable", getPackageName());
        Drawable drawable8 = res.getDrawable(id_img8);
        iv_menusix.setBackground(drawable8);
    }
    public void call(View v) {
        int id = v.getId();
        TextView tv = (TextView)v.findViewById(id);
        String tel = (String)tv.getText();

        Uri number;
        number = Uri.parse("tel:"+tel);
        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void web(View v) {
        int id = v.getId();
        TextView tv = (TextView) v.findViewById(id);
        String site = (String) tv.getText();

        Uri uri;
        uri = Uri.parse(site);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

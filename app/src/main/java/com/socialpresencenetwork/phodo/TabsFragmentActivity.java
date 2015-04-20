package com.socialpresencenetwork.phodo;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TabsFragmentActivity extends FragmentActivity implements View.OnClickListener {
Context ctx=this;
   Button search_Bt;
   Button friends_Bt;
   Button request_Bt;
   ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_fragment);
       pager =(ViewPager)findViewById(R.id.pager);
         search_Bt= (Button)findViewById(R.id.bt_search);
        search_Bt.setOnClickListener(this);
        friends_Bt= (Button)findViewById(R.id.bt_friends);
        friends_Bt.setOnClickListener(this);
        request_Bt= (Button)findViewById(R.id.bt_request);
        request_Bt.setOnClickListener(this);
        CustomPagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.bt_friends:
        pager.setCurrentItem(0);
        break;
    case R.id.bt_search:
        pager.setCurrentItem(1);
        break;
    case R.id.bt_request:
        pager.setCurrentItem(2);
        break;
}
    }
}

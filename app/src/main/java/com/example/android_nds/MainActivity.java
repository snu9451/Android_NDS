package com.example.android_nds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    boolean isAllFabsVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFragReqErrand(findViewById(R.id.frag_req_errand));
        setContentView(R.layout.activity_main);
    }
    public void setFragReqErrand(View v){
        Log.i("myLog","setFragReqErrand 호출 완료");
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag_req_errand, new ReqErrandFragment(), "reqErrand");
        ft.commit();
    }

    // fab_main 플로팅 버튼이 클릭되었을 때의 이벤트 구현
    public void f_menuExtend(View v){
        FloatingActionButton fab_chat = (FloatingActionButton)findViewById(R.id.fab_chat);
        FloatingActionButton fab_errand = (FloatingActionButton)findViewById(R.id.fab_errand);
        FloatingActionButton fab_item = (FloatingActionButton)findViewById(R.id.fab_item);
        TextView tv_chat = (TextView)findViewById(R.id.tv_chat);
        TextView tv_errand = (TextView)findViewById(R.id.tv_errand);
        TextView tv_item = (TextView)findViewById(R.id.tv_item);
//        fab_errand.setVisibility(View.VISIBLE);

        // 세 플로팅 버튼들이 모두 숨김상태일 때때
       if(!isAllFabsVisible){
           fab_chat.show();
           fab_errand.show();
           fab_item.show();
           fab_chat.setEnabled(true);
           fab_errand.setEnabled(true);
           fab_item.setEnabled(true);
           tv_chat.setVisibility(View.VISIBLE);
           tv_errand.setVisibility(View.VISIBLE);
           tv_item.setVisibility(View.VISIBLE);
           isAllFabsVisible = true;
       } else {
           fab_chat.hide();
           fab_errand.hide();
           fab_item.hide();
           fab_chat.setEnabled(false);
           fab_errand.setEnabled(false);
           fab_item.setEnabled(false);
           tv_chat.setVisibility(View.GONE);
           tv_errand.setVisibility(View.GONE);
           tv_item.setVisibility(View.GONE);
           isAllFabsVisible = false;
       }
    }
}
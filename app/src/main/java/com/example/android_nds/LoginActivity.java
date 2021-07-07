package com.example.android_nds;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class LoginActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    FragmentManager fragmentManager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // 부모 클래스의 생성자도 호출해주는 편이 안전하다(p57)
        setContentView(R.layout.activity_login); // 액티비티의 화면을 구성해줄 xml을 선택/설정 - layout으로 접근하므로 xml파일명
//        Log.i(this.getClass().getName(), "onCreate 호출"); // 로그출력
//        Toolbar toolbar = findViewById(R.id.toolbar); // 툴바 요소를 선택 - id로 접근하므로 id
//        // 툴바 장착하기
//        setSupportActionBar(toolbar);
//        // 버거아이콘으로 나브바 열 수 있도록 하기
//        /**********************************************************************
//         * @param1 : 현재 액티비티(this, getApplicationContext(), getContext())
//         * @액티비티의 drawer
//         * @액티비티의 툴바
//         * @param4 : 드로워 열기
//         * @param5 : 드로워 닫기
//         **********************************************************************/
//        DrawerLayout drawer = findViewById(R.id.drawer_layout); // actionbar의 화면을 구성해줄 xml을 선택
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
//                drawer,
//                toolbar,
//                R.string.nav_open_drawer,
//                R.string.nav_close_drawer);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        // 이벤트 소스와 이벤트 핸들러를 연결
//        navigationView.setNavigationItemSelectedListener(this);
////        fragmentManager.beginTransaction()
////                .replace(R.id.content_frame, LoginFragment.class, null)
////                .setReorderingAllowed(true)
////                .addToBackStack(null)
////                .commit();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(this.getClass().getName(), "onStart");
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
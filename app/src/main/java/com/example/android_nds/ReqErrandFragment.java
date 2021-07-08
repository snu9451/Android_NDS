package com.example.android_nds;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ReqErrandFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_req_errand, container, false);
//        Log.i("myLog","111");
        String[] list = {"이순신", "유관순", "제임스", "홍길동1", "이순신1", "유관순1", "제임스1", "홍길동2", "이순신2", "유관순2", "제임스2"};
//        Log.i("myLog","222");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
//        Log.i("myLog","333");
//        ListView lv = (ListView)getActivity().findViewById(R.id.lv_req_errand);   // NullPointerException: Attempt to invoke virtual method 'void android.widget.ListView.setAdapter...
        ListView lv = (ListView)view.findViewById(R.id.lv_req_errand);
//        Log.i("myLog","444");
        lv.setAdapter(adapter);
//        Log.i("myLog","555");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /*****************************************************************************************************
             *
             * @param parent
             * @param view : 찍히는 값 => androidx.appcompat.widget.AppCompat.TextView (배열에 담은 것이 String이라서인가?)
             * @param position : Row의 number로, 0번부터 시작한다.
             * @param id
             *****************************************************************************************************/
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("myLog", "리스트 클릭했어요");
                // 프래그먼트에서 토스트를 사용할 땐, context인자로 this가 아닌 activity를 넘겨주어야 한다.
                // 또한 show를 호출해주지 않으면 메세지가 노출되지 않는다.
                Toast.makeText(getActivity(), "토스트메세지, position: "+position+", view: "+view+", long id: "+id, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }




}
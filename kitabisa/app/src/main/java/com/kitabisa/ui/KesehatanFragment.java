package com.kitabisa.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kitabisa.R;
import com.kitabisa.adapter.DonasiBawahAdapter;
import com.kitabisa.model.DonasiBawahModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KesehatanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KesehatanFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView rc;
    private Context context;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public KesehatanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KesehatanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static KesehatanFragment newInstance(String param1, String param2) {
        KesehatanFragment fragment = new KesehatanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_kesehatan, container, false);
        context = getActivity();
        rc = v.findViewById(R.id.rc);

        DonasiBawahModel data = new DonasiBawahModel();
        List<DonasiBawahModel> objList = new ArrayList<>();
        data.setImgurl(getResources().getDrawable(R.drawable.bayi));
        data.setJuduldonasi("Alamat Gagal Jantung Bantu Kembar Siam Operasi");
        data.setUser("Laziz Muhhamadyah");
        data.setTotaldonasi("Rp.191.142.346");
        data.setSisahari("30");
        objList.add(data);
        data = new DonasiBawahModel();
        data.setImgurl(getResources().getDrawable(R.drawable.siti));
        data.setJuduldonasi("Siti Ingin Sembuh Demi Anak Semata Wayangya");
        data.setUser("Siti Widamayanti");
        data.setTotaldonasi("Rp.236.518.794");
        data.setSisahari("13");
        objList.add(data);

        DonasiBawahAdapter adapter = new DonasiBawahAdapter(context, objList);
        rc.setAdapter(adapter);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        rc.setLayoutManager(layoutManager);

        return v;
    }
}
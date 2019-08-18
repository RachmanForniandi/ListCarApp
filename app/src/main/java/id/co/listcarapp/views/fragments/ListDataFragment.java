package id.co.listcarapp.views.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.listcarapp.R;
import id.co.listcarapp.adapters.CarAdapter;
import id.co.listcarapp.specialClass.CarDataProvider;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListDataFragment extends Fragment {

    @BindView(R.id.list_owner)
    RecyclerView listOwner;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public ListDataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_data, container, false);
        ButterKnife.bind(this,view);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listOwner.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());

        listOwner.setLayoutManager(layoutManager);
        adapter = new CarAdapter(this.getActivity(), CarDataProvider.cars);
        listOwner.setAdapter(adapter);
    }
}

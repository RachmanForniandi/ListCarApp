package id.co.listcarapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.listcarapp.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_car_info) Button btnCarInfo;
    @BindView(R.id.btn_owner_info)Button btnOwnerInfo;
    @BindView(R.id.img_car_logo) ImageView imgCarLogo;
    @BindView(R.id.tv_model_car_name) TextView tvModelCarName;
    @BindView(R.id.tv_name_owner)TextView tvNameOwner;
    @BindView(R.id.tv_contact_no)TextView tvContactNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

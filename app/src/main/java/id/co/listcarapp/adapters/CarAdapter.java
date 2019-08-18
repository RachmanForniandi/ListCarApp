package id.co.listcarapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.listcarapp.R;
import id.co.listcarapp.models.Car;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarHolder> {

    private ArrayList<Car> cars;
    Context context;

    public CarAdapter(Context context, ArrayList<Car> data) {
        this.cars = data;
        this.context = context;
    }

    @Override
    public CarHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car,parent,false);
        return new CarHolder(view);
    }

    @Override
    public void onBindViewHolder(CarHolder holder, int i) {
        holder.itemView.setTag(cars.get(i));

        holder.tvOwner.setText(cars.get(i).getNameOwner());
        holder.tvModelCar.setText(cars.get(i).getModel());

        if (cars.get(i).getLogo().equals("Toyota")||cars.get(i).getLogo().equals("TOYOTA")){
            holder.brandCarSymbol.setImageResource(R.drawable.toyota_logo);
        }else if (cars.get(i).getLogo().equals("Nissan")||cars.get(i).getLogo().equals("NISSAN")){
            holder.brandCarSymbol.setImageResource(R.drawable.nissan_logo);
        }else if (cars.get(i).getLogo().equals("BMW")||cars.get(i).getLogo().equals("bmw")){
            holder.brandCarSymbol.setImageResource(R.drawable.bmw_logo);
        }else if (cars.get(i).getLogo().equals("Honda")||cars.get(i).getLogo().equals("HONDA")){
            holder.brandCarSymbol.setImageResource(R.drawable.honda_logo);
        }else if (cars.get(i).getLogo().equals("Peugeot")||cars.get(i).getLogo().equals("PEUGEOT")){
            holder.brandCarSymbol.setImageResource(R.drawable.logo_peugeot);
        }else {
            Toast.makeText(context, "Merk mobil tidak dikenal !!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class CarHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.brand_car_symbol)
        ImageView brandCarSymbol;
        @BindView(R.id.tv_model_car)
        TextView tvModelCar;
        @BindView(R.id.tv_owner)
        TextView tvOwner;

        public CarHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}

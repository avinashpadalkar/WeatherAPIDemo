package com.avinash.weather15june.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.avinash.weather15june.R;
import com.avinash.weather15june.models.GsonResponse;
import com.avinash.weather15june.models.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avinash.Padalkar on 15/06/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context mContext;
    private List<GsonResponse> responseList;
    private LayoutInflater inflater;
    private List<com.avinash.weather15june.models.List> listBeanList = new ArrayList<com.avinash.weather15june.models.List>();
    public MainAdapter(Context mContext, List<GsonResponse> responseList) {

        this.mContext = mContext;
        this.responseList = responseList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listBeanList = responseList.get(0).getList();
    }

    public MainAdapter() {

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View rowItem = LayoutInflater.from(mContext).inflate(R.layout.row_item_main , parent , false);

        return new ViewHolder(rowItem);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        try {
            holder.tvDt.setText("Dt = "+listBeanList.get(position).getDt_txt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            holder.tvSnow.setText("Snow = "+listBeanList.get(position).getSnow().getM3h());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            holder.tvSpeed.setText("Speed = "+listBeanList.get(position).getWind().getSpeed());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            holder.tvDegree.setText("Degree = "+listBeanList.get(position).getWind().getDeg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        if(responseList.size()>0 && responseList.size()>listBeanList.size()){
            return responseList.size();
        }else if(listBeanList.size()>0 && listBeanList.size()>responseList.size()){
            return listBeanList.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDt , tvSnow , tvSpeed , tvDegree;
        public ViewHolder(View itemView) {
            super(itemView);

            tvDt = (TextView) itemView.findViewById(R.id.tv_dt);
            tvSnow = (TextView) itemView.findViewById(R.id.tv_snow);
            tvSpeed = (TextView) itemView.findViewById(R.id.tv_speed);
            tvDegree = (TextView) itemView.findViewById(R.id.tv_degree);

        }
    }
}

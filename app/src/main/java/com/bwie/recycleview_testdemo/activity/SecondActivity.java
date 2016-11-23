package com.bwie.recycleview_testdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bwie.recycleview_testdemo.R;
import com.bwie.recycleview_testdemo.bean.mDataBean;
import com.bwie.recycleview_testdemo.util.OkHttp;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Request;

public class SecondActivity extends Activity {

    private RecyclerView mRV_view;
    private String Url = "http://mock.eoapi.cn/success/ZCtrJzeLp4VfCk5N52N9waA3AHSiVI6L";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mRV_view = (RecyclerView) findViewById(R.id.mRV_view);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        linearLayout.setOrientation(LinearLayoutManager.VERTICAL);
        mRV_view.setLayoutManager(linearLayout);
        //mRV_view.setAdapter(null);
        getHttpData();
    }
    //网络请求数据
    public void getHttpData() {
        OkHttp.getAsync(Url, new OkHttp.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {

            }

            @Override
            public void requestSuccess(String result) throws Exception {
                String json=result;
                analysisData(json);
            }
        });
    }

    private void analysisData(String json) {
        Gson gson=new Gson();
        mDataBean mData = gson.fromJson(json, mDataBean.class);
        mDataBean.DataBean data = mData.getData();

    }
}

package com.diomun.learn.androidevusingjava.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.diomun.learn.androidevusingjava.R;
import com.diomun.learn.androidevusingjava.base.BaseActivity;
import com.diomun.learn.androidevusingjava.base.OnMultiClickListener;

/**
 * @author DiaoMengQ
 */
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, String.format("%s onCreate", TAG));
        mContext = this;
        mView = mContext.findViewById(R.id.mainActivity);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    OnMultiClickListener multiClickListener = new OnMultiClickListener() {
        @Override
        public void onMultiClick(View v) {
            switch (v.getId()) {
                case R.id.btn_toListView:
                    Toast.makeText(mContext, "點擊btn_toListView", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_test:
                    Toast.makeText(mContext, "點擊btn_test", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + v.getId());
            }
        }
    };

    @Override
    public void initView() {
        Button listBtn = findViewById(R.id.btn_toListView);
        Button testBtn = findViewById(R.id.btn_test);

        listBtn.setOnClickListener(multiClickListener);
        testBtn.setOnClickListener(multiClickListener);
    }

    @Override
    public void initData() {
    }
}

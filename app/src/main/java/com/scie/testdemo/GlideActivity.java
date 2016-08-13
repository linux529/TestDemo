package com.scie.testdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scie.testdemo.recyclerview.sample.TestHolderAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/13.
 */
public class GlideActivity extends Activity {

    private RecyclerView mRecyclerView;
    private TestHolderAdapter mTestAdapter;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_test);
        mDatas = getDatas();
        mTestAdapter = new TestHolderAdapter(mDatas);
        mRecyclerView.setAdapter(mTestAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<String> getDatas(){
        List<String> datas = new ArrayList<>();
        datas.add("http://picm.photophoto.cn/005/008/007/0080071495.jpg");
        datas.add("http://img4.imgtn.bdimg.com/it/u=2599458843,565088941&fm=21&gp=0.jpg");
        datas.add("http://pic76.nipic.com/file/20150826/19291311_131809771000_2.jpg");
        datas.add("http://picm.photophoto.cn/005/008/007/0080073225.jpg");
        datas.add("http://img.taopic.com/uploads/allimg/140222/240404-14022210562883.jpg");
        datas.add("http://pic8.nipic.com/20100623/55218_100905033361_2.jpg");
        datas.add("http://pic10.nipic.com/20100927/2457331_105358511000_2.jpg");
        datas.add("http://img2.imgtn.bdimg.com/it/u=2895709774,2211211946&fm=21&gp=0.jpg");
        datas.add("http://pic16.nipic.com/20110916/8257875_125422610000_2.jpg");
        datas.add("http://d.hiphotos.baidu.com/zhidao/pic/item/e7cd7b899e510fb38cc9205dd833c895d0430c23.jpg");
        datas.add("http://scimg.jb51.net/allimg/160716/105-160G61F250436.jpg");
        datas.add("http://img0.imgtn.bdimg.com/it/u=2877535832,40008850&fm=21&gp=0.jpg");
        datas.add("http://pic5.nipic.com/20100303/1227818_111212939372_2.jpg");
        datas.add("http://pic9.nipic.com/20100823/5325144_115604065300_2.jpg");
        datas.add("http://image.tianjimedia.com/uploadImages/2012/175/HULDG7W2EP37.jpg");
        datas.add("http://img3.redocn.com/20100303/Redocn_2010030310225694.jpg");
        datas.add("http://pic33.nipic.com/20130907/13478874_100501441177_2.jpg");

        return datas;
    }
}

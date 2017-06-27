package cn.ernest.com;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.ernest.ioc.view.annotation.ContentView;
import cn.ernest.ioc.view.annotation.OnClick;
import cn.ernest.ioc.view.annotation.ViewInject;


@ContentView(value = R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @ViewInject(R.id.id_btn)
    private Button mBtn1;
    @ViewInject(R.id.id_btn02)
    private Button mBtn2;

    @Override
    public void initView() {
        super.initView();
        mBtn1.setText("Ha Ha Ha Ha");

        mBtn2.setText("Hia Hia Hia Hia");
    }

    @OnClick({R.id.id_btn, R.id.id_btn02})
    public void clickBtnInvoked(View view) {
        switch (view.getId()) {
            case R.id.id_btn:
                Toast.makeText(this, "Inject Btn01 !", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn02:
                Toast.makeText(this, "Inject Btn02 !", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}

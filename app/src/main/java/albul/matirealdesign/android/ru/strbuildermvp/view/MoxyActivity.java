package albul.matirealdesign.android.ru.strbuildermvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import albul.matirealdesign.android.ru.strbuildermvp.presenter.MoxyPresenter;
import albul.matirealdesign.android.ru.strbuildermvp.R;

public class MoxyActivity extends MvpAppCompatActivity implements ControlMoxyView, View.OnClickListener{

    private TextView tvStrBuild;
    private EditText etStrBuild;
    private Button btnStrBuild;

    @InjectPresenter
    MoxyPresenter presenter;

    @ProvidePresenter
    public MoxyPresenter providePresenter(){
        return  new MoxyPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);
        tvStrBuild = findViewById(R.id.tv_str_build2);
        etStrBuild = findViewById(R.id.et_str_build2);
        btnStrBuild = findViewById(R.id.btn_str_build2);
        btnStrBuild.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_str_build2:
                presenter.btnClick(1, etStrBuild.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void setBuildStr(String str) {
       // Log.d("make", "setBuildStr: " + str);
        if (str != null) tvStrBuild.setText(str);
    }

    public String getTextET(){
        return etStrBuild.getText().toString();
    }

    @Override
    public void setTextET(String str){
        etStrBuild.setText(str);
    }

}

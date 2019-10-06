package albul.matirealdesign.android.ru.strbuildermvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import albul.matirealdesign.android.ru.strbuildermvp.presenter.Presenter;
import albul.matirealdesign.android.ru.strbuildermvp.R;

public class MainActivity extends AppCompatActivity implements ControlMainView, View.OnClickListener {

    private TextView tvStrBuild;
    private EditText etStrBuild;
    private Button btnStrBuild;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStrBuild = findViewById(R.id.tv_str_build);
        etStrBuild = findViewById(R.id.et_str_build);
        btnStrBuild = findViewById(R.id.btn_str_build);
        btnStrBuild.setOnClickListener(this);
        presenter = new Presenter(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_str_build:
                presenter.btnClick(1);
                break;
            default:
                break;
        }
    }

    @Override
    public void setBuildStr(String str) {
        if (str != null) tvStrBuild.setText(str);
    }

    public String getTextET(){
        return etStrBuild.getText().toString();
    }

    public void setTextET(String str){
        etStrBuild.setText(str);
    }

}

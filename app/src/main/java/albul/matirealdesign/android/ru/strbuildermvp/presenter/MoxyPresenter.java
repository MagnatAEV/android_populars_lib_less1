package albul.matirealdesign.android.ru.strbuildermvp.presenter;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import albul.matirealdesign.android.ru.strbuildermvp.model.Model;
import albul.matirealdesign.android.ru.strbuildermvp.view.ControlMoxyView;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<ControlMoxyView> {

    private Model model;

    public MoxyPresenter(){
        this.model = new Model();
    }

    public void btnClick(int btnIdx, String str){
        switch (btnIdx){
            case 1:
                model.append(str);
                if (model.getString().length() >= 15) model.clearText();
                Log.d("ClickBtn2", "btnClick2: " + str);
                //view.setBuildStr(model.getString());
                getViewState().setBuildStr(model.getString());
                getViewState().setTextET("");
                break;
            default:
                break;
        }
    }


}

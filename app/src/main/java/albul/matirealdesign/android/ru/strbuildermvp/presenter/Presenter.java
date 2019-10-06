package albul.matirealdesign.android.ru.strbuildermvp.presenter;

import albul.matirealdesign.android.ru.strbuildermvp.view.MainActivity;
import albul.matirealdesign.android.ru.strbuildermvp.model.Model;

public class Presenter {

    private Model model;
    private MainActivity view;
    private StringBuilder stringBuilder;

    public Presenter(MainActivity view){
        stringBuilder = new StringBuilder();
        this.model = new Model();
        this.view = view;
    }

    public void btnClick(int btnIdx){
        switch (btnIdx){
            case 1:
                model.append(view.getTextET());
                if (model.getString().length() >= 15) model.clearText();
                view.setBuildStr(model.getString());
                view.setTextET("");
                break;
            default:
                break;
        }
    }



}

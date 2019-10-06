package albul.matirealdesign.android.ru.strbuildermvp.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface ControlMoxyView extends MvpView {

    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setBuildStr(String str);

    @StateStrategyType(value = AddToEndSingleStrategy.class)
    void setTextET(String str);

}

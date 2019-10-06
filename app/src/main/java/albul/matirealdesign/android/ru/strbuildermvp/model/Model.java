package albul.matirealdesign.android.ru.strbuildermvp.model;

public class Model {

    private StringBuilder text;

    public Model(){
        text = new StringBuilder();
    }

    public void append(String string){
        text.append(string);
    }

    public String getString(){
        return text.toString();
    }

    public void clearText(){
        text.setLength(0);
    }

}

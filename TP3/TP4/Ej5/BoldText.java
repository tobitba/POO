package Ej5;

public class BoldText extends Tag {
    private static final String BOLD_TAG = "b";
    private static final String BOLD_ATTRIBUTES = "";

    public BoldText(HTMLText text){
        super(BOLD_TAG, BOLD_ATTRIBUTES, text);

    }
}

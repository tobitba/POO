package Ej5;

public class ItalicText extends Tag {
    private static final String ITALIC_TAG = "i";
    private static final String ITALIC_ATTRIBUTES = "";

    public ItalicText(HTMLText text){
        super(ITALIC_TAG, ITALIC_ATTRIBUTES, text);

    }
}

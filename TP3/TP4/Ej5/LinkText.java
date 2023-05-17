package Ej5;

public class LinkText extends Tag {
    private static final String LINK_TAG = "a";
    private static final String LINK_ATTRIBUTES = " href:";

    public LinkText(HTMLText text, String link){
        super(LINK_TAG, LINK_ATTRIBUTES + link , text);

    }
    
}

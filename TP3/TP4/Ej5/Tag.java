package Ej5;

public abstract class Tag implements HTMLText{
    
    private final String tag;
    private final String attributes;
    private HTMLText text;

    public Tag(String tag, String attributes, HTMLText text) {
        this.tag = tag;
        this.attributes = attributes;
        this.text = text;
    }

    @Override
    public String source(){
        return "<%s%s>%s</%s>".formatted(tag,attributes,text.source(),tag);
    }

    @Override
    public String toString() {
        return source();
    }

}

public class TextBox extends UIWidget {

    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox létrehozva");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return this.text;
    }
}

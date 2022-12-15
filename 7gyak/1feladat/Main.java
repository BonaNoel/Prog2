public class Main {
    public static void main(String[] args) {

        // UIWidget widget = new UIWidget();

        // System.out.println(widget.isEnabled());
        // widget.disable();
        // System.out.println(widget.isEnabled());

        // System.out.println("-----------------");

        // TextBox tb1 = new TextBox();
        // System.out.println(tb1.isEnabled());
        // tb1.disable();
        // System.out.println(tb1.isEnabled());
        // tb1.setText("Hello");
        // System.out.println(tb1.getText());
        // tb1.clear();

        // Object obj = new Object();
        // // get class || melyik osztály példánya
        // // equals || összehasonlít objektumokat
        // // hashcode || objektum memóriacíme alapján generál egy hash értéket
        // // toString || string reprezentáció

        // System.out.println(tb1);
        // System.out.println(tb1.hashCode());
        // System.out.println(Integer.toHexString(tb1.hashCode()));

        // TextBox tb2 = tb1;
        // System.out.println(tb2.hashCode());

        // System.out.println(tb1.equals(tb2));

        // TextBox box1 = new TextBox();u
        // TextBox box2 = new TextBox();

        // System.out.println(box1.equals(box2));

        // TextBox box1 = new TextBox();
        // box1.setText("pisikaki");
        // System.out.println(box1);

        // upcasting: egy objektumot valamelyik szuperosztályának (általában szülőlyére)
        // castolok

        // downcasting: egy objektumot valamelyik leszármazott osztályának tipusára
        // castolok

        // minden rendszerben igaz az, hogy mindenütt ahol egy szuperosztály példánya
        // szerepelt, szerepelhet egy alosztály példánya is de fordítva nem

        // szűlőosztály egy példánya nem alakitható át a gyermekosztály tipusára kivéve
        // donwcasting csak akkor mukodik amikor egy A tipusu objektumot upcastoltam B tipusura majd vissza downcastoltam A tipusura

        UIWidget widget = new UIWidget(true);
        TextBox box = new TextBox();
        box.setText("habil te puki");
        show(box);

    }

    public static void show(UIWidget widget) {
        TextBox box = (TextBox)widget;
        box.setText("na");
        System.out.println(box);
    }

}

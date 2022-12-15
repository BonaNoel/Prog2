public class Main {
    public static void main(String[] args) {

        UIWidget[] widgets = {new TextBox(), new RadioButton()};

        for (UIWidget widget : widgets) {

            System.out.println(widget.getClass());
            widget.render();
        }


    }
}


// encapsulation(egységbezárás): amikor az adatokat(mezőket,változókat,atributumokat) és az ezeken műveleteket végző metódusokat  együtt kezelünk,
// egy osztályba fogjuk őket össze 

// absztrakt osztály nem példányosítható, de kiterjeszthető

// ha egy osztály kiterjeszti azt az osztályt aminek van absztrakt metódusa
// akkor az alosztálynak implementálnia kell majd ezt a metódust

// absztrakt metódus csak absztrakt osztályban szerepelhet

// absztrakt osztály célja közös kód biztosítása az alosztájainak számára
import java.util.ArrayList;

public class Firma {
    private ArrayList<Pracownik> pracownicy;

    public Firma() {
        pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }
    public double ileNaWyplaty(){
        double kwota = 0;
        for (int i = 0; i < pracownicy.size(); i++) {
            kwota = kwota +pracownicy.get(i).getWyplata();
        }

        return kwota;
    }
}

public class Main {
    public static void main(String[] args) {

        Firma firma = new Firma();

        Pracownik pracownikMax = new Pracownik("Max","Sielski",6400,"junior");
        Pracownik pracownikAsia = new Pracownik("Asia","Basia",15000,"senior");
        Pracownik pracownikIsia = new Pracownik("Isia","Lisia",11000,"tester");
        Kierownik kierownik = new Kierownik("Scooby","Doo",20000,"majster");
        firma.dodajPracownika(pracownikMax);
        firma.dodajPracownika(pracownikAsia);
        firma.dodajPracownika(pracownikIsia);
        kierownik.dodajPracownika(pracownikAsia);
        kierownik.dodajPracownika(pracownikMax);
        System.out.println(pracownikAsia);
        System.out.println(pracownikMax);
        System.out.println(pracownikIsia);
        System.out.println(kierownik);
        System.out.println(firma.ileNaWyplaty());
        kierownik.dajPodwyzke(10);
        System.out.println(firma.ileNaWyplaty());

        System.out.println(pracownikAsia);
        System.out.println(pracownikMax);
        System.out.println(pracownikIsia);
        System.out.println(kierownik);
    }
}
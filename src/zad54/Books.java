package zad54;

import java.util.ArrayList;
import java.util.Comparator;

// klasa testowa
public class Books {
    public static void main(String[] args) {
        ArrayList<Ksiazka> biblioteka = new ArrayList<Ksiazka>();
        biblioteka.add(new Ksiazka( "Stary człowiek i morze", "Hemingway", 120));
        biblioteka.add(new Ksiazka("Mistrz i Małgorzata", "Bułhakow", 240));
        biblioteka.add(new Ksiazka("Myśli", "Pascal", 240));
        biblioteka.add(new Ksiazka("Bracia Karamazow","Dostojewski", 1000));
        biblioteka.add(new Ksiazka("Huxley","Nowy wspaniały świat", 1000));

        // lambda skrócony zapis
        biblioteka.sort(Comparator.comparing(Ksiazka::getTytul));
        biblioteka.forEach(System.out::println);

    }
}

class Ksiazka {
    String tytul;
    String autor;
    int liczbaStron;

    public Ksiazka() {
    }
    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", liczbaStron=" + liczbaStron +
                '}';
    }
}

class Ebook extends Ksiazka {
    int rozmiar;
    String Format;

    public Ebook(int rozmiar, String format) {
        this.rozmiar = rozmiar;
        Format = format;
    }

    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        Format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }
}


class KsiazkaPapierowa extends Ksiazka {
    int rokWydania;

    public KsiazkaPapierowa(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}

import java.util.Comparator;

public class SortareCursProfesor implements Comparator<Curs> {

    @Override
    public int compare(Curs o1, Curs o2) {
        return o1.profu.nume.compareTo(o2.profu.nume);
    }
}
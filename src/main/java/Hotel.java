import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Hotel implements Iterable<Animal>{

    private List<Animal> animais = new ArrayList<Animal>();

    public Hotel(Animal... alunos) {
        this.animais = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Animal> iterator() {
        return animais.iterator();
    }
}

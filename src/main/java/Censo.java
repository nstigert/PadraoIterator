import java.util.Iterator;

public class Censo {
    public static Integer contarAnimaisHospedadosNoHotel(Hotel hotel) {
        int quantidade = 0;
        for (Animal aluno : hotel) {
            if (aluno.isHospedado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalAnimaisCadastradosHotel(Hotel hotel) {
        int quantidade = 0;
        for (Iterator a = hotel.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}

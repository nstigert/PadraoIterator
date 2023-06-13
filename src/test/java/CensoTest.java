import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {
    @Test
    void deveContarAnimaisHospedadosHotel() {
        Hotel hotel = new Hotel(
                new Animal("Marie", true, new Tutor("Nathalia")),
                new Animal("Nina", false, new Tutor("Nathalia")),
                new Animal("Thor", true, new Tutor("Marco"))
        );
        assertEquals(2, Censo.contarAnimaisHospedadosNoHotel(hotel));
    }

    @Test
    void deveContarTotalAnimaisCadastradosHotel() {
        Hotel hotel = new Hotel(
                new Animal("Marie", true, new Tutor("Nathalia")),
                new Animal("Nina", true, new Tutor("Nathalia")),
                new Animal("Thor", false, new Tutor("Thor"))
        );
        assertEquals(3, Censo.contarTotalAnimaisCadastradosHotel(hotel));
    }

}
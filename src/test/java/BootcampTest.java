import dominio.Bootcamp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class BootcampTest {
    @Test
    void testarTempoCurso(){
        Bootcamp BootcampTest = new Bootcamp();

        int anoFinal = BootcampTest.getDataFinal().getYear();
        int mesFinal = BootcampTest.getDataFinal().getMonthValue();
        int diaFinal = BootcampTest.getDataFinal().getDayOfMonth();
        int anoInicial = BootcampTest.getDataInicial().getYear();
        int mesInicial = BootcampTest.getDataInicial().getMonthValue();
        int diaInicial = BootcampTest.getDataInicial().getDayOfMonth();
        int diferencaAno = (anoFinal - anoInicial)*365;
        int diferencaMes = (mesFinal - mesInicial)*30;
        int diferencaDia = (diaFinal - diaInicial);

        Assertions.assertEquals(45,(diferencaAno + diferencaMes + diferencaDia));
    }
}

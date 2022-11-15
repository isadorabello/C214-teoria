import org.example.app.impl.Observador;
import org.example.app.impl.Observavel;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TesteObserver {
    @Test
    public void testeInscritos(){
        Observavel countPalavras = new Observavel();
        Observador o1 = new Observador(1);
        countPalavras.registraObservador(o1);
        assertFalse(countPalavras.getObservadores().isEmpty());
    }

    @Test
    public void teste2Inscritos(){
        Observavel observavel = new Observavel();
        Observador o1 = new Observador(1);
        Observador o2 = new Observador(2);
        Observador o3 = new Observador(3);
        observavel.registraObservador(o1);
        observavel.registraObservador(o2);
        observavel.registraObservador(o3);
        observavel.removeObservador(o1);
        assertEquals(observavel.getObservadores().size(), 2);
    }

    @Test
    public void testQuantTotal() {
        Observavel palavras = new Observavel();
        Observador o1 = new Observador(1);
        palavras.registraObservador(o1);
        palavras.setNovaFrase("Há coisas que são preciosas por não durarem");
        assertEquals(palavras.getQuantTotal(), 8);
    }

    @Test
    public void testQuantPares() {
        Observavel palavras = new Observavel();
        Observador o1 = new Observador(1);
        palavras.registraObservador(o1);
        palavras.setNovaFrase("Há coisas que são preciosas por não durarem");
        assertEquals(palavras.getQuantPares(), 2);
    }

    @Test
    public void testQuantMaiusculas() {
        Observavel palavras = new Observavel();
        Observador o1 = new Observador(1);
        palavras.registraObservador(o1);
        palavras.setNovaFrase("Há coisas que são Preciosas por Não durarem");
        assertEquals(palavras.getQuantMaiusculas(), 3);
    }
}

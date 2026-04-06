import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.example.Expresion;

public class ExpresionTest 
{
    @Test
    public void controlCorchetesDeberiaFuncionarCorrectamente()
    {
        List<Character> lista_entrada = new ArrayList<Character>();  // Arrange

        lista_entrada.add('{');
        lista_entrada.add('}');
        
        Expresion prueba = new Expresion();

        boolean resultado = prueba.controlCorchetes(lista_entrada);  // Act

        Assert.assertTrue(resultado);  // Assert

    }
    
}

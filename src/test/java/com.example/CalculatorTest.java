package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testPerformOperation() {
        // Créez un mock pour l'interface Operation
        Operation mockOperation = Mockito.mock(Operation.class);

        // Configurer le comportement du mock
        when(mockOperation.execute(3, 2)).thenReturn(5);
        when(mockOperation.execute(7, 2)).thenReturn(9);
        // Utilisez le mock dans la classe Calculator
        Calculator calculator = new Calculator(mockOperation);

        // Exécutez la méthode performOperation et vérifiez le résultat
        int result = calculator.performOperation(7, 2);
        assertEquals(9, result);

        // Vérifiez si la méthode execute a été appelée avec les bons arguments
        Mockito.verify(mockOperation).execute(7, 2);
    }
}

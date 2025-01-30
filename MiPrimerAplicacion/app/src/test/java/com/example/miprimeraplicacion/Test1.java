package com.example.miprimeraplicacion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test1 {
    

    @Test
    public void Test1passwordConfirmationMatch() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.passwordConfirmationMatch("abcd1234","abcd1234")); //Contraseñas iguales
    }


    @Test
    public void Test2passwordConfirmationMatch() {
        TestMetodos validator = new TestMetodos();
        assertFalse(validator.passwordConfirmationMatch("qwer1567","abcd1234")); // Contraseñas distintas
    }


    @Test
    public void Test3passwordConfirmationMatch() {
        TestMetodos validator = new TestMetodos();
        assertFalse(validator.passwordConfirmationMatch("","abcd1234")); // Una contraseña vacia
    }
    



    @Test
    public void Test1isEmpty() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.isEmpty("133")); // Una contraseña vacia
    }


    @Test
    public void Test2isEmpty() {
        TestMetodos validator = new TestMetodos();
        assertFalse(validator.isEmpty("ar12")); // Una contraseña con caracteres
    }


    @Test
    public void Test3isEmpty() {
        TestMetodos validator = new TestMetodos();
        assertFalse(validator.isEmpty("ti*$")); // Una contraseña con caracteres especiales
    }


}

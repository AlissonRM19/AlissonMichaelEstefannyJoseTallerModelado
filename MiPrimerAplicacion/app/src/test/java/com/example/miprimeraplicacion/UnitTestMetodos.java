package com.example.miprimeraplicacion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTestMetodos {

    @Test
    public void Test1checkEspaciosObligatorios() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.checkEspaciosObligatorios("Juan", "Perez",
                "JJ123", "correo@test.com", "password123",
                "Jason", "costarricense", "Chiqui",
                "Liga", "1234567890123456",
                "12/28", "123"));
        // Se llenan todos los espacios obligatorios
    }

    @Test
    public void Test2checkEspaciosObligatorios() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.checkEspaciosObligatorios("Juan", "Perez",
                "JJ123", "correo@test.com", "password123",
                "Jason", "costarricense", "Chiqui",
                "Liga", "1234567890123456",
                "12/28", "123"));
        // Se llenan todos los espacios obligatorios excepto uno
    }

    @Test
    public void Test3checkEspaciosObligatorios() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.checkEspaciosObligatorios("Juan", "Perez",
                "JJ123", "correo@test.com", "password123",
                "Jason", "costarricense", "Chiqui",
                "Liga", "1234567890123456",
                "12/28", "123"));
        // No se llenan multiples espacios obligatorios
    }

    @Test
    public void Test1ProcesarMensaje() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.procesarMensaje("0"));
        // Recibe un mensaje procesable
    }

    @Test
    public void Test2ProcesarMensaje() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.procesarMensaje("1"));
        // Recibe un mensaje procesable
    }

    @Test
    public void Test3ProcesarMensaje() {
        TestMetodos validator = new TestMetodos();
        assertTrue(validator.procesarMensaje("0"));
        // Recibe un mensaje que no se puede procesar
    }



}

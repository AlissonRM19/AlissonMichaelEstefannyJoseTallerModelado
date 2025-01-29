package com.example.miprimeraplicacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRegistroCasaTest {

    @Test
    public void Test1ValidadorRegistroCasa_CamposCompletos_ValidacionExitosa() {
        TestRegistriCasa.Test1ValidadorRegistroCasa validador = new TestRegistriCasa().new Test1ValidadorRegistroCasa();
        boolean resultado = validador.validarCamposRegistro("Casa Bonita", "No fiestas", "15", "200", "latitud: 19.43, longitud: -99.13", "Casa de amigos");
        assertTrue(resultado);
    }

    @Test
    public void Test2ValidadorRegistroCasa_FaltaUbicacion_ValidacionFallida() {
        TestRegistriCasa.Test1ValidadorRegistroCasa validador = new TestRegistriCasa().new Test1ValidadorRegistroCasa();
        boolean resultado = validador.validarCamposRegistro("Casa Playa", "No perros", "2", "700", "latitud: 0.0, longitud: 0.0", "Casa de playa");
        assertFalse(resultado);
    }

    @Test
    public void Test3ValidadorRegistroCasa_DescripcionOpcional_ValidacionExitosa() {
        TestRegistriCasa.Test1ValidadorRegistroCasa validador = new TestRegistriCasa().new Test1ValidadorRegistroCasa();
        boolean resultado = validador.validarCamposRegistro("Lodge Pinto", "", "10", "200", "latitud: 19.43, longitud: -99.13", "");
        assertTrue(resultado);  // Descripción vacía no debería afectar
    }

    @Test
    public void Test1ProcesarMensajes_Mensaje10_AbrirRecuperacion() {
        TestRegistriCasa.Test1ProcesarMensajes procesador = new TestRegistriCasa().new Test1ProcesarMensajes();
        assertEquals("abrir_recuperacion", procesador.determinarAccionMensaje("10"));
    }

    @Test
    public void Test2ProcesarMensajes_Mensaje20_MostrarErrorAutenticacion() {
        TestRegistriCasa.Test1ProcesarMensajes procesador = new TestRegistriCasa().new Test1ProcesarMensajes();
        assertEquals("mostrar_error_autenticacion", procesador.determinarAccionMensaje("20"));
    }

    @Test
    public void Test3ProcesarMensajes_MensajeDesconocido_MostrarErrorFatal() {
        TestRegistriCasa.Test1ProcesarMensajes procesador = new TestRegistriCasa().new Test1ProcesarMensajes();
        assertEquals("mostrar_error_fatal", procesador.determinarAccionMensaje("999"));
    }
}

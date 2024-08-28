package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ErroTest {

    @Test
    public void testErroExcecao() {
        Erro erro = new Erro();

        // Verifica se o método ErroExcecao lança uma RuntimeException
        assertThrows(RuntimeException.class, erro::ErroExcecao);
    }

}

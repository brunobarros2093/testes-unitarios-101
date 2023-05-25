package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5), Money.dollar((5)));
        // os dois são money, logo, são iguais - alterando o equals()
        assertNotEquals(new Dollar(5), new Franc(5));
    }
    // capitulo 5 do TDD - Red book
    // essa parte foi adicionada como exemplo de 'duplicação de código'

    @Test
    void testMultiplicationFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10),  five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
    }

    // again: fail, make it work, refacto
    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }



}

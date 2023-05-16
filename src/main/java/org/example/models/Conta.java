package org.example.models;

import java.math.BigDecimal;

public class Conta {
    private String pessoa;
    private BigDecimal saldo;

    public Conta(String pessoa, BigDecimal saldo) {
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}

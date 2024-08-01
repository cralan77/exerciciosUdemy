package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void deposit(Double amount){
        balance+=amount;
    }
    public void withdraw(Double amount) throws DomainException{

        if(balance <=0){
            throw new DomainException("Não há saldo disponível");
        }
        if(amount > balance){
            throw new DomainException("Saldo insuficiente");
        }
        if(amount > withDrawLimit){
            throw new DomainException("Valor de saque maior que limite permitido");
        }
        balance-=amount;
    }
}
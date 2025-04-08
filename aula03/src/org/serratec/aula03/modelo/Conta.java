package org.serratec.aula03.modelo;

public class Conta {

    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    
    public Conta(String agencia, String conta, String titular, double saldo) {
    	this.agencia = agencia;
    	this.conta = conta;
    	this.titular = titular;
    	this.saldo = saldo;
    }
    
    public String getTitular() {
    	return titular;
    }
    
    public void setTitular(String titular) {
    	this.titular = titular;
    }
    
    public String getAgencia() {
    	return agencia;
    } 
     
    public String getConta() {
    	return conta;
    }

    public double getSaldo() {
    	return saldo;
    }

    public void exibirDados() {
        System.out.println("Agência: " + agencia);
        System.out.println("Conta:   " + conta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo:   " + saldo);
    }
    
    public void depositar (double valor) {
    	saldo += valor;
    	exibirSaldo();
    }
    
    public void sacar (double valor) {
    	if(valor <= saldo) {
    		saldo -= valor;
    		exibirSaldo();
    	} else {
    		System.out.println("Saldo insuficiente para esse saque. ");
    	}
    }
    
 	public void exibirSaldo () {
     	System.out.println("Conta: " + conta + " - Saldo atualizado: " + saldo);
    }

 	public void transferir (double valor, Conta conta) {
 		if (valor <= saldo) {
 			sacar(valor);
 			conta.depositar(valor);
 		} else {
 			System.out.println("Saldo insuficiente para fazer essa transferência.");
 		}
    }
}
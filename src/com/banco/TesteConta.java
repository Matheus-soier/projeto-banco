package com.banco;

public class TesteConta {

		public static void main(String[] args) {
			
			Conta contaCorrente = new Conta();
			Conta contaPoupanca = new Conta();
			Conta contaInvestimento = new Conta();
			
			contaCorrente.numero = 111;
			contaCorrente.saldo = 20.5;
			contaCorrente.cliente.nome = "Matheus Soier";
			contaCorrente.cliente.idade = 20;
			
			contaPoupanca.numero = 222;
			contaPoupanca.saldo = 30;
			contaPoupanca.cliente.nome = "João Pessoa";
			contaPoupanca.cliente.idade = 18;
			
			contaInvestimento.numero = 333;
			contaInvestimento.saldo = 34.2;
			contaInvestimento.cliente.nome = "Gustavo Sampaio";
			contaInvestimento.cliente.idade = 17;
		
			System.out.println(contaCorrente.numero);
			System.out.println(contaCorrente.cliente.nome);
		}
}

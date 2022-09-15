package com.desafiopoo.empregados;

public class Main {
	
	public static void main(String[] args) {
		
		Gerente gr1 = new Gerente("Severino Portões", 60, 50000.d);
        Supervisor s1 = new Supervisor("NicoleDickman", 30, 30000.0d);
        Vendedor vv = new Vendedor("Fernando Pessoa", 50, 10000.0d);

        gr1.setNome("Johnny Deep");
        gr1.setIdade(40);
        gr1.setSalario(40000.0d);

        vv.bonificacao();
        s1.bonificacao();

        System.out.println(gr1);
        System.out.println(vv);
        System.out.println(s1);
	}
	

}

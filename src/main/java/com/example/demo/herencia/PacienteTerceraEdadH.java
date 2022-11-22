package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH{
private String iess;

public Integer calcularDescuento() {
	System.out.println("sin descuento");
	return 0;
}
public String getIess() {
	return iess;
}

public void setIess(String iess) {
	this.iess = iess;
}

}

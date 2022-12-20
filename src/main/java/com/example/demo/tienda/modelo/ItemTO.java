package com.example.demo.tienda.modelo;

public class ItemTO {
	private String codigoBarra;
	private Integer cantidad;
	
	//Set y get
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "ItemTo [codigoBarra=" + codigoBarra + ", cantidad=" + cantidad + "]";
	}
	
	
}

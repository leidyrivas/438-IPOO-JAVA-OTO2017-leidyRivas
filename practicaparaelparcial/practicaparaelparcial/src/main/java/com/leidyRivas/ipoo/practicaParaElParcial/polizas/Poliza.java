package com.leidyRivas.ipoo.practicaParaElParcial.polizas;

import java.util.Date;

public class Poliza {
	
	private long id;
	private Date fechaHoraEmision;
	private Date fechaInicio;
	private Date fechaFin;
	private double capitalAsegurado;
	private double cuota;
	private Date fechaVencimientoCuota;
	
	
	public Poliza(){
		
	}
	
	
	public Poliza(long id, Date fechaHoraEmision, Date fechaInicio, Date fechaFin, double capitalAsegurado,
			double cuota, Date fechaVencimientoCuota) {
		super();
		this.id = id;
		this.fechaHoraEmision = fechaHoraEmision;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.capitalAsegurado = capitalAsegurado;
		this.cuota = cuota;
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getFechaHoraEmision() {
		return fechaHoraEmision;
	}


	public void setFechaHoraEmision(Date fechaHoraEmision) {
		this.fechaHoraEmision = fechaHoraEmision;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public double getCapitalAsegurado() {
		return capitalAsegurado;
	}


	public void setCapitalAsegurado(double capitalAsegurado) {
		this.capitalAsegurado = capitalAsegurado;
	}


	public double getCuota() {
		return cuota;
	}


	public void setCuota(double cuota) {
		this.cuota = cuota;
	}


	public Date getFechaVencimientoCuota() {
		return fechaVencimientoCuota;
	}


	public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}



	
	
	
	
	

}

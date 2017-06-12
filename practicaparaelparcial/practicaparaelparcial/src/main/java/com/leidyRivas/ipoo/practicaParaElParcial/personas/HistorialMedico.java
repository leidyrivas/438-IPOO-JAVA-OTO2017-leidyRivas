package com.leidyRivas.ipoo.practicaParaElParcial.personas;

import java.util.Date;

public class HistorialMedico {
	
	private long id;
	private Date fecha;
	private LocalDeSalud localDeSalud;
	private TipoDeEvento tipoDeEvento;
	private Medico medico;
	
	//constructor1 vacio
	public HistorialMedico(){
		
	}

	//constructor 2 
	public HistorialMedico(long id, Date fecha, LocalDeSalud localDeSalud, TipoDeEvento tipoDeEvento, Medico medico) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.localDeSalud = localDeSalud;
		this.tipoDeEvento = tipoDeEvento;
		this.medico = medico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public LocalDeSalud getLocalDeSalud() {
		return localDeSalud;
	}

	public void setLocalDeSalud(LocalDeSalud localDeSalud) {
		this.localDeSalud = localDeSalud;
	}

	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	

}

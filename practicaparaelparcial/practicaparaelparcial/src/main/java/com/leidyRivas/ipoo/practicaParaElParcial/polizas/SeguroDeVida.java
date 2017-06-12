package com.leidyRivas.ipoo.practicaParaElParcial.polizas;

import java.util.Date;

public class SeguroDeVida extends Poliza{
	
	
	
	public SeguroDeVida(){
		super();
	}
	
	
	public SeguroDeVida(long id, Date fechaHoraEmision, Date fechaInicio, Date fechaFin, double capitalAsegurado,
			double cuota, Date fechaVencimientoCuota) {
		super( id,  fechaHoraEmision, fechaInicio,  fechaFin,  capitalAsegurado,
				 cuota,  fechaVencimientoCuota);
	}
	
	
	
	

}

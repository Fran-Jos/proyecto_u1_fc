package com.example.demo.ejercicio1.service;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

 




 

 

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	  @Autowired
	    private IpropietarioService iPropietarioService;
	    @Autowired
	    private IVehiculoService iVehiculoService;
	    @Autowired
	    @Qualifier("liviano")
	    private IMatriculaNuevaService iMatriculaNuevaService;

	 

	    @Autowired
	    private IMatriculaService iMatriculaService;
 

    @Override
    public void matricula(String cedula, String placa) {
Vehiculo vehi = null;

         if(vehi.getTipo().equals("P")) {
              this.iMatriculaService.matricular("1241241241", "PSGD2312");

          }else {
              this.iMatriculaNuevaService.matricular("1241241241", "PSGD2312");
          }

    }

 

}
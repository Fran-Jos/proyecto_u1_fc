package com.example.demo.ejercicio1.service;

 

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;
import com.example.demo.ejercicio1.repository.*;
 




 

 

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
	    @Qualifier("pesado")
	    private IMatriculaNuevaService iMatriculaNuevaPesadoService;
	    @Autowired
      private IMatriculaRepository iMatriculaRepository;
	 
      @Autowired
      private IPropietarioRepository iPropietarioRepository;
	    //@Autowired
	    //private IMatriculaService iMatriculaService;
	    
	    @Autowired
		private IVehiculoRepository iVehiculoRepository;
 

    @Override
    public void matricula(String cedula, String placa) {
    	Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
          Matricula matricula = new Matricula();
          matricula.setFecha(LocalDateTime.now());
          
           Propietario  propietario = this.iPropietarioRepository.buscar(cedula);
         
           matricula.setPropietario(propietario);
           matricula.setVehiculo(vehiculo);
           BigDecimal valor = null;

         if(vehiculo.getTipo().equals("P")) {
              valor = this.iMatriculaNuevaPesadoService.matricular(vehiculo.getPrecio());
               System.out.println("su vehiculo es pesado");
          }else {
              valor = this.iMatriculaNuevaService.matricular( vehiculo.getPrecio());
              System.out.println("su vehiculo es liviano");
          }

         //programo descuesto
         
         if (valor.compareTo(new BigDecimal(2000)) > 1) {
 			BigDecimal descuento = valor.multiply(new BigDecimal(0.07));

 			valor = valor.subtract(descuento);
 		}
       matricula.setValor(valor);
         
         this.iMatriculaRepository.insertar(matricula);
        
         System.out.println(matricula);
         System.out.println("valor = " + matricula.getValor());
    }
    
    

 

}
package com.example.demo;

 

import java.math.BigDecimal;
import java.time.LocalDateTime;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.ejercicio1.service.IpropietarioService;

 

@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {

 

    @Autowired
    private IpropietarioService iPropietarioService;
    @Autowired
    private IVehiculoService iVehiculoService;
    @Autowired
    @Qualifier("liviano")
    private IMatriculaNuevaService iMatriculaNuevaServiceLiviano;

 

    @Autowired
    private IMatriculaService iMatriculaService;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoU1ScApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {

        /*
        Propietario propietario = new Propietario();
        propietario.setApellido("Anddy");
        propietario.setCedula("1721483814");
        propietario.setFechaNacimiento(LocalDateTime.of(2000, 7, 19, 12, 15));
        pr
        */


        Vehiculo vehi = new Vehiculo();
        vehi.setMarca("Tocyota");
        vehi.setPlaca("PSGD2312");
        vehi.setPrecio(new BigDecimal(20000));
        vehi.setTipo("P");
        this.iVehiculoService.crear(vehi);
        vehi.setPrecio(new BigDecimal(10000));
        vehi.setMarca("Toyota");
        this.iVehiculoService.modificar(vehi);
        Propietario propietario = new Propietario();
        propietario.setApellido("francisco");
        propietario.setCedula("1241241241");
        propietario.setFechaNaciemiento(LocalDateTime.of(1999, 12, 12, 12, 12));
        propietario.setNombre("Chanataxi");
        this.iPropietarioService.guardar(propietario);
      if(vehi.getTipo().equals("P")) {
          this.iMatriculaService.matricular("1241241241", "PSGD2312");

      }else {
          this.iMatriculaNuevaServiceLiviano.matricular("1241241241", "PSGD2312");
      }

        this.iMatriculaNuevaServiceLiviano.matricular("1241241241", "PSGD2312");
    }

 

}

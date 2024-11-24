package com.example.GestionAlimentos.Controller;

import com.example.GestionAlimentos.models.Alimento;
import com.example.GestionAlimentos.models.Carbohidratos;
import com.example.GestionAlimentos.models.FrutaVerdura;
import com.example.GestionAlimentos.models.Grasa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//controlador gestiona las peticiones por parte del usuario
@RestController

public class TiendaController {

    private List<Alimento> alimentos = new ArrayList();

    @GetMapping("/inicio")
    public String saludo() {


        return "Hola mundo";


    }


    @GetMapping("/listaAlimento")
    public List<Alimento> listaAlimento() {

        if (alimentos.isEmpty()) {
            FrutaVerdura espinaca = new FrutaVerdura();
            espinaca.setNombre("Espinaca");
            espinaca.setCalorias(12);
            espinaca.setOrigen("Italia");
            espinaca.setPrecioUnidad(1200);
            espinaca.setColor("Verde");
            espinaca.setEsOrganico(true);
            espinaca.setContenidoVitamina(25.0);
            espinaca.setNecesitaRefrigeracion(true);

            FrutaVerdura zanahoria = new FrutaVerdura();
            zanahoria.setNombre("zanahoria");
            zanahoria.setCalorias(21);
            zanahoria.setOrigen("Mexico");
            zanahoria.setPrecioUnidad(2200);
            zanahoria.setColor("naranja");
            zanahoria.setEsOrganico(true);
            zanahoria.setContenidoVitamina(22.0);
            zanahoria.setNecesitaRefrigeracion(false);


            Grasa almendra = new Grasa();
            almendra.setNombre("almendras");
            almendra.setCalorias(21);
            almendra.setOrigen("Mexico");
            almendra.setPrecioUnidad(2200);
            almendra.setPorcentajeGrasa(0.1);
            almendra.setEsSaludable(true);
            almendra.setContenidoOmega(22.0);


            Carbohidratos pasta = new Carbohidratos();
            pasta.setNombre("pasta");
            pasta.setCalorias(21);
            pasta.setOrigen("Mexico");
            pasta.setPrecioUnidad(2200);
            pasta.setEsIntegral(false);
            pasta.setContenidoFibra(6.5);
            pasta.setContenidoGluten(true);

            alimentos.add(espinaca);
            alimentos.add(zanahoria);
            alimentos.add(almendra);
            alimentos.add(pasta);
        }

        return alimentos;
    }
}

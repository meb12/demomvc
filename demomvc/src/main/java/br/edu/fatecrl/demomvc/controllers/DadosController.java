package br.edu.fatecrl.demomvc.controllers;

import br.edu.fatecrl.demomvc.models.Mercado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api/mercados")
public class DadosController {
    private static final List<Mercado> mercados = new ArrayList<Mercado>();

    public DadosController()
    {
        mercados.add(new Mercado("Refrigerante",8));
        mercados.add(new Mercado("Feijão",2));
        mercados.add(new Mercado("Arroz",1));
    }

    @GetMapping
    public List<Mercado> getMercados()
    {
        return mercados;
    }
}

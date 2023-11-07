package br.edu.fatecrl.demomvc.controllers;

import br.edu.fatecrl.demomvc.models.Mercado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mercado")
public class MercadoController {
    private static final List<Mercado> mercados = new ArrayList<Mercado>();

    public MercadoController()
    {
        mercados.add(new Mercado("Refrigerante",8));
        mercados.add(new Mercado("Feijão",2));
        mercados.add(new Mercado("Arroz",1));
    }
    @GetMapping
    public String getMercados(Model model)
    {
        model.addAttribute("mercados",mercados);
        return "mercados";
    }
}


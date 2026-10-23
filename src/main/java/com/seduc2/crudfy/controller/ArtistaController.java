package com.seduc2.crudfy.controller;


import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("Artista")
public class ArtistaController {

    @Autowired
    ArtistaService artistaService;

    @GetMapping
    public List<Artista> mostrarArtistas() {
        return artistaService.mostrarArtistas();
    }

}

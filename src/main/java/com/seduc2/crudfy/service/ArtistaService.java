package com.seduc2.crudfy.service;

import com.seduc2.crudfy.entity.Artista;
import com.seduc2.crudfy.entity.Musica;
import com.seduc2.crudfy.repository.ArtistaRepository;
import com.seduc2.crudfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService {

    @Autowired
    ArtistaRepository artistaRepository;

    public List<Artista> mostrarArtistas() {
        List<Artista> lista = new ArrayList<>();
        lista = artistaRepository.findAll();;
        return lista;
    }
}

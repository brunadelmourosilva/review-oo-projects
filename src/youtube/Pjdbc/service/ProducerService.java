package br.com.brunadelmouro.youtube.Pjdbc.service;

//CONTROLLER

import br.com.brunadelmouro.youtube.Pjdbc.dominio.Producer;
import br.com.brunadelmouro.youtube.Pjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer){
        //camada que divide as responsabilidades do sistema
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id){
        ProducerService.validId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer){
        ProducerService.validId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> finByName(String name){
        return ProducerRepository.findByName(name);
    }

    public static void validId(Integer id){
        if(id == null && id <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}

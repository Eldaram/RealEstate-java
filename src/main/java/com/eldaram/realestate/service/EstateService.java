package com.eldaram.realestate.service;

import com.eldaram.realestate.model.Estate;
import com.eldaram.realestate.repository.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {
    @Autowired
    private EstateRepository repository;

    public Estate save(Estate estate) { // ADD
        return repository.save(estate);
    }

    public Estate update(Estate estateUpdate) { // UPDATE
        Estate estate = repository.findById(estateUpdate.getId()).get();
        estate.setTitle(estateUpdate.getTitle());
        estate.setPrice(estateUpdate.getPrice());
        estate.setDescription(estateUpdate.getDescription());
        estate.setCity(estateUpdate.getCity());
        return estate;
    }

    public void delete(Integer id) { // DELETE
        repository.delete(repository.getReferenceById(id));
    }

    public List<Estate> findAll() { // SELECT
        return repository.findAll();
    }
}

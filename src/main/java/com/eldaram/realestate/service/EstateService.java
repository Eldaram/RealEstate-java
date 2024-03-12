package com.eldaram.realestate.service;

import com.eldaram.realestate.model.Estate;
import com.eldaram.realestate.repository.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {
    @Autowired
    private EstateRepository repository;

    public Estate save(Estate estate) { // ADD
        return repository.save(estate);
    }

    public Estate update(Estate estateUpdate) { // UPDATE
        return repository.save(estateUpdate);
    }

    public void delete(Integer id) { // DELETE
        repository.delete(repository.getReferenceById(id));
    }

    public List<Estate> findAll() { // SELECT
        return repository.findAll();
    }

    public Estate getId(Integer id) {
        Optional<Estate> estate = repository.findById(id);
        return estate.orElse(null);
    }
}

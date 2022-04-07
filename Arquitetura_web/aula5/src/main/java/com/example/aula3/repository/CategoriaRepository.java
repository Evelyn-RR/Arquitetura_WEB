package com.example.aula3.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.example.aula3.entity.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    List<Categoria> findByNomeLike(String nome);
}
package com.halan.univali.repository;

import com.halan.univali.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    @Query("SELECT v FROM Venda v JOIN FETCH v.imovel")
    List<Venda> findAllWithImovel();

    @Query("SELECT v FROM Venda v")
    List<Venda> findAllVendas();

}
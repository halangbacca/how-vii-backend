package com.halan.univali.controller;

import com.halan.univali.model.TipoImovel;
import com.halan.univali.model.Venda;
import com.halan.univali.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    public ResponseEntity<List<Venda>> findAll() {
        return ResponseEntity.ok(vendaService.findAll());
    }

    @GetMapping("/somaPagamentos")
    public ResponseEntity<Map<String, BigDecimal>> calcularSomaPagamentosPorImovel() {
        return ResponseEntity.ok(vendaService.calcularSomaPagamentosPorImovel());
    }

    @GetMapping("/vendasMes")
    public ResponseEntity<Map<YearMonth, Long>> calcularTotalVendasPorMes() {
        return ResponseEntity.ok(vendaService.calcularTotalVendasPorMes());
    }

    @GetMapping("/percentualTipoImovel")
    public ResponseEntity<Map<TipoImovel, BigDecimal>> calcularPercentualPorTipoImovel() {
        return ResponseEntity.ok(vendaService.calcularPercentualPorTipoImovel());
    }

}

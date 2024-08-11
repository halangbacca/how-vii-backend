package com.halan.univali.service;

import com.halan.univali.model.TipoImovel;
import com.halan.univali.model.Venda;
import com.halan.univali.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public List<Venda> findAll() {
        return vendaRepository.findAll();
    }

    public Map<String, BigDecimal> calcularSomaPagamentosPorImovel() {
        List<Venda> vendas = vendaRepository.findAllWithImovel();

        // Inicializando um mapa para armazenar a soma dos pagamentos por imóvel
        Map<String, BigDecimal> somaPagamentosPorImovel = new HashMap<>();

        // Iterando sobre cada venda
        vendas.forEach(venda -> {
            String codigoImovel = venda.getImovel().getCodigoImovel();
            BigDecimal valorPagamento = venda.getValorPagamento();

            // Atualizando a soma dos pagamentos para o imóvel
            somaPagamentosPorImovel.merge(codigoImovel, valorPagamento, BigDecimal::add);
        });

        return somaPagamentosPorImovel;
    }

    public Map<YearMonth, Long> calcularTotalVendasPorMes() {
        List<Venda> vendas = vendaRepository.findAllVendas();

        // Inicializando um mapa para armazenar o total de vendas por mês/ano
        Map<YearMonth, Long> totalVendasPorMes = new HashMap<>();

        // Iterando sobre cada venda
        vendas.forEach(venda -> {
            YearMonth mesAno = YearMonth.from(venda.getDataPagamento());

            // Atualizando a contagem de vendas para o mês/ano
            totalVendasPorMes.merge(mesAno, 1L, Long::sum);
        });

        return totalVendasPorMes;
    }

    public Map<TipoImovel, BigDecimal> calcularPercentualPorTipoImovel() {
        List<Venda> vendas = vendaRepository.findAllWithImovel();

        // Total de vendas
        long totalVendas = vendas.size();

        // Inicializando um mapa para contar as vendas por tipo de imóvel
        Map<TipoImovel, Long> vendasPorTipoImovel = new HashMap<>();

        // Contando as vendas por tipo de imóvel
        vendas.forEach(venda -> {
            TipoImovel tipoImovel = venda.getImovel().getTipoImovel();
            vendasPorTipoImovel.put(tipoImovel, vendasPorTipoImovel.getOrDefault(tipoImovel, 0L) + 1);
        });

        // Calculando o percentual de vendas para cada tipo de imóvel
        Map<TipoImovel, BigDecimal> percentualPorTipoImovel = new HashMap<>();
        vendasPorTipoImovel.forEach((tipoImovel, count) -> {
            BigDecimal percentual = BigDecimal.valueOf(count)
                    .multiply(BigDecimal.valueOf(100))
                    .divide(BigDecimal.valueOf(totalVendas), 2, BigDecimal.ROUND_HALF_UP);
            percentualPorTipoImovel.put(tipoImovel, percentual);
        });

        return percentualPorTipoImovel;
    }

}

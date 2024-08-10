package com.halan.univali;

import com.halan.univali.model.Imovel;
import com.halan.univali.model.TipoImovel;
import com.halan.univali.model.Venda;
import com.halan.univali.repository.ImovelRepository;
import com.halan.univali.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class UnivaliApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UnivaliApplication.class, args);
    }

    @Autowired
    private ImovelRepository imovelRepository;

    @Autowired
    private VendaRepository vendaRepository;

    @Override
    public void run(String... args) throws Exception {
        Imovel imovel1 = new Imovel("4356", "Apartamento 100 m2 em condomínio fechado", TipoImovel.Apartamento);
        Imovel imovel2 = new Imovel("4357", "Apartamento 200 m2 em Balneário Camboriú", TipoImovel.Apartamento);
        Imovel imovel3 = new Imovel("4358", "Loft 50 m2 em Florianópolis", TipoImovel.Loft);
        Imovel imovel4 = new Imovel("4359", "Loft 150 m2 em Itajaí", TipoImovel.Loft);
        Imovel imovel5 = new Imovel("4361", "Casa germinada 226 m2 em Tijucas", TipoImovel.Casa);
        Imovel imovel6 = new Imovel("4362", "Casa de alvenaria 300 m2 em condomínio fechado", TipoImovel.Casa);
        Imovel imovel7 = new Imovel("4363", "Sobrado 297 m2 em condomínio fechado", TipoImovel.Sobrado);
        Imovel imovel8 = new Imovel("4364", "Sobrado 150 m2 em condomínio fechado", TipoImovel.Sobrado);

        imovelRepository.save(imovel1);
        imovelRepository.save(imovel2);
        imovelRepository.save(imovel3);
        imovelRepository.save(imovel4);
        imovelRepository.save(imovel5);
        imovelRepository.save(imovel6);
        imovelRepository.save(imovel7);
        imovelRepository.save(imovel8);

        vendaRepository.save(new Venda(1L, LocalDate.of(2024, 1, 15), BigDecimal.valueOf(300000), imovel1));
        vendaRepository.save(new Venda(2L, LocalDate.of(2024, 2, 16), BigDecimal.valueOf(350000), imovel2));
        vendaRepository.save(new Venda(3L, LocalDate.of(2024, 3, 17), BigDecimal.valueOf(200000), imovel3));
        vendaRepository.save(new Venda(4L, LocalDate.of(2024, 4, 28), BigDecimal.valueOf(600000), imovel4));
        vendaRepository.save(new Venda(5L, LocalDate.of(2024, 5, 19), BigDecimal.valueOf(500000), imovel5));
        vendaRepository.save(new Venda(6L, LocalDate.of(2024, 6, 20), BigDecimal.valueOf(600000), imovel6));
        vendaRepository.save(new Venda(7L, LocalDate.of(2024, 7, 21), BigDecimal.valueOf(700000), imovel7));
        vendaRepository.save(new Venda(8L, LocalDate.of(2024, 8, 10), BigDecimal.valueOf(350000), imovel8));
        vendaRepository.save(new Venda(9L, LocalDate.of(2023, 1, 15), BigDecimal.valueOf(400000), imovel1));
        vendaRepository.save(new Venda(10L, LocalDate.of(2023, 2, 12), BigDecimal.valueOf(500000), imovel2));
        vendaRepository.save(new Venda(11L, LocalDate.of(2023, 3, 10), BigDecimal.valueOf(550000), imovel3));
        vendaRepository.save(new Venda(12L, LocalDate.of(2023, 4, 9), BigDecimal.valueOf(450000), imovel4));
        vendaRepository.save(new Venda(13L, LocalDate.of(2023, 5, 8), BigDecimal.valueOf(550000), imovel5));
        vendaRepository.save(new Venda(14L, LocalDate.of(2023, 6, 7), BigDecimal.valueOf(320000), imovel6));
        vendaRepository.save(new Venda(15L, LocalDate.of(2023, 7, 15), BigDecimal.valueOf(750000), imovel7));
        vendaRepository.save(new Venda(16L, LocalDate.of(2023, 8, 16), BigDecimal.valueOf(800000), imovel8));
        vendaRepository.save(new Venda(17L, LocalDate.of(2023, 9, 17), BigDecimal.valueOf(900000), imovel1));
        vendaRepository.save(new Venda(18L, LocalDate.of(2023, 10, 18), BigDecimal.valueOf(1000000), imovel2));
        vendaRepository.save(new Venda(19L, LocalDate.of(2023, 11, 19), BigDecimal.valueOf(450000), imovel3));
        vendaRepository.save(new Venda(20L, LocalDate.of(2023, 12, 20), BigDecimal.valueOf(300000), imovel4));
        vendaRepository.save(new Venda(21L, LocalDate.of(2024, 5, 16), BigDecimal.valueOf(600000), imovel5));
        vendaRepository.save(new Venda(22L, LocalDate.of(2024, 6, 3), BigDecimal.valueOf(700000), imovel6));
        vendaRepository.save(new Venda(23L, LocalDate.of(2024, 3, 4), BigDecimal.valueOf(800000), imovel7));
        vendaRepository.save(new Venda(24L, LocalDate.of(2024, 2, 18), BigDecimal.valueOf(900000), imovel8));
        vendaRepository.save(new Venda(25L, LocalDate.of(2024, 1, 14), BigDecimal.valueOf(250000), imovel1));
        vendaRepository.save(new Venda(26L, LocalDate.of(2024, 1, 30), BigDecimal.valueOf(300000), imovel2));
        vendaRepository.save(new Venda(27L, LocalDate.of(2024, 2, 20), BigDecimal.valueOf(400000), imovel3));
        vendaRepository.save(new Venda(28L, LocalDate.of(2024, 2, 19), BigDecimal.valueOf(450000), imovel4));
        vendaRepository.save(new Venda(29L, LocalDate.of(2024, 3, 15), BigDecimal.valueOf(550000), imovel5));
        vendaRepository.save(new Venda(30L, LocalDate.of(2024, 3, 16), BigDecimal.valueOf(650000), imovel6));
    }
}

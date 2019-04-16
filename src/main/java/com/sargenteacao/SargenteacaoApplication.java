package com.sargenteacao;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sargenteacao.domain.Militar;
import com.sargenteacao.domain.Missao;
import com.sargenteacao.domain.enumerado.PostGrad;
import com.sargenteacao.repositories.MilitarRepository;
import com.sargenteacao.repositories.MissaoRepository;

@SpringBootApplication
public class SargenteacaoApplication implements CommandLineRunner{
	
	@Autowired
	private MilitarRepository militarRepository;
	
	@Autowired
	private MissaoRepository missaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SargenteacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Missao missao01 = new Missao(null, "7 de Setembro", sdf.parse("07/09/2018"), sdf.parse("07/09/2018"));
		Missao missao02 = new Missao(null, "Aniversario da Bda", sdf.parse("16/12/2018"), sdf.parse("16/12/2018"));
		Missao missao03 = new Missao(null, "Op Acolhida", sdf.parse("29/04/2019"), sdf.parse("29/07/2019"));
		
		Militar militar01 = new Militar(null, 1, "João da Silva", "João", "0000000001", "00000000001", "João da Silva Pai", "Joana da Silva", sdf.parse("01/01/1974"), "rua 1, nr 1, cep 001", "13000000001", true, PostGrad.PRIMEIROTEN);
		Militar militar02 = new Militar(null, 2, "José da Silva", "José", "0000000002", "00000000002", "José da Silva Pai", "Josina da Silva", sdf.parse("02/01/1974"), "rua 2, nr 2, cep 002", "13000000002", true, PostGrad.TERCEIROSGT);
		Militar militar03 = new Militar(null, 3, "Pedro da Silva", "Pedro", "0000000003", "00000000003", "Pedro da Silva Pai", "Pamela da Silva", sdf.parse("03/01/1974"), "rua 3, nr 3, cep 003", "13000000003", true, PostGrad.TERCEIROSGT);
		Militar militar04 = new Militar(null, 4, "Paulo da Silva", "Paulo", "0000000004", "00000000004", "Paulo da Silva Pai", "Paula da Silva", sdf.parse("04/01/1974"), "rua 4, nr 4, cep 004", "13000000004", false, PostGrad.STEN);
		Militar militar05 = new Militar(null, 5, "Roberto da Silva", "Roberto", "0000000005", "00000000005", "Roberto da Silva Pai", "Roberta da Silva", sdf.parse("05/01/1974"), "rua 5, nr 5, cep 005", "13000000005", true, PostGrad.SD);
		Militar militar06 = new Militar(null, 6, "Renato da Silva", "Renato", "0000000006", "00000000006", "Renato da Silva Pai", "Renata da Silva", sdf.parse("06/01/1974"), "rua 6, nr 6, cep 006", "13000000006", true, PostGrad.SDEV);
		
		missao01.getMilitares().addAll(Arrays.asList(militar01));
		missao02.getMilitares().addAll(Arrays.asList(militar01, militar02));
		missao03.getMilitares().addAll(Arrays.asList(militar01, militar02, militar03));
		
		militar01.getMissoes().addAll(Arrays.asList(missao01, missao02, missao03));
		militar02.getMissoes().addAll(Arrays.asList(missao02, missao03));
		militar03.getMissoes().addAll(Arrays.asList(missao03));
		
		missaoRepository.saveAll(Arrays.asList(missao01, missao02, missao03));
		militarRepository.saveAll(Arrays.asList(militar01,militar02,militar03,militar04,militar05,militar06));
		
		
	}

}

package com.sargenteacao;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sargenteacao.domain.EscalaServico;
import com.sargenteacao.domain.Militar;
import com.sargenteacao.domain.Missao;
import com.sargenteacao.domain.enums.PostGrad;
import com.sargenteacao.domain.enums.PostoEscalado;
import com.sargenteacao.domain.enums.TipoFolga;
import com.sargenteacao.repositories.EscalaServicoRepository;
import com.sargenteacao.repositories.MilitarRepository;
import com.sargenteacao.repositories.MissaoRepository;

@SpringBootApplication
public class SargenteacaoApplication implements CommandLineRunner{
	
	@Autowired
	private MilitarRepository militarRepository;
	
	@Autowired
	private MissaoRepository missaoRepository;
	
	@Autowired
	private EscalaServicoRepository escalaServicoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SargenteacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					
		Militar militar01 = new Militar(null, 1, "João da Silva", "João", "0000000001", "00000000001", "João da Silva Pai", "Joana da Silva", sdf.parse("01/01/1974"), "rua 1, nr 1, cep 001", "13000000001", true, PostGrad.PRIMEIROTEN);
		Militar militar02 = new Militar(null, 2, "José da Silva", "José", "0000000002", "00000000002", "José da Silva Pai", "Josina da Silva", sdf.parse("02/01/1974"), "rua 2, nr 2, cep 002", "13000000002", true, PostGrad.TERCEIROSGT);
		Militar militar03 = new Militar(null, 3, "Pedro da Silva", "Pedro", "0000000003", "00000000003", "Pedro da Silva Pai", "Pamela da Silva", sdf.parse("03/01/1974"), "rua 3, nr 3, cep 003", "13000000003", true, PostGrad.TERCEIROSGT);
		Militar militar04 = new Militar(null, 4, "Paulo da Silva", "Paulo", "0000000004", "00000000004", "Paulo da Silva Pai", "Paula da Silva", sdf.parse("04/01/1974"), "rua 4, nr 4, cep 004", "13000000004", false, PostGrad.STEN);
		Militar militar05 = new Militar(null, 5, "Roberto da Silva", "Roberto", "0000000005", "00000000005", "Roberto da Silva Pai", "Roberta da Silva", sdf.parse("05/01/1974"), "rua 5, nr 5, cep 005", "13000000005", true, PostGrad.SD);
		Militar militar06 = new Militar(null, 6, "Renato da Silva", "Renato", "0000000006", "00000000006", "Renato da Silva Pai", "Renata da Silva", sdf.parse("06/01/1974"), "rua 6, nr 6, cep 006", "13000000006", true, PostGrad.SDEV);
		
		Missao missao1 = new Missao(null, "7 Setembro", sdf.parse("07/09/2018"), sdf.parse("07/09/2018"));
		Missao missao2 = new Missao(null, "Aniversario Bda", sdf.parse("16/12/2018"), sdf.parse("16/12/2018"));
		Missao missao3 = new Missao(null, "Op Acolhida", sdf.parse("29/04/2019"), sdf.parse("29/04/2019"));
		
		militar01.setMissoes(Arrays.asList(missao1, missao2, missao3));
		militar02.setMissoes(Arrays.asList(missao2, missao3));
		militar03.setMissoes(Arrays.asList(missao3));
		
		missao1.setMilitares(Arrays.asList(militar01));
		missao2.setMilitares(Arrays.asList(militar01, militar02));
		missao3.setMilitares(Arrays.asList(militar01, militar02, militar03));
		//Stream.of(militar01,militar02,militar03).collect(Collectors.toSet())
		
		EscalaServico escala01 = new EscalaServico(null, sdf.parse("01/05/2018"), PostoEscalado.OFDIA, TipoFolga.VERMELHA,militar01);
		EscalaServico escala02 = new EscalaServico(null, sdf.parse("01/05/2018"), PostoEscalado.SGTDIA, TipoFolga.VERMELHA, militar02);
		EscalaServico escala03 = new EscalaServico(null, sdf.parse("01/05/2018"), PostoEscalado.CMTGDA, TipoFolga.VERMELHA, militar03);
		EscalaServico escala04 = new EscalaServico(null, sdf.parse("05/05/2018"), PostoEscalado.OFDIA, TipoFolga.PRETA, militar01);
		
		militar01.setServicos(Arrays.asList(escala01, escala04));
		militar02.setServicos(Arrays.asList(escala02));
		militar03  .setServicos(Arrays.asList(escala03));
		
		militarRepository.saveAll(Arrays.asList(militar01,militar02,militar03,militar04,militar05,militar06));
		missaoRepository.saveAll(Arrays.asList(missao1,missao2, missao3));
		escalaServicoRepository.saveAll(Arrays.asList(escala01,escala02,escala03,escala04));
		
		
		
		
	}

}

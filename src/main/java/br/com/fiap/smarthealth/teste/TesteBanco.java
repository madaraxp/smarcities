package br.com.fiap.smarthealth.teste;

import java.time.LocalDate;

import br.com.fiap.smarthealth.dao.AgenteSaudeDAO;
import br.com.fiap.smarthealth.dao.EspecialidadeDAO;
import br.com.fiap.smarthealth.dao.FamiliaDAO;
import br.com.fiap.smarthealth.dao.MedicoDAO;
import br.com.fiap.smarthealth.dao.MembroDAO;
import br.com.fiap.smarthealth.dao.PostoSaudeDAO;
import br.com.fiap.smarthealth.dao.RegistroVacinaDAO;
import br.com.fiap.smarthealth.dao.SexoDAO;
import br.com.fiap.smarthealth.domain.AgenteSaude;
import br.com.fiap.smarthealth.domain.Especialidade;
import br.com.fiap.smarthealth.domain.Familia;
import br.com.fiap.smarthealth.domain.Medico;
import br.com.fiap.smarthealth.domain.Membro;
import br.com.fiap.smarthealth.domain.PostoSaude;
import br.com.fiap.smarthealth.domain.RegistroVacina;
import br.com.fiap.smarthealth.domain.Sexo;
import br.com.fiap.smarthealth.factory.DAOFactory;

public class TesteBanco {

	public static void main(String[] args) {
		
		//Agente
		
		AgenteSaudeDAO agentedao = DAOFactory.getAgenteSaudeDAO();
		AgenteSaude agente = new AgenteSaude("Kakashi da anbu", "41323241243", "SSP", "SP",
												"40028922", LocalDate.of(1950, 5, 10), "sei la");
		agentedao.Insert(agente);
				
		//Especialidade
		
		EspecialidadeDAO especdao = DAOFactory.getEspecialidadeDAO();
		Especialidade espec = new Especialidade("Hokage");
		especdao.Insert(espec);
		
		//Familia
		
		FamiliaDAO familiadao = DAOFactory.getFamiliaDAO();
		Familia familia = new Familia("Uzumaki", "seila", "09950175", "Konoha", "Gakure",
											"Pais do fogo", "40329321", "onepiece@oda.com");
		familiadao.Insert(familia);
		
		//Medico
		
		MedicoDAO medidao = DAOFactory.getMedicoDAO();
		Medico medico = new Medico("Joao", "45086023802", "SP", "SP", "12312312",
										"12312321", "SP", "40156456", LocalDate.of(1995, 4, 9));
		medidao.Insert(medico);
		
		//Membro
		
		MembroDAO membrodao = DAOFactory.getMembroDAO();
		Membro membro = new Membro("Boruto", "O pior ninja", "cancelado",
										"Hinat", "KN", "larapio", LocalDate.of(2019, 4, 10), 'S');
		membrodao.Insert(membro);
		
		//PostoSaude
		
		PostoSaudeDAO postodao = DAOFactory.getPostoSaudeDAO();
		PostoSaude posto = new PostoSaude("Tsunade", "sei la", "09955080", "Rua dos uchihas", "tudo morto",
												"Vila da folha", "03213123", "jiraya@foidebase.com", "12");
		postodao.Insert(posto);
		
		//RegistroVacina
		
		RegistroVacinaDAO registrodao = DAOFactory.getRegistroVacinaDAO();
		RegistroVacina registro = new RegistroVacina("Corongavac", LocalDate.of(2021, 8, 10), LocalDate.of(2022, 2, 10));
		registrodao.Insert(registro);
		
		//Sexo
		
		SexoDAO sexodao = DAOFactory.getSexoDAO();
		Sexo sexo = new Sexo("Sou uma beyblade");
		sexodao.Insert(sexo);
	}
}


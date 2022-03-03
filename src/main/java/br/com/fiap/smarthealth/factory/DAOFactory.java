package br.com.fiap.smarthealth.factory;

import br.com.fiap.smarthealth.dao.AgenteSaudeDAO;
import br.com.fiap.smarthealth.dao.EspecialidadeDAO;
import br.com.fiap.smarthealth.dao.FamiliaDAO;
import br.com.fiap.smarthealth.dao.MedicoDAO;
import br.com.fiap.smarthealth.dao.MembroDAO;
import br.com.fiap.smarthealth.dao.PostoSaudeDAO;
import br.com.fiap.smarthealth.dao.RegistroVacinaDAO;
import br.com.fiap.smarthealth.dao.SexoDAO;

public abstract class DAOFactory {
	
	public static AgenteSaudeDAO getAgenteSaudeDAO() {
		
		return new AgenteSaudeDAO();
	}
	
	public static EspecialidadeDAO getEspecialidadeDAO() {
		
		return new EspecialidadeDAO();
	}
	
	public static FamiliaDAO getFamiliaDAO() {
		
		return new FamiliaDAO();
	}
	
	public static MedicoDAO getMedicoDAO() {
		
		return new MedicoDAO();
	}
	
	public static MembroDAO getMembroDAO() {
		
		return new MembroDAO();
	}
	
	public static PostoSaudeDAO getPostoSaudeDAO() {
		
		return new PostoSaudeDAO();
	}
	
	public static RegistroVacinaDAO getRegistroVacinaDAO() {
		
		return new RegistroVacinaDAO();
	}
	
	public static SexoDAO getSexoDAO() {
		
		return new SexoDAO();
		
	}
	
}

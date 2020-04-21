public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consulta consulta1 = new Consulta();
		Paciente paciente1 = new Paciente();
		Medico medico1 = new Medico();
		Funcionario funcionario1 = new Funcionario();
		Receita receita1 = new Receita();
		
		consulta1.setCod(1);
		consulta1.setData("10/08/2020");
		consulta1.setHora("14:30");
		
		paciente1.setId(1);
		paciente1.setNome("João Pinheiro");
		paciente1.setCpf("123.456.789-0");
		paciente1.setSexo("Masculino");
		paciente1.setIdade("1 e 6 meses");
		paciente1.setStatus("URGENTE - Crise de Refluxo");
		paciente1.setEndereco("Rua x, nº 2020");
		
		medico1.setId(1);
		medico1.setNome("Dr. Paulo Santana");
		medico1.setCrm(12345);
		medico1.setEspecialidade("Pediatria");
		
		funcionario1.setId(1);
		funcionario1.setNome("Maria Luzia Sá");
		funcionario1.setCargo("Recepcionista");
		funcionario1.setLogin("maria.sa@hospital.com.edu");
		funcionario1.setSenha("*********");
		
		receita1.setId(1);
		receita1.setTratamento("Via oral");
		receita1.setMedicacao("Domperidona");
		receita1.setExame("Raio-x do Pulmão");
		receita1.setPrescricao("Tomar 5 gotas de 8/8h");
		
		
		
		System.out.println("------------------------------------------");	
		System.out.println("           HOSPITAL UNIFAMETRO            ");		
		System.out.println("         [ACESSO DO FUNCIONÁRIO]          ");
		System.out.println("------------------------------------------");	
		System.out.println("        INFORME LOGIN E SENHA"             );
		System.out.println("------------------------------------------");	
		System.out.println("LOGIN: " +funcionario1.getLogin());
		System.out.println("SENHA: " +funcionario1.getSenha());
		System.out.println("------------------------------------------");
		System.out.println("          SEJA BEM VINDO (A)              ");
		System.out.println("------------------------------------------");
		System.out.println("FUNCIONÁRIO: " + funcionario1.getNome());
		System.out.println("ID: " + funcionario1.getId());
		System.out.println("CARGO: " + funcionario1.getCargo());
		System.out.println("------------------------------------------");
		System.out.println("        [INFORMAÇÕES DA CONSULTA]         ");
		System.out.println("------------------------------------------");
		System.out.println("CODIGO: " + consulta1.getCod());
		System.out.println("DATA: " +consulta1.getData());
		System.out.println("HORÁRIO: " +consulta1.getHora());
		System.out.println("------------------------------------------");
		System.out.println("        [INFORMAÇÕES DO PACIENTE]         ");
		System.out.println("------------------------------------------");
		System.out.println("ID: " + paciente1.getId());
		System.out.println("NOME: " + paciente1.getNome());
		System.out.println("ENDEREÇO: " + paciente1.getEndereco());
		System.out.println("CPF: " + paciente1.getCpf());
		System.out.println("SEXO: " + paciente1.getSexo());
		System.out.println("IDADE: " + paciente1.getIdade());
		System.out.println("STATUS: " + paciente1.getStatus());
		System.out.println("------------------------------------------");
		System.out.println("        [INFORMAÇÕES DO MEDICO]           ");
		System.out.println("------------------------------------------");
		System.out.println("ID: " + medico1.getId());
		System.out.println("MÉDICO RESPONSÁVEL: " + medico1.getNome());
		System.out.println("CRM: " + medico1.getCrm());
		System.out.println("ESPECIALIDADE: " + medico1.getEspecialidade());
		
		System.out.println("------------------------------------------");
		System.out.println("        [       RECEITA       ]          ");
		System.out.println("------------------------------------------");
		System.out.println("ID: " + receita1.getId());
		System.out.println("TRATAMENTO: " + receita1.getTratamento());
		System.out.println("MEDICAÇÃO: " + receita1.getMedicacao());
		System.out.println("PRESCRIÇÃO MÉDICA: " + receita1.getPrescricao());
		System.out.println("EXAME: " + receita1.getExame());
		System.out.println("------------------------------------------");		
		System.out.println("      [Cadastro realizado com sucesso]");
		System.out.println("    VOLTE SEMPRE AO HOSPITAL UNIFAMETRO");
		System.out.println("------------------------------------------");
		

	}
}

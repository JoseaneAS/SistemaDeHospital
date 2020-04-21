public class Medico extends Funcionario {
	private int crm;
	private String especialidade;
	
	public Medico()
	{
		super();
	}
	
	public int getCrm() 
	{
		return crm;
	}
	public void setCrm(int crm)
	{
		this.crm = crm;
	}
	
	public String getEspecialidade()
	{
		return especialidade;
	}
	public void setEspecialidade(String especialidade)
	{
		this.especialidade = especialidade;
	}
}

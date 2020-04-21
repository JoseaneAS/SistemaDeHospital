public class Receita extends Paciente{
	private String medicacao;
	private String tratamento;
	private String exame;
	private String prescricao;
	
	public Receita()
	{
		super();
	}
	
	public String getMedicacao()
	{
		return medicacao;
	}
	public void setMedicacao(String medicacao)
	{
		this.medicacao = medicacao;
	}
	
	public String getTratamento()
	{
		return tratamento;
	}
	public void setTratamento(String tratamento)
	{
		this.tratamento = tratamento;
	}
		
	public String getExame()
	{
		return exame;
	}
	public void setExame(String exame)
	{
		this.exame = exame;
	}
	
	public String getPrescricao()
	{
		return prescricao;
	}
	public void setPrescricao(String prescricao)
	{
		this.prescricao = prescricao;
	}
}

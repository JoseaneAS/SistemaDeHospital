public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;
	private int numCarTrabalho;
	
	public Funcionario()
	{
		super();
	}
	
	public String getCargo()
	{
		return cargo;
	}
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	public int getNumCarTrabalho()
	{
		return numCarTrabalho;
	}
	public void setNumCarTrabalho(int numCarTrabalho)
	{
		this.numCarTrabalho = numCarTrabalho;
	}
}

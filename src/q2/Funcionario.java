package q2;

import java.time.LocalDate;
public class Funcionario {
    private String nome;
    private int cpf;
    private int rg;
    private float salario;
    private LocalDate dataContrat;
    private int matricula;
    private float salarioBase;
    private float horasTrab;
    private static int geraMatricula = 0;


    public Funcionario(String nome, int cpf, int rg, int matricula, float salarioBase, float horasTrab) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.horasTrab = horasTrab;
        this.dataContrat = LocalDate.now();
        this.matricula = ++geraMatricula;
        calculaSalario();
    }

    public void calculaSalario(){
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase,horasTrab);
        this.salario = calculo.getTotalSalario();
    }

    public void imprimeDados(){
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: "+ this.getCpf());
        System.out.println("RG: "+ this.getRg());
        System.out.println("Data de contratação: "+ this.getDataContrat());
        System.out.println("Salário: "+ this.getSalario());
        System.out.println("Matrícula: "+ this.getMatricula());
        System.out.println("Horas Tabalhadas: "+ this.getHorasTrab());

    }
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public float getSalario() {
        return salario;
    }

    public LocalDate getDataContrat() {
        return dataContrat;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

}


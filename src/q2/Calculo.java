package q2;

public class Calculo {
    private float totalSalario;

    public void calculaSalario(float salarioBase, float horasTrab){
        totalSalario = salarioBase * horasTrab;
    }

    public float getTotalSalario() {
        return totalSalario;
    }
}

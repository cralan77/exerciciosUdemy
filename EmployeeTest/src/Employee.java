public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Employee(String nome, String sobrenome, double salarioMensal){
        this.nome=nome;
        this.sobrenome = sobrenome;

        if(salarioMensal>0){
            this.salarioMensal = salarioMensal;
        }else{
            this.salarioMensal=0;
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal>0){
            this.salarioMensal = salarioMensal;
        }else{
            this.salarioMensal=0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}

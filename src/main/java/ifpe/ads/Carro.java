package ifpe.ads;

public class Carro {
    private double combustivel;
    private double eficiencia;

    public Carro(double combustivel, double eficiencia) {
        this.combustivel = combustivel;
        this.eficiencia = eficiencia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public void abastecer(double litros) {
        this.combustivel = combustivel + litros;
    }

    public String andar(double kilometros) {
        String resposta = null;
        double reduzir = kilometros / this.eficiencia;

        if (reduzir > this.combustivel) {
            resposta = "Combustível insuficiente, favor abastecer.";
        }
        else {
            resposta = "Andou " + kilometros + " kilometros";
            this.combustivel = this.combustivel - reduzir;
        }
        return resposta;
    }
}

package entidades;

public class Elemento {

    String modelo;
    String materiaPrima;
    int tamanho;


    public Elemento(String modelo, String materiaPrima, int tamanho) {
        this.modelo = modelo;
        this.materiaPrima = materiaPrima;
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMateriaPrima() {
        return materiaPrima;
    }
    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
}

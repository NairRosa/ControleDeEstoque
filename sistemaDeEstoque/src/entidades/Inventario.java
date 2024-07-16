package entidades;

public class Inventario {
    
    String modelo;
    int tamanho; 
    String materiaPrima;
    int quantidade;

    
    public Inventario(String modelo, int tamanho, String materiaPrima, int quantidade) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.materiaPrima = materiaPrima;
        this.quantidade = quantidade;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public String getMateriaPrima() {
        return materiaPrima;
    }


    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    
}

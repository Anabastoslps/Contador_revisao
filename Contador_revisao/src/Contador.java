public class Contador {
    private int contador;

    public Contador(int contador) {
        this.contador = contador;
    }

    public void zerarContador() {
        this.contador = 0;
    }

    public void incrementarContador() {
        this.contador++;
    }

    public void mostrarContador() {
        System.out.println("Valor atual do Contador é : " + getReturn());
    }

    public int getReturn() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}

public class Retangulo {
    private float lado;
    private float altura;

    public Retangulo() {
        lado = 0.0f;
        altura = 0.0f;
    }

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area() {
        return lado * altura;
    }

    public float perimetro() {
        return lado + lado + altura + altura;
    }
}

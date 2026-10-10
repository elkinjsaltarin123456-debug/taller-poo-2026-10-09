public class mascota {

    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public mascota(String nombre, String especie, double peso,  int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }
    public void setPeso(double peso) {
        if (peso <=0) {
            System.out.println("error: el peso debe ser mayor que 0.");
        }else{
            this.peso = peso;
        }
    }
    public int valorConsulta(){
        int valor;

        if (peso>25) {
            valor = 55000;
        }else if(peso>10) {
            valor = 45000;
        }else {
            valor = 35000;
        }
        if (edad>=8) {
            valor += 12000;
        }
        return valor;
        }
        public String descripcion(){
        return nombre +","+ especie + "," +peso +"kilos," + edad +"anos,";
    }
}

package mx.unam.aragon.dp;

public class Persona {
    private String nommbre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nommbre, String apPaterno, String apMaterno, int edad, String curp) {
        this.nommbre = nommbre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nommbre=" + nommbre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", edad=" + edad + ", curp=" + curp + '}';
    }
    
    
    
}

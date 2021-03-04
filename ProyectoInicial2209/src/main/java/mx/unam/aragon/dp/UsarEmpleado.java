package mx.unam.aragon.dp;

public class UsarEmpleado {
    public static void main(String[] args) {
        
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Edgar");
        emp1.setApPaterno("Robert");
        emp1.setApMaterno("Moreno");
        emp1.setEdad(18);
        emp1.setCurp("ROME05022002");
        
        System.out.println( "info:" + emp1);
    }
}

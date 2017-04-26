package Maquila;
class ProgramadorJAVA extends Empleados{
    private double dblSueldoJava;
    public ProgramadorJAVA(int intId, String strNombres, double dblSalario, String strLenguaje) {
        super(intId, strNombres, dblSalario, strLenguaje);
    }

    public double salarioJava(){
        dblSueldoJava = super.getDblSalario() + (super.getDblSalario() * 0.20);
        return dblSueldoJava;
    }

    @Override
    public String toString() {
        return super.toString() + "Sueldo Java: " + salarioJava() + '\n';
    }
    
    
    
}

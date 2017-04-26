package Maquila;

import java.util.ArrayList;

public class Registro {
    ArrayList<Empleados> listEmpleados = new ArrayList<Empleados>();
    ArrayList<Lider> listLider = new ArrayList<Lider>();
    ArrayList<ProgramadorJAVA> listPro = new ArrayList<ProgramadorJAVA>();
    
    public void agregarEmpleado(Empleados obje){
        listEmpleados.add(obje);
    }
    
    public void mostraEmpleado(){
        for(Empleados arrEmpleados: listEmpleados){
            System.out.println(arrEmpleados);
        }
    }
    public void agregarLider(Lider objl){
        listLider.add(objl);
    }
    
    public void mostraLider(){
        for(Lider arrLider: listLider){
            System.out.println(arrLider);
        }
    }
    
    public void agregarProJava(ProgramadorJAVA objp){
        listPro.add(objp);
    }
    
    public void mostraProJava(){
        for(ProgramadorJAVA arrPro: listPro){
            System.out.println(arrPro);
        }
    }
}

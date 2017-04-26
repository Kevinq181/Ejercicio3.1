package Maquila;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intSeleccion;
        int intSecLen;
        int c = 1;
        int i = 1105047573;
        int a = 0;
        String strNombreLider;
        double dblSalarioLider;
        int intOpLenguajes;
        int intSelSeguir;
        String strNombrePro;
        int intIntegrantes;
        double dblSalarioPro;
        boolean estado = true;
        boolean seguir = true;
        Lider objLider = null;
        ProgramadorJAVA objProgramadorJAVA;
        Empleados objEmpleados;
        Registro objRegistro = new Registro();
        System.out.println("Ingrese cuantos integrantes va a tener su equipo.");
        intIntegrantes = entrada.nextInt();
        System.out.println("--- REGISTRO DEL LIDER DE EQUIPO ---");
        System.out.println("Ingrese Nombres del lider: ");
        entrada.nextLine();
        strNombreLider = entrada.nextLine();
        System.out.println("Salario del lider: ");
        dblSalarioLider = entrada.nextDouble();
        System.out.println("Lenguajes Dominantes: ");
        System.out.println("1. JAVA");
        System.out.println("2. C++");
        System.out.println("3. C#");
        System.out.println("4. Phyton");
        System.out.println("5. Visual Basic");
        System.out.println("Seleccione: ");
        intSecLen = entrada.nextInt();
        switch (intSecLen) {
            case 1:
                objLider = new Lider(i, strNombreLider, dblSalarioLider, "JAVA", intIntegrantes);
                objRegistro.agregarLider(objLider);
                try {
                    File f = new File("Empleados.csv");
                    FileWriter fw;
                    BufferedWriter bw;
                    if (f.exists()) {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);
                        bw.newLine();
                        bw.write(objLider.toString());

                    } else {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);

                        bw.newLine();
                        bw.write(objLider.toString());
                    }
                    bw.close(); // cierra el archivo 
                    fw.close(); // cierra el archivo    
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 2:
                objLider = new Lider(i, strNombreLider, dblSalarioLider, "C++", intIntegrantes);
                objRegistro.agregarLider(objLider);
                try {
                    File f = new File("Empleados.csv");
                    FileWriter fw;
                    BufferedWriter bw;
                    if (f.exists()) {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);
                        bw.newLine();
                        bw.write(objLider.toString());

                    } else {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);

                        bw.newLine();
                        bw.write(objLider.toString());
                    }
                    bw.close(); // cierra el archivo 
                    fw.close(); // cierra el archivo    
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 3:
                objLider = new Lider(i, strNombreLider, dblSalarioLider, "C#", intIntegrantes);
                objRegistro.agregarLider(objLider);
                try {
                    File f = new File("Empleados.csv");
                    FileWriter fw;
                    BufferedWriter bw;
                    if (f.exists()) {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);
                        bw.newLine();
                        bw.write(objLider.toString());

                    } else {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);

                        bw.newLine();
                        bw.write(objLider.toString());
                    }
                    bw.close(); // cierra el archivo 
                    fw.close(); // cierra el archivo    
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 4:
                objLider = new Lider(i, strNombreLider, dblSalarioLider, "Phyton", intIntegrantes);
                objRegistro.agregarLider(objLider);
                try {
                    File f = new File("Empleados.csv");
                    FileWriter fw;
                    BufferedWriter bw;
                    if (f.exists()) {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);
                        bw.newLine();
                        bw.write(objLider.toString());

                    } else {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);

                        bw.newLine();
                        bw.write(objLider.toString());
                    }
                    bw.close(); // cierra el archivo 
                    fw.close(); // cierra el archivo    
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 5:
                objLider = new Lider(i, strNombreLider, dblSalarioLider, "Visual Basic", intIntegrantes);
                objRegistro.agregarLider(objLider);
                try {
                    File f = new File("Empleados.csv");
                    FileWriter fw;
                    BufferedWriter bw;
                    if (f.exists()) {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);
                        bw.newLine();
                        bw.write(objLider.toString());

                    } else {
                        fw = new FileWriter(f, true);
                        bw = new BufferedWriter(fw);

                        bw.newLine();
                        bw.write(objLider.toString());
                    }
                    bw.close(); // cierra el archivo 
                    fw.close(); // cierra el archivo    
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
        }

        for (int j = 0; j < intIntegrantes; j++) {
            System.out.println("---- REGISTRO DE PROGRAMADORES ---");
            System.out.println("Ingrese el nombre del programador: ");
            entrada.nextLine();
            strNombrePro = entrada.nextLine();
            System.out.println("Ingrese el Salario del programador: ");
            dblSalarioPro = entrada.nextDouble();
            System.out.println("Lenguajes Dominantes: ");
            System.out.println("1. JAVA");
            System.out.println("2. C++");
            System.out.println("3. C#");
            System.out.println("4. Phyton");
            System.out.println("5. Visual Basic");
            System.out.println("Seleccione: ");
            intSecLen = entrada.nextInt();
            switch (intSecLen) {
                case 1:
                    objProgramadorJAVA = new ProgramadorJAVA(c, strNombrePro, dblSalarioPro, "JAVA");
                    objRegistro.agregarEmpleado(objProgramadorJAVA);
                    try {
                        File f = new File("Empleados.csv");
                        FileWriter fw;
                        BufferedWriter bw;
                        if (f.exists()) {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(objProgramadorJAVA.toString());

                        } else {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);

                            bw.newLine();
                            bw.write(objProgramadorJAVA.toString());
                        }
                        bw.close(); // cierra el archivo 
                        fw.close(); // cierra el archivo    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    objEmpleados = new Empleados(c, strNombrePro, dblSalarioPro, "C++");
                    objRegistro.agregarEmpleado(objEmpleados);
                    try {
                        File f = new File("Empleados.csv");
                        FileWriter fw;
                        BufferedWriter bw;
                        if (f.exists()) {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(objEmpleados.toString());

                        } else {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);

                            bw.newLine();
                            bw.write(objEmpleados.toString());
                        }
                        bw.close(); // cierra el archivo 
                        fw.close(); // cierra el archivo    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    objEmpleados = new Empleados(c, strNombrePro, dblSalarioPro, "C#");
                    objRegistro.agregarEmpleado(objEmpleados);
                    try {
                        File f = new File("Empleados.csv");
                        FileWriter fw;
                        BufferedWriter bw;
                        if (f.exists()) {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(objEmpleados.toString());

                        } else {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);

                            bw.newLine();
                            bw.write(objEmpleados.toString());
                        }
                        bw.close(); // cierra el archivo 
                        fw.close(); // cierra el archivo    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    objEmpleados = new Empleados(c, strNombrePro, dblSalarioPro, "Phyton");
                    objRegistro.agregarEmpleado(objEmpleados);
                    try {
                        File f = new File("Empleados.csv");
                        FileWriter fw;
                        BufferedWriter bw;
                        if (f.exists()) {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(objEmpleados.toString());

                        } else {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);

                            bw.newLine();
                            bw.write(objEmpleados.toString());
                        }
                        bw.close(); // cierra el archivo 
                        fw.close(); // cierra el archivo    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    objEmpleados = new Empleados(c, strNombrePro, dblSalarioPro, "Visual Basic");
                    objRegistro.agregarEmpleado(objEmpleados);
                    try {
                        File f = new File("Empleados.csv");
                        FileWriter fw;
                        BufferedWriter bw;
                        if (f.exists()) {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(objEmpleados.toString());

                        } else {
                            fw = new FileWriter(f, true);
                            bw = new BufferedWriter(fw);

                            bw.newLine();
                            bw.write(objEmpleados.toString());
                        }
                        bw.close(); // cierra el archivo 
                        fw.close(); // cierra el archivo    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }

        }
        while (estado) {
            System.out.println("---- OPCIONES ----");
            System.out.println("1. Mostrar Empleados");
            System.out.println("2. Mostrar Equipo");
            System.out.println("3. Salir");
            System.out.println("Seleccione: ");
            intSeleccion = entrada.nextInt();
            switch (intSeleccion) {
                case 1:
                    objRegistro.mostraLider();
                    objRegistro.mostraEmpleado();
                    objRegistro.mostraProJava();
                    System.out.println("Desea realizar otra consulta");
                    System.out.println("1. SI\n2. NO");
                    System.out.println("Seleccione: ");
                    intSelSeguir = entrada.nextInt();
                    if (intSelSeguir != 1) {
                        estado = false;
                    }
                    break;
                case 2:
                    System.out.println("----- EQUIPO -----");
                    System.out.println("Integrantes: " + intIntegrantes);
                    System.out.println("ENCARGADO DEL EQUIPO");
                    objRegistro.mostraLider();
                    System.out.println("INTEGRANTES DEL EQUIPO");
                    objRegistro.mostraEmpleado();
                    objRegistro.mostraProJava();
                    System.out.println("Desea realizar otra consulta");
                    System.out.println("1. SI\n2. NO");
                    System.out.println("Seleccione: ");
                    intSelSeguir = entrada.nextInt();
                    if (intSelSeguir != 1) {
                        estado = false;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }

    }

}

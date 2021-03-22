/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapractica1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
class MenuCrearDispo {
    ArrayList<Computadora> listacomputadoraBuscado = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    
     protected String  nombre;
    protected int datos;
    protected String correo;
    protected String visibilidad;
    protected String encendido = "si";
    int fila;
    
    public void submenuDispoACrear(){
         int opcion = 0;
        do {        
            
            Control_Dispositivo.Lectura_ArchivoPlano();       
            System.out.println("-------DISPOSITIVO A CREAR------\n");
            System.out.println("1. COMPUTADORA");
            System.out.println("2. TABLET");
            System.out.println("3. SMARTWATCH");
            System.out.println("4. SMARTPHONE");
            System.out.println("5. AURICULARES INALAMBRICOS");
            System.out.println("6. Listar dispositivos");
            System.out.println("7. Regresar -> MENU PRINCIPAL");
            System.out.print("Ingrese opcion:");
            opcion = entrada.nextInt();

        } while (opcion < 1 || opcion > 7);
        Opciones_submenuDispoACrear(opcion);
    }

    private void Opciones_submenuDispoACrear(int opcion) {
         listacomputadoraBuscado.clear();
    
        switch (opcion) {
            case 1:
                crearComputadora();
                break;

            case 2:
                creartablet();
                break;
                
            case 3:
                crearsmartwatch();
                break;
                
            case 4: 
                 crearsmartphone();
                break;
            case 5:
                 crearauricularesinal();
                 break;
            case 6:
                listardispositivos();
                submenuDispoACrear();
                break;
            case 7:
                Menuprincipal.mostrarMenuprincipal();
                break;
        }
    }

    private void crearComputadora() {
        
        System.out.println("\nCREAR COMPUTADORA");

    
           

        System.out.print("Ingrese nombre de la computadora: ");
        nombre = entrada.next();
        entrada.nextLine();

        System.out.print("ingrese correo del dispositivo: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        //System.out.print("encendido por defecto: " + encendido);
        //encendido= "si";

        

        Computadora objcomputadoras = new Computadora();
        objcomputadoras.setNombre(nombre);
        objcomputadoras.setCorreo(correo);
        objcomputadoras.setVisibilidad(visibilidad);
        objcomputadoras.setEncendido(encendido);
      

        Control_Dispositivo.validar_nombre();
        
        System.out.print("\nSe agrego con exito!!\n");   
        listardispositivos();
        submenuDispoACrear();
    
      //  }     
        }
    private void creartablet() {
       // do {
         System.out.println("\n--------------CREAR TABLET-----------");

        System.out.print("Ingrese nombre de la tablet: ");
        nombre = entrada.next();
        entrada.nextLine();

        System.out.print("ingrese correo de la tablet: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        System.out.print("encendido por defecto: " + encendido);
        

        

        Tablet objtablets = new Tablet();
        objtablets.setNombre(nombre);
        objtablets.setCorreo(correo);
        objtablets.setVisibilidad(visibilidad);
        objtablets.setEncendido(encendido);
      

        Control_Dispositivo.validar_nombre();
        
        System.out.print("\nSe agrego con exito!!\n");   
        listardispositivos();
        submenuDispoACrear();
    
     
       // }
      
    }

    private void crearsmartwatch() {
         // do {
           System.out.println("\n-------------CREAR SMARTWATCH-------");

        System.out.print("Ingrese nombre del smarwatch: ");
        nombre = entrada.next();
        entrada.nextLine();

        System.out.print("ingrese correo del smartwatch: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        System.out.print("encendido por defecto: " + encendido);
   
       Smartwatch objsmartwatchs = new Smartwatch();
       objsmartwatchs.setNombre(nombre);
       objsmartwatchs.setCorreo(correo);
       objsmartwatchs.setVisibilidad(visibilidad);
       objsmartwatchs.setEncendido(encendido);
      
        Control_Dispositivo.validar_nombre();
        
        System.out.print("\nSe agrego con exito!!\n");   
        listardispositivos();
        submenuDispoACrear();
    
     
       // }
    }

    private void crearauricularesinal() {
        //  do {
          System.out.println("\n-----------------CREAR AURICULARES INALAMBRICOS-------------");

        System.out.print("Ingrese nombre los auriculares: ");
        nombre = entrada.next();
        entrada.nextLine();

        System.out.print("ingrese correo de los auricuñlares: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        System.out.print("encendido por defecto: " + encendido);
        

        

        AuricularesInala objauriculares = new AuricularesInala();
        objauriculares.setNombre(nombre);
        objauriculares.setCorreo(correo);
        objauriculares.setVisibilidad(visibilidad);
        objauriculares.setEncendido(encendido);
      

        Control_Dispositivo.validar_nombre();
        
        System.out.print("\nSe agrego con exito!!\n");   
        listardispositivos();
        submenuDispoACrear();
    
     
       // }

    }
    
     private void crearsmartphone() 
     {
         // do {
        System.out.println("\n---------------CREAR SMARTPHONE-------------");

        System.out.print("Ingrese nombre del smartphone: ");
        nombre = entrada.next();
        entrada.nextLine();
        System.out.println("ingrese el numero del samartphone");
        int numerotel = entrada.nextInt();
        entrada.nextLine();

        System.out.print("ingrese correo del smarphone: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        System.out.print("encendido por defecto: " + encendido);
        

        

        AuricularesInala objauriculares = new AuricularesInala();
        objauriculares.setNombre(nombre);
        objauriculares.setCorreo(correo);
        objauriculares.setVisibilidad(visibilidad);
        objauriculares.setEncendido(encendido);
      

        Control_Dispositivo.validar_nombre();
        
        System.out.print("\nSe agrego con exito!!\n");   
        listardispositivos();
        submenuDispoACrear();
    
     
      //  }
        
    }
   
    void listardispositivos() {
         ArrayList<Computadora> lista = Control_Dispositivo.validar_nombre();
        System.out.println("\n|Nombre |Correo |visble |Encendido");
            }
   public void Opciones_administrarDispositivos (){
         int opcion = 0;
        do {        
            
            Control_Dispositivo.Lectura_ArchivoPlano();       
            System.out.println("-------DISPOSITIVO A ADMINISTRAR------\n");
            System.out.println("1. COMPUTADORA");
            System.out.println("2. TABLET");
            System.out.println("3. SMARTWATCH");
            System.out.println("4. SMARTPHONE");
            System.out.println("5. AURICULARES INALAMBRICOS");
            System.out.println("6. Regresar -> MENU PRINCIPAL");
            System.out.print("Ingrese opcion:");
            opcion = entrada.nextInt();

        } while (opcion < 1 || opcion > 6);
        Opciones_submenuDispoACrear(opcion);
    }
    public void AccionDispo(){
        int opcion = 0;
        do {        
            
            Control_Dispositivo.Lectura_ArchivoPlano();       
            System.out.println("------- CONECCIONES CON DISPOSITIVOS ------\n");
            System.out.println("1. CONECTAR COMPUTADORA");
            System.out.println("2. CONECTAR TABLET");
            System.out.println("3. CONECTAR SMARTWATCH");
            System.out.println("4. CONECTAR SMARTPHONE");
            System.out.println("5. AURICULARES INALAMBRICOS");
            System.out.println("6. Regresar -> MENU PRINCIPAL");
            System.out.print("Ingrese opcion:");
            opcion = entrada.nextInt();

        } while (opcion < 1 || opcion > 6);
        Opciones_submenuDispoACrear(opcion);
        
    }
    
       public void Opcion_AccionDispo(){
            System.out.println("\n----------------------------");

        System.out.print("con : ");
        nombre = entrada.next();
        entrada.nextLine();
       
        System.out.print("ingrese correo: ");
        correo = entrada.nextLine();

        System.out.print("visible: ");
        visibilidad = entrada.nextLine();
        entrada.nextLine();

        System.out.print("encendido por defecto: " + encendido);
        

       }
       
   }
   

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
  public static void main(String[] args) {

  
    String Formato;
    String opcion="";
    String Except="";
    String option="";
    boolean verifica;
    int numTrabajador;
    int NumerodeTrabajadores=100;                                                  //Cambia para agregar mas o menos trabajadores
    Trabajador[] trabajadores= new Trabajador[NumerodeTrabajadores];
    NumerodeTrabajadores=100;     
    for(int i=0;i<NumerodeTrabajadores;i++){
      trabajadores[i]=new Trabajador(i);
    }

    //Hasta aqui para que lo pongan como opcion en el menu
    Formatter formatter = new Formatter(System.out);
    String contraseña1="0";
    do{
      System.out.println("\n           INICIO          \n");
      System.out.println("      Tipo de usuario:       ");
      System.out.println("1. Trabajador        2. RRHH \n");
      Scanner leer = new Scanner(System.in);
      System.out.println("Seleccione su tipo usuario escribiendo 1 o 2:");
      opcion = leer.nextLine();
      switch(opcion){
      case "1":

      int actualiza;
      String sActualiza="";
      System.out.println("\nEsta accediendo como trabajador");
      
      do{
      verifica = false;
      System.out.println("\n¿Desea consultar sus datos?");
      System.out.println("Escriba un numero segun su opción: 1. Si   2.No");
      opcion = leer.nextLine();
      if(opcion.equals("1")){
        do{
              try{
              System.out.println("Ingrese el numero del trabajador (1-"+NumerodeTrabajadores+") al cual desea consultar");
              Scanner leerInt= new Scanner(System.in);
              sActualiza=leerInt.nextLine();
              actualiza=Integer.parseInt(sActualiza);
              actualiza--;
              System.out.println("Base de datos de trabajador\n");
              formatter.format("%10.15s|%s\n","     Trabajador","Datos de Trabajador\n");
                if(actualiza>=0 && actualiza<NumerodeTrabajadores){
                  trabajadores[actualiza].ImprimirTrabajador();
                  Except = "Se Visualizo";
                }else{
                  System.out.println("Numero fuera de rango");
                }
              }catch(Exception e){
                System.out.println("Numero de trabajador invalido");
              }  
              verifica = Except.equals("Se Visualizo");
              }while(verifica != true);
      }else if(opcion.equals("2")){
        Except = "Se Visualizo";
        verifica = Except.equals("Se Visualizo");
      }else{
        System.out.println("Opcion no valida.\n");
      }
      }while(verifica != true);      
      break;  
      case "2":
      String noValido="Opcion no valida";
      String contraseña = "223344";
      System.out.println("\nEsta accediendo como RRHH");
      System.out.println("   Ingresar contraseña   ");
      do{
        Scanner leer1Scanner = new Scanner(System.in);
        contraseña1 = leer1Scanner.nextLine();
        if(contraseña.equals(contraseña1)){
          System.out.println("   contraseña correcta    ");
          System.out.println("   ¿Que desea realizar?   ");
          System.out.println("         Opciones         ");
          System.out.println("1. Crear un trabajador");
          System.out.println("2. Actualizar un trabajador");
          System.out.println("3. Borrar un trabajador");
          System.out.println("4. Visualizar todos los trabajadores");
          System.out.println("5. Visualizar un trabajador");
          do{
          opcion = leer.nextLine();
            if(opcion.equals("1")){
            System.out.println("1. Crear un trabajador");
            NumerodeTrabajadores= NumerodeTrabajadores+1;
            System.out.println("Se creo un nuevo trabajador");
            trabajadores[NumerodeTrabajadores-1]=new Trabajador(NumerodeTrabajadores-1);
            trabajadores[NumerodeTrabajadores-1].ImprimirTrabajador();

          }else if(opcion.equals("2")){
            System.out.println("2. Actualizar un trabajador");
            System.out.println("Que deseas editar?");
            System.out.println("1.Nombre");
            System.out.println("2.Apellido Materno");
            System.out.println("3.Apellido Paterno");
            System.out.println("4.Edad");
            System.out.println("5.Numero de trabajador");
            System.out.println("6.Años de servicio");
            System.out.println("7.Dirección");
            System.out.println("8.Proyectos");
            option = leer1Scanner.nextLine();
            switch(option){
              case "1":
              System.out.println("Ingresa el numero de trabajador (1-"+NumerodeTrabajadores+") que deseas editar");
             numTrabajador = leer1Scanner.nextInt();
             
             System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa el nuevo nombre");
              leer1Scanner.nextLine();
              String nombre = leer1Scanner.nextLine();
              trabajadores[numTrabajador].setNombre(nombre);
              System.out.println(trabajadores[numTrabajador]);
              
              break;

              case "2":
             System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
             numTrabajador = leer1Scanner.nextInt();
             numTrabajador--;
             System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa el nuevo Apellido Materno");
              String ApellidoM = leer1Scanner.nextLine();
              trabajadores[numTrabajador].setApellidoM(ApellidoM);
              System.out.println(trabajadores[numTrabajador]);
              break;

              case "3":
            System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
            numTrabajador = leer1Scanner.nextInt();
            numTrabajador--;
            System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa el nuevo Apellido Paterno");
              String ApellidoP = leer1Scanner.nextLine();
              trabajadores[numTrabajador].setApellidoP(ApellidoP);
              System.out.println(trabajadores[numTrabajador]);
              break;
              
              case "4":
              System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
              numTrabajador = leer1Scanner.nextInt();
              numTrabajador--;
              System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa la nueva edad del trabajador");
              int Edad = leer1Scanner.nextInt();
              trabajadores[numTrabajador].setEdad(Edad);
              System.out.println(trabajadores[numTrabajador]);
              break;
              
              case "5":
              System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
              numTrabajador = leer1Scanner.nextInt();
              numTrabajador--;
              System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa el nuevo numero del trabajador");
              int NumerodeTrabajador = leer1Scanner.nextInt();
              trabajadores[numTrabajador].setNumTrabajador(NumerodeTrabajador);
              System.out.println(trabajadores[numTrabajador]);
              break;

              case "6":
              System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
              numTrabajador = leer1Scanner.nextInt();
              numTrabajador--;
              System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa los años de servicio actualizados");
              int AñosdeServ= leer1Scanner.nextInt();
              trabajadores[numTrabajador].setAñosDeServ(AñosdeServ);
              System.out.println(trabajadores[numTrabajador]);
              break;

              case "7":  
              System.out.println("Ingresa el numero de trabajador (1-100) que deseas editar");
              numTrabajador = leer1Scanner.nextInt();
              numTrabajador--;
              System.out.println(trabajadores[numTrabajador]);
              System.out.println("Ingresa la nueva calle");
                leer1Scanner.nextLine();
                String calle=leer1Scanner.nextLine();
                trabajadores[numTrabajador].getDireccion().setCalle(calle);
              System.out.println("Ingresa el nuevo numero exterior");
                String NumExt=leer1Scanner.nextLine();
                trabajadores[numTrabajador].getDireccion().setNumeroExterior(NumExt);
              System.out.println("Ingresa el nuevo municipio");
                String Municipio=leer1Scanner.nextLine();
                trabajadores[numTrabajador].getDireccion().setMunicipio(Municipio); 
              System.out.println("Ingresa el nuevo código postal");
                String CoPostal=leer1Scanner.nextLine();
                trabajadores[numTrabajador].getDireccion().setCoPostal(CoPostal);
              System.out.println("Ingresa el nuevo estado");
                String Estado=leer1Scanner.nextLine();
                trabajadores[numTrabajador].getDireccion().setEstado(Estado); 
              System.out.println("Direccion actualizada"+trabajadores[numTrabajador]);
              break;
              case "8":
                System.out.println("Ingresa el numero de trabajador que deseas editar");
                 numTrabajador = leer1Scanner.nextInt();
                for(int f=0;f<trabajadores[numTrabajador].getTotalDeProyectos();f++){
                 System.out.println(f+1+trabajadores[numTrabajador].proyectos[f].EscribirProyecto());
                 }
                System.out.println("Ingresa el numero de proyecto que deseas editar");
                leer1Scanner.nextLine();
                int numProyecto = leer1Scanner.nextInt();
              numProyecto--;
            System.out.println("Ingresa el nuevo nombre del proyecto");
            leer1Scanner.nextLine();
            String proyecto = leer1Scanner.nextLine();
            trabajadores[numTrabajador].proyectos[numProyecto].setNombreProyecto(proyecto);
            System.out.println("Ingresa el nuevo numero de proyecto");
            int numPro = leer1Scanner.nextInt();
            numPro--;
            trabajadores[numTrabajador].proyectos[numProyecto].setNumProyecto(numPro-1);
            System.out.println("Ingresa el nuevo status de proyecto");
            leer1Scanner.nextLine();
            proyecto = leer1Scanner.nextLine();
            trabajadores[numTrabajador].proyectos[numProyecto].setEstatus(proyecto);
            System.out.println(trabajadores[numTrabajador].proyectos[numProyecto].EscribirProyecto());
            
              break;
              default: System.out.println("la opcion no existe");
            
            }    
          }else if(opcion.equals("3")){
            int elimina;
            String sElimina="";
            int TrabajadorElim;
            do{
              System.out.println("Ingrese el numero del trabajador (1-100) que desea borrar");
              Scanner leerInt = new Scanner(System.in);
              sElimina=leerInt.nextLine();
              try{
                elimina=Integer.parseInt(sElimina);
                if(elimina>=0 && elimina<NumerodeTrabajadores){
                  System.out.println("Se borro al trabajador "+elimina+"");
                  Except="Se borro";
                for(TrabajadorElim=elimina;elimina<NumerodeTrabajadores-1; elimina++){
                  trabajadores[elimina]=trabajadores[elimina+1];
                }
                NumerodeTrabajadores=NumerodeTrabajadores-1;
                }else
                System.out.println("Numero fuera de rango");
              }catch(Exception e){
                System.out.println("Numero de trabajador invalido");
              }  
              verifica = Except.equals("Se borro");
            }while(verifica != true);

          }else if(opcion.equals("4")){
            System.out.println("4. Visualizar todos los trabajadores");
          formatter.format("%10.15s|%s\n","     Trabajador","Datos de Trabajador\n");
          for(int i=0;i<NumerodeTrabajadores;i++){
            formatter.format("%10.15s|%s\n","Trabajador "+i+" . ",trabajadores[i].getNombre()+" "+trabajadores[i].getApellidoP()+" "+trabajadores[i].getApellidoM());
          }

          }else if(opcion.equals("5")){
            System.out.println("5. Visualizar un trabajador");

            do{
              try{
              System.out.println("Ingrese el numero del trabajador (1-"+NumerodeTrabajadores+") al cual desea consultar");
              Scanner leerInt= new Scanner(System.in);
              sActualiza=leerInt.nextLine();
              actualiza=Integer.parseInt(sActualiza);
              actualiza--;
                if(actualiza>=0 && actualiza<NumerodeTrabajadores){
                  trabajadores[actualiza].ImprimirTrabajador();
                  Except = "Se Visualizo";
                }else{
                  System.out.println("Numero fuera de rango");
                }
              }catch(Exception e){
                System.out.println("Numero de trabajador invalido");
              }  
              verifica = Except.equals("Se Visualizo");
            }while(verifica != true);

            verifica=opcion.equals("5");
          }else{
            opcion= noValido;
            System.out.println("\n"+noValido);
            System.out.println("Seleccione una opcion valida\n");
          }
          }while(opcion.equals(noValido)==true);

          }else{
          System.out.println("  contraseña incorrecta  \n");
          System.out.println("   Ingresar contraseña   ");
        }
      }while(contraseña.equals(contraseña1)==false);

        break;
      default:
       System.out.println("\n Opcion no valida");  
      }  
    System.out.println("\n     ¿Desea regresar al inicio?     ");
    System.out.println("Escriba el numero:   1. Si     2. No\n");
    opcion = leer.nextLine();
    verifica = opcion.equals("2");
    }while(verifica!=true);
    System.out.println("El programa termino, gracias");

        try{//Apartir de aqui todo lo de abajo es para crear el csv
      FileWriter BaseDeDatos= new FileWriter("BaseDeDatos.csv");
      BufferedWriter bw= new BufferedWriter(BaseDeDatos);
      PrintWriter Salida =new PrintWriter(bw);
      for(int i=0;i<NumerodeTrabajadores;i++){
        Formato=trabajadores[i].FormatoTrabajador();
        Salida.println(Formato);
        for(int f=0;f<trabajadores[i].getTotalDeProyectos();f++){
          Formato=trabajadores[i].proyectos[f].EscribirProyecto();
          Salida.println(Formato);
        }
      }
      Salida.close();
    }catch (IOException ex){
      System.out.println(ex.getMessage());
    }
  
  }
}
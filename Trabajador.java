public class Trabajador{
  private String [] Nombres= {"Manuel","Antonio","Jose","William","George","Joseph","Frank","Thomas","Carlos","Edward","Walter","Harold","Martin","Samuel","Santiago","Sebastian","Alejandro","Jack","Donald","Albert","Paul","Daniel","David","Roy","Kenneth","Maria Alejandra","Elizabeth","Maria Elena","Lucia","Maria Guadalupe","Adriana","Verónica","Isabel","María","Daniela","Mónica","Maria Carmen","Carolina","Patricia","Pilar","Rosario","Juana,Isabel","Antonia","Maria Dolores","Maria Luisa","Gabriela","Sofia","Emma","Cecilia","Andrea","Maria Rosario"};//Arreglos de nombres para Trabajadores
  private String [] Apellidos= {"Garcia","Gonzalez","Rodriguez","	Fernandez","Lopez","Martinez","	Sanchez","Perez","	Gomez","	Martin","	Jimenez","	Ruiz","Hernandez","Diaz","	Moreno","Muñoz","Álvarez","	Romero","Alonso","Gutierrez","Navarro","	Torres","	Dominguez","	Vazquez","	Ramos","Gil","	Ramirez","Serrano","Blanco","Molina","	Morales","	Suarez","	Ortega","	Delgado","Castro","Ortiz","	Rubio","Marin","	Sanz","	Núñez","	Iglesias","	Medina","Garrido","Cortes","	Castillo","	Santos","Lozano","	Guerrero","	Cano","	Prieto","	Mendez"};//Arreglos de apellidos para Trabajadores
//Parametros para los Trabajadores
  private String Nombre;
  private String ApellidoP;//Apellido Paterno
  private String ApellidoM;//Apellido Materno
  private int Edad;
  private Direccion direccion;
  private int NumTrabajador;
  private int NumProyectosVigentes;
  private int TotalDeProyectos=(int)(Math.random()*49+1);//Genera aleatoriamente proyectos
  public Proyecto [] proyectos=new Proyecto[TotalDeProyectos+1];//Se guardan los proyectos del trabjador como un arreglo
  private int AñosDeServ;
  private int Elemento=0;

  public Trabajador(int Elemento){
    this.Elemento=Elemento;
    Nombre= Nombres[(int) (Math.random()*50)];//Asigna un nombre aleatorio del arreglo Nombres
    ApellidoP=Apellidos[(int) (Math.random()*50)];//Asigna un Apellido aleatorio del arreglo Apellidos
    ApellidoM=Apellidos[(int) (Math.random()*50)];//Asigna un Apellido aleatorio del arreglo Apellidos
    Edad=(int) (Math.random()*82+18);//Asigna una Edad aleatoria de [18 a 100]
    NumTrabajador=(int) (Math.random()*1000);
    AñosDeServ=(int) (Math.random()*50);//Asigna Años de Servicio aleatorio de [0 a 50]
    int aux1=0;
    for(int i=0;i<TotalDeProyectos;i++){//Inicializa los proyectos
      proyectos[i]=new Proyecto();
      if(proyectos[i].getNumProyecto()>39)
        NumProyectosVigentes++;
      if(NumProyectosVigentes==3){//Se valida que maximo se tengan 3 proyectos Vigentes
        aux1=i;
        i=TotalDeProyectos;
      }
    }
    if(NumProyectosVigentes==3)
      TotalDeProyectos=aux1;
    if(NumProyectosVigentes==0){//Se valida que minimo se tenga un proyecto Vigente
      Proyecto aux =new Proyecto((int)(Math.random()*10+40));//Se agrega un proyecto vigente
      proyectos[TotalDeProyectos-1].setNumProyecto(aux.getNumProyecto());
      proyectos[TotalDeProyectos-1].setNombreProyecto(aux.getNombreProyecto());
      proyectos[TotalDeProyectos-1].setEstatus(aux.getEstatus());
      NumProyectosVigentes++;
    }
    direccion=new Direccion(Elemento);
  }//Inializacion del Trabajador
  
  public String getNombre(){
    return Nombre;//Regresa nombre
  }
  public void setNombre(String Nombre){
    this.Nombre=Nombre;
  }
  public String getApellidoP(){
    return ApellidoP;
  }//Regresa ApellidoP
  public void setApellidoP(String ApellidoP){
    this.ApellidoP=ApellidoP;
  }//Regresa ApellidoP
  public String getApellidoM(){
    return ApellidoM;
  }//Regresa ApellidoM
  public void setApellidoM(String ApellidoM){
    this.ApellidoM=ApellidoM;
  }
  public Direccion getDireccion(){
    return direccion;
  }//Regresa Direccion
  public void setDireccion(Direccion direccion ){
    this.direccion=direccion;
  }
  public int getEdad(){
    return Edad;
  }//Regresa Edad
  public void setEdad(int Edad){
    this.Edad=Edad;
  }
    public int getAños(){
    return AñosDeServ;
  }//Regresa años
  public void setAñosDeServ(int AñosDeServ){
    this.AñosDeServ=AñosDeServ;
  }
  public int getNumTrabajador(){
    return NumTrabajador;
  }//Regresa Numero de Trabajador
  public void setNumTrabajador(int NumTrabajador){
    this.NumTrabajador=NumTrabajador;
  }
  public int getTotalDeProyectos(){
    return TotalDeProyectos;
  }//Regresa el Total de Proyectos
  public void setTotalDeProyectos(int TotalDeProyectos){
    this.TotalDeProyectos=TotalDeProyectos;
  }
  public int getNumProyectosVigentes(){
    return NumProyectosVigentes;
  }//Regresa Numero de Proyectos Vigentes 
  public void setNumProyectosVigentes(int NumProyectosVigentes){
    this.NumProyectosVigentes=NumProyectosVigentes;
  }
  public void ImprimirTrabajador(){
    if(NumProyectosVigentes==3){
    System.out.println("***Trabajador [ Nombre:"+Nombre+" ApellidoPaterno:"+ApellidoP+" ApellidoMaterno:"+ApellidoM+" Edad:"+Edad+" NumerodeTrabajador:"+NumTrabajador+" AñosDeServicio:"+AñosDeServ+direccion.toString()+" NumeroDeProyectosVigentes:"+NumProyectosVigentes+" TotalDeProyectos:"+(TotalDeProyectos+1)+" Proyectos:");
    for(int f=0;f<=TotalDeProyectos;f++){
      System.out.println(proyectos[f]);
    }
    }else{
     System.out.println("***Trabajador [ Nombre:"+Nombre+" ApellidoPaterno:"+ApellidoP+" ApellidoMaterno:"+ApellidoM+" Edad:"+Edad+" NumerodeTrabajador:"+NumTrabajador+" AñosDeServicio:"+AñosDeServ+direccion.toString()+" NumeroDeProyectosVigentes:"+NumProyectosVigentes+" TotalDeProyectos:"+TotalDeProyectos+" Proyectos:");
    for(int f=0;f<=TotalDeProyectos;f++){
      System.out.println(proyectos[f]);
    } 
    }
  }

  public String FormatoTrabajador(){//Esta funcion se usa para dar formato al trabajador en el CSv
  String Formato;
  String SEdad=Integer.toString(Edad);
  String SNumTrabajador=Integer.toString(NumTrabajador);
  String SAñosDeServ=Integer.toString(AñosDeServ);
  String SNumProyectosVigentes=Integer.toString(NumProyectosVigentes);
  String STotalDeProyectos=Integer.toString(TotalDeProyectos+1);  
    if(NumProyectosVigentes==3){
    Formato="***Trabajador,Nombre,"+Nombre+" ,ApellidoPaterno,"+ApellidoP+", ApellidoMaterno,"+ApellidoM+", Edad,"+SEdad+", NumerodeTrabajador,"+SNumTrabajador+", AñosDeServicio,"+SAñosDeServ+direccion.EscribirDireccion()+", NumeroDeProyectosVigentes,"+SNumProyectosVigentes+", TotalDeProyectos,"+STotalDeProyectos;
    }else{
    STotalDeProyectos=Integer.toString(TotalDeProyectos); 
    Formato="***Trabajador,Nombre,"+Nombre+" ,ApellidoPaterno,"+ApellidoP+", ApellidoMaterno,"+ApellidoM+", Edad,"+SEdad+", NumerodeTrabajador,"+SNumTrabajador+", AñosDeServicio,"+SAñosDeServ+direccion.EscribirDireccion()+", NumeroDeProyectosVigentes,"+SNumProyectosVigentes+", TotalDeProyectos,"+STotalDeProyectos;
    }
    return Formato;
  }

  @Override
  
  public String toString(){
    return "Trabajador [ Nombre:"+Nombre+" ApellidoPaterno:"+ApellidoP+" ApellidoMaterno:"+ApellidoM+" Edad:"+Edad+" NumerodeTrabajador:"+NumTrabajador+" AñosDeServicio:"+AñosDeServ+direccion.toString()+" NumeroDeProyectosVigentes:"+NumProyectosVigentes+" TotalDeProyectos:"+TotalDeProyectos;
  }
}
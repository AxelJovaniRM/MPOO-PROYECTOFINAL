import java.util.Scanner;
public class Proyecto{
  private String NombreProyecto;
  private int NumProyecto;
  private String Estatus;
  public String [] NombresProyectos={"CH-REURBANO","Edificio Emiliano Zapata ","Departamentos DPS","Edificio Las Terrazas","Apartamentos ODP","Edificio MO47","Edificio Vibe","Edificio División del Norte","Edificio González Luna ","Edificio Coahuila 59","Edificio Argáez","Edificio Sinaloa 193 ","Edificio Tabasco 127","Alfonso Reyes 200 ","Hera 24","Vertiz 950","López Cotilla 857","NT24","MR299","Tres Picos 97 ","Elite Departamentos ","Adamant ","Conjunto Habitacional Mi Querido Tulum","Edificio Coahuila 59","Casa Pedro","Departamentos Tribu ","High Park","Popocatepetl 143","Cordoba-ReUrbano","Durango 133","Mar Adentro","Edificio Poniente 309","Córdoba-Flat","Edificio AS","Rinconada Margaritas","Viviendas María Ribera","La Esmeralda ","Romero 114","Edificio TLALPAN 590","Alcázar de Toledo","Departamento San Rafael","Edificio departamentos Capulin 59","Cerrada de La Paz #19","Casa Kaspé","Edificio Monterrey 55","Edificio Rebull 85 ","LC 710","Edificio IT0","Departamentos Artia","Bulgaria 533"};//Nombres de los proyectos 
  public Proyecto(){
    NumProyecto=(int)(Math.random()*50);
    NombreProyecto=NombresProyectos[NumProyecto];
    if(NumProyecto>=40){
      Estatus="Vigente";
    }else{
      Estatus="Historico";
    }
  }
  public Proyecto(int NumProyecto){
    this.NumProyecto=NumProyecto;
    NombreProyecto=NombresProyectos[NumProyecto];
    Estatus="Vigente"; 
  }
  public String getNombreProyecto(){
  return NombreProyecto;
  }
  public void setNombreProyecto(String NombreProyecto){
    this.NombreProyecto=NombreProyecto;
  }
  public int getNumProyecto(){
  return NumProyecto;
  }
  public void setNumProyecto(int NumProyecto){
    this.NumProyecto=NumProyecto;
  }
  public String getEstatus(){
  return Estatus;
  }
  public void setEstatus(String Estatus){
    this.Estatus=Estatus;
  }
  public String EscribirProyecto(){
    String SNumProyecto=Integer.toString(NumProyecto+1);
    return "  ,Proyecto ,Nombre Proyecto,"+NombreProyecto+",NumeroDeProyecto,"+SNumProyecto+",Estatus,"+Estatus;
  }
  @Override
  public String toString(){
    return "Proyecto |Nombre Proyecto:"+NombreProyecto+" NumeroDeProyecto:"+(NumProyecto+1)+" Estatus:"+Estatus+"|";
  }
}
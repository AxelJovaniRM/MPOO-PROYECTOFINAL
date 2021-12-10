import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
public class Direccion{
  private String Calle;
  private String NumeroExterior;
  private String Municipio;
  private String CoPostal;
  private String Estado;

  public Direccion(int Elemento){
    try{
      FileReader tabla = new FileReader("Direcciones.csv");
      BufferedReader buffer = new BufferedReader(tabla);
      String linea =buffer.readLine();
      int count = 0,i=0;
      while(linea!=null){
       if(i==Elemento){
        StringTokenizer tokenizador= new StringTokenizer(linea,",");
        while(tokenizador.hasMoreTokens()){
          String aux= tokenizador.nextToken();
          if(count==0)
            Calle=aux;
            else if(count == 1)
              NumeroExterior=aux;
              else if(count == 2)
                Municipio=aux;
                else if(count == 3)
                  CoPostal=aux;
                    else if(count == 4)
                    Estado=aux;
          count++;
        }
       }
       linea=buffer.readLine();
       i++;
      }
      buffer.close();
   }catch(ArrayIndexOutOfBoundsException e){
   }catch(FileNotFoundException ex){
    System.out.println(ex.getMessage());
    }catch(NullPointerException e){     
      }catch(IOException ex){
    System.out.println(ex.getMessage());
    }
    
  }

public void setCalle(String Calle){
  this.Calle=Calle;
}
public void setNumeroExterior(String NumeroExterior){
  this.NumeroExterior=NumeroExterior;
}
public void setMunicipio(String Municipio){
  this.Municipio=Municipio;
}
public void setCoPostal(String CoPostal){
  this.CoPostal=CoPostal;
}
public void setEstado(String Estado){
  this.Estado=Estado;
}
public String getCalle(){
return Calle;
}
public String getNumeroExterior(){
  return NumeroExterior;
}
public String getMunicipio(){
  return Municipio;
}
public String getCoPostal(){
  return CoPostal;
}
public String getEstado(){
  return Estado;
}

public String EscribirDireccion(){
  return " Direccion,Calle,"+Calle+",NumeroExterior,"+NumeroExterior+",Municipio,"+Municipio+",CodigoPostal,"+CoPostal+",Estado,"+Estado;
}
@Override

public String toString(){
    return " Direccion {Calle:"+Calle+" NumeroExterior:"+NumeroExterior+" Municipio:"+Municipio+" CodigoPostal:"+CoPostal+" Estado:"+Estado+"}";
  }
}
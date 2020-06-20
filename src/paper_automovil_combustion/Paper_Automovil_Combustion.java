/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper_automovil_combustion;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
class Automovil_Combustion_Interna {
    
    /*Atributos*/
    private String motor;
    private String serie;
    private String sistemaAlimentacion;
    private int numeroPistones;
    private String material;
    
    /*Constructor*/
    
    public Automovil_Combustion_Interna(String pMotor, String pSerie, 
            String pSistemaAlimentacion, int pNumeroPistones, String pMaterial){
            motor=pMotor;
            serie=pSerie;
            sistemaAlimentacion=pSistemaAlimentacion;
            numeroPistones=pNumeroPistones;
            material=pMaterial;
    }
    
    /*Metodos*/
    
    public String getMotor(){
        return motor;
    }
    
    public void setMotor(String motor){
        this.motor = motor; /*this, puntero que invoca al atributo private cogigo*/
    }
    
    public String getSerie(){
        return serie;
    }
    
    public void setSerie(String serie){
        this.serie = serie;
    }
    
    public String getSistemaAlimentacion(){
        return sistemaAlimentacion;
    }
    
    public void setSistemaAlimentacion(String sistemaAlimentacion){
        this.sistemaAlimentacion = sistemaAlimentacion;
    }
    
    public int getNumeroPistones(){
        return numeroPistones;
    }
    
    public void setNumeroPistones(int numeroPistones){
        this.numeroPistones = numeroPistones;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }

        @Override
    public String toString(){
        return "El tipo de motor es: "+motor+" con una serie: "+serie+" --"
                + " Con un sistema de alimentación a: "+sistemaAlimentacion
                + " con un total de: "+numeroPistones+" Pistones."+" Y el motor"
                + " esta fabricado con un material de: "+material+" en todo su Bloq";
    }
}  
public class Paper_Automovil_Combustion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        // Creamos los objetos
        Automovil_Combustion_Interna objeto1=new Automovil_Combustion_Interna("Motor gasolina ",
                "487AD7DE", "Inyección Electronica", 4, "Aliación de Aluminio");
        Automovil_Combustion_Interna objeto2=new Automovil_Combustion_Interna("Motor diesel ",
                "745DS7SW", "Bomba de Inyección", 6, "Aliaciones de Acero y Hierro fundido");
        
            //Mostrar el estado de cada objeto manual1 & manual2
            System.out.println(objeto1.toString());
            System.out.println(objeto2.toString());
            
            //Modificamos el atributo MumMantenimiento del manual1
            objeto1.setNumeroPistones(10);
            
            //Comparamos cual de los dos objetos tiene mas mantenimientos
            if(objeto1.getNumeroPistones()<objeto2.getNumeroPistones()){
                System.out.println(objeto1.getMotor()+" tiene mas Pistones");
            }else{
                System.out.println(objeto2.getMotor()+" tiene mas Pistones");
            }
    }
    
}
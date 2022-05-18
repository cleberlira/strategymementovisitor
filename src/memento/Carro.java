package memento;

//Originador
public class Carro {

	private String cor;
	
	public void set(String cor) 
    {
        System.out.println("A cor do veículo" + cor);
        this.cor = cor; 
    }
	
	 public Memento salvarMemento() 
	    {
	        System.out.println("Salvando Memento");
	        return new Memento(cor);
	    }
	 
	 
	 public void restaurarAtravesMemento(Memento memento) 
	    {
	        cor = memento.getCorSalva();
	        System.out.println("Cor restaurada " + cor);
	    }
	 
	 
	 
	 //Memento
	 public static class Memento 
	    {
	        private final String cor;
	   
	        public Memento(String corSalva) 
	        {
	            cor = corSalva;
	        }
	   
	        public String getCorSalva() 
	        {
	            return cor;
	        }
	    }
	  
}	


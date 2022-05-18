package memento;

import java.util.ArrayList;
import java.util.List;

//zeladora
public class App {

	public static void main(String[] args) {
		List<Carro.Memento> coreshistorico = new ArrayList<Carro.Memento>();
		   
        Carro carro = new Carro();
   
        carro.set("azul ");
        
        coreshistorico.add(carro.salvarMemento());
       
        carro.set("rosa ");
        
        coreshistorico.add(carro.salvarMemento());
        
        carro.set("verde ");
        
        coreshistorico.add(carro.salvarMemento());
   
        carro.set("marron ");
        
        coreshistorico.add(carro.salvarMemento());
        
        carro.restaurarAtravesMemento(coreshistorico.get(1));
        
	}

}

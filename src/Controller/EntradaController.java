
package Controller;

import View.Entrada;
import View.MenuPrincipal;


public class EntradaController {
    
    private final Entrada view;

   

    public EntradaController(Entrada view) {
        this.view = view;
    }

    

    public void navegarPraAgenda(){
        MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
    }
}

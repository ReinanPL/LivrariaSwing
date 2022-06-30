/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Livro;
import Model.Manga;
import View.AcervoBiblioteca;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reinan
 */
public class AcervoBibliotecaHelper {
    
     private final AcervoBiblioteca view;

    public AcervoBibliotecaHelper(AcervoBiblioteca view) {
        this.view = view;
    }
    
   

    public void preecherTabela(ArrayList<Manga> lista) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelLivros().getModel();
        tableModel.setNumRows(0);
        //percorrer a lista preenchendo o tableModel
        for (Manga l : lista) {
            
            tableModel.addRow(new Object[]{
            
            l.getId(), 
            l.getNome(),
            l.getGenero(),
            l.getAutor(),
            l.getPreco(),
            l.getPaginas(),
            l.getLerTrasPraFrente()? "Sim" : "Não" ,
            l.getPaginaPretoBranco()? "Sim" : "Não",
            l.getAlugado()? "Sim" : "Não"
            
            
            
            });
            
        }
    }
    
}

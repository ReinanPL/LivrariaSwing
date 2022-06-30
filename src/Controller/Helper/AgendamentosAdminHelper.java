/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Manga;
import View.AgendamentosAdmin;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reinan
 */
public class AgendamentosAdminHelper {
    
     private final AgendamentosAdmin view;

    public AgendamentosAdminHelper(AgendamentosAdmin view) {
        this.view = view;
    }
    
    public void preecherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabelLivros().getModel();
        tableModel.setNumRows(0);
        //percorrer a lista preenchendo o tableModel
        for (Agendamento l : agendamentos) {
            
            tableModel.addRow(new Object[]{
            
            l.getManga().getId(),
            l.getManga().getNome(),
            l.getNomeCliente(),
            l.getDataLocacao(),
            l.getDataDevolucao(),
           
            
            
            
            });
            
        }
    }
    
}

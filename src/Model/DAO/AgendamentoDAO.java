/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;


import Model.Agendamento;
import static Model.DAO.Banco.lista;
import Model.Manga;
import java.util.ArrayList;


/**
 *
 * @author Reinan
 */
public class AgendamentoDAO {
    
    Banco banco = new Banco();
    
     public void locarFilme(int id) {
		this.banco.lista.get(id).setAlugado(true);
		
	}
      
     public Manga verifica(int id) {
   for  (Manga u : lista) {
      if (u.getId() == id) {
         return u;
      }
   }
   return null;
}
     
     public int buscarLivro(String nomeFilme) {
		for (int i = 0; i < this.banco.lista.size(); i++) {
			if (this.banco.lista.get(i).getNome().equals(nomeFilme)) {
				return i;
			}
		}
		
		return -1;
	}
     
     public ArrayList<Agendamento> selectAll(){
        return Banco.agendamento;
    }
     
     
    
     
    
}

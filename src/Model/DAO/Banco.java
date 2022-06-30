package Model.DAO;

import Model.Agendamento;
import Model.Manga;
import Model.Livro;
import Model.Usuario;
import java.util.ArrayList;


public class Banco {

    public static ArrayList<Manga> lista ;
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Agendamento> agendamento;
    
    public static void inicia(){
        
        lista = new ArrayList<Manga>();
        usuario = new ArrayList<Usuario>();
        agendamento = new ArrayList<Agendamento>();
        
        
        lista.add(new Manga(0 , "Black Clover", "Acao", "Yuki Tabata", 276, 7.90, true, true,false));
        lista.add(new Manga(1 ,"One Piece", "Aventura", "Echiro Oda", 247, 10.99, true, true,true));
        lista.add(new Manga(2 ,"Beserker", "Drama", "Kentaro Miuro", 136, 14.99, true, true,false));
        lista.add(new Manga(3 ,"Chainsaw Man", "Terror", "Tatsuki Fujimoto", 149, 15.00, true, true,false));
        lista.add(new Manga(4 ,"Death Note", "Suspense", "Tsugumi Ohba", 192, 19.99, true, true,false));
        lista.add(new Manga(5 ,"Sword Art Online", "Romance", "Reki Kawahara", 132, 9.99, true, true,false));
        lista.add(new Manga(7 ,"Solo Leving", "Acao", "Chu Gong", 231, 15.90, false, false,false));
        lista.add(new Manga(8 ,"The beggins after the end", "Acao", "Turtle Me", 214, 18.90, false, false,false));
        lista.add(new Manga(9 ,"Magic Emperor", "Aventura", "Ye Xiao", 364, 24.90, false, false,true));
        lista.add(new Manga(10 ,"Tokyo Revengers", "Drama", "Ken Wakui", 234, 13.90, true, true,false));
        lista.add(new Manga(11 ,"Boku no Hero Academia", "Aventura", "Kohei Horikoshi", 174, 17.90, true, true,false));
        lista.add(new Manga(12 ,"Dragon Ball", "Acao", "Akira Toriyama", 74, 4.90, true, true,true));
        lista.add(new Manga(13 ,"Kimetsu no Yaiba", "Aventura", "Koyoharu Gotouge ", 194, 16.90, true, true,false));
        lista.add(new Manga(14 ,"Jujutsu Kaisen", "Aventura", "Akutami Gege", 254, 23.90, true, true,false));
        lista.add(new Manga(15 ,"Shingeki no Kyojin", "Drama", "Hajime Isayama", 274, 29.90, true, true,false));
        lista.add(new Manga(16 ,"Apotheosis", "Artes Marciais", "Ranzai Studio", 292, 18.90, false, false,false));
        lista.add(new Manga(17 ,"Boruto", "Shounen", "Kodachi, Ukyou & Ikemoto", 174, 10.90, true, true,false));
        lista.add(new Manga(18 ,"The God of Highschool", "Arte Marciais", "Yong-Je Park", 174, 23.90, false, false,false));
        lista.add(new Manga(19 ,"Chainsaw Man", "Demonios", "Tatsuki Fujimoto", 299, 25.90, true, true,false));
        lista.add(new Manga(20 ,"Bleach", "Shounen", "Tite Kubo", 334, 35.90, true, true,false));
        
        
        usuario.add(new Usuario("reinan", "1234", 0));
        
        agendamento.add(new Agendamento("Reinan", "21/06/2022", "21/07/2022", new Manga("Dragon Ball", 12 )));
        agendamento.add(new Agendamento("Sarah", "23/06/2022", "21/07/2022", new Manga("One Piece", 1 )));
        agendamento.add(new Agendamento("Luan", "24/06/2022", "06/07/2022", new Manga("Magic Emperor", 9 )));
        
        
        
        
    }
    
   
    
    }

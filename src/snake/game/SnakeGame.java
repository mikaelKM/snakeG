/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake.game;

/**
 *
 * @author mikael
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
public class SnakeGame extends JFrame{

    public SnakeGame() {
        
        initUI();
    }
    
    private void initUI() {
      // board b = new board();
        add(new board());
        
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeGame();
            ex.setVisible(true);
        });
    }
// TODO code application logic here
    }
    


import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setTitle("Snake"); //title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //you exit the frame when 'x'
        this.setResizable(false);//the user cannot resize the frame if tre parameter is false
        this.pack();
        //is defined in Window class in Java, and it sizes the frame
        // so that all its contents are at or above their preferred sizes.
        this.setVisible(true);//makes the frame appear on the screen
        this.setLocationRelativeTo(null);
    }
}

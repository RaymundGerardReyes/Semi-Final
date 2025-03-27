
package javaapplication10;
import javax.swing.*;
public class JavaApplication10 {

   
    public static void main(String[] args) {
        int birdPosition = 5; // Initial position of the bird
        int obstaclePosition = 20; // Position of the obstacle
        boolean gameRunning = true;

        JOptionPane.showMessageDialog(null, "Welcome to Flappy Bird!\nPress OK to start.");

        while (gameRunning) {
            String[] options = {"Flap", "Do Nothing"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Bird Position: " + birdPosition + "\nObstacle Position: " + obstaclePosition + "\n\nChoose your action:",
                    "Flappy Bird",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            // Update bird position
            if (choice == 0) {
                birdPosition -= 2; // Flap (go up)
            } else {
                birdPosition += 1; // Do nothing (go down)
            }

            obstaclePosition--; // Move the obstacle towards the bird

            // Check for collision
            if (birdPosition <= 0 || birdPosition >= 10 || obstaclePosition <= 1) {
                gameRunning = false;
                JOptionPane.showMessageDialog(null, "Game Over!\nFinal Position: " + birdPosition);
                break;
            }

            // Check if bird has passed the obstacle
            if (obstaclePosition <= 0) {
                obstaclePosition = 20; // Reset obstacle position
                JOptionPane.showMessageDialog(null, "You passed an obstacle!\nGet ready for the next one.");
            }
        }

        JOptionPane.showMessageDialog(null, "Thank you for playing!");
        
        
        
    }
    
}

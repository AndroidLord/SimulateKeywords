import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class KeyboardSimulation {

    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);

        StringBuilder content = new StringBuilder();
        while(br.ready()){
            content.append(br.readLine());
            content.append("\n");
        }

        if(content.isEmpty())
            System.out.println("File Is Empty");
        else
            for (char c : content.toString().toCharArray()) {
                try {
                    AllTestCases.checkCharacter(c,robot);
                } catch (Exception e) {
                    System.err.println("Error processing character: " + c);
                }
                Thread.sleep(1);

            }
           // Thread.sleep(1); // Add a delay between key presses
        }


    }



import java.awt.Robot;
import java.awt.event.KeyEvent;

public class test {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            // Input string containing special characters
            String inputString = "*!@#$%^*(){}[]<>?/\'\";:~/*-+.1234567889,";

            for (char c : inputString.toCharArray()) {
                checkCharacter(c, robot);
                Thread.sleep(100); // Add a delay between key presses
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkCharacter(char c, Robot robot) {
        int keyCode;
        switch (c) {
            case '*':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_8);
                break;
            case '>':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD);
                break;
            case '<':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA);
                break;
            case ':':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_SEMICOLON);
                break;
            case '!':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_1);
                break;
            case '(':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_9);
                break;
            case ')':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_0);
                break;
            case '&':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_7);
                break;
            case '%':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_5);
                break;
            case '→':
                simulateKeyPress(robot, KeyEvent.VK_RIGHT);
                break;
            case '↑':
                simulateKeyPress(robot, KeyEvent.VK_UP);
                break;
            case '←':
                simulateKeyPress(robot, KeyEvent.VK_LEFT);
                break;
            case '↓':
                simulateKeyPress(robot, KeyEvent.VK_DOWN);
                break;
            case '\'':
                simulateKeyPress(robot, KeyEvent.VK_QUOTE);
                break;
            case '"':
                simulateKeyPress(robot, KeyEvent.VK_QUOTEDBL);
                break;
            case '[':
                simulateKeyPress(robot, KeyEvent.VK_OPEN_BRACKET);
                break;
            case ']':
                simulateKeyPress(robot, KeyEvent.VK_CLOSE_BRACKET);
                break;
            case '{':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET);
                break;
            case '}':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET);
                break;
            case ',':
                simulateKeyPress(robot, KeyEvent.VK_COMMA);
                break;
            case '-':
                simulateKeyPress(robot, KeyEvent.VK_MINUS);
                break;
            case '—':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_MINUS);
                break;
            case '?':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH);
                break;
            case '@':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_2);
                break;
            case '$':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_4);
                break;
            case '\n':
                simulateKeyPress(robot, KeyEvent.VK_ENTER);
                break;
            case '\t':
                simulateKeyPress(robot, KeyEvent.VK_TAB);
                break;
            default:
                // Handle letters, digits, and other characters generically
                keyCode = (int) c;
                simulateKeyPress(robot, keyCode);
                break;
        }
    }


    // Helper method to simulate key press and release
            private static void simulateKeyPress(Robot robot, int... keyCodes) {
                for (int keyCode : keyCodes) {
                    robot.keyPress(keyCode);
                }
                for (int keyCode : keyCodes) {
                    robot.keyRelease(keyCode);
                }
            }

            // Helper method to simulate key press
            private static void simulateKeyPress(Robot robot, int keyCode) {
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            }

            // Helper method to simulate key release
            private static void simulateKeyRelease(Robot robot, int keyCode) {
                robot.keyRelease(keyCode);
            }
}
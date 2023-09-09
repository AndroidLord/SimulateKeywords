import java.awt.*;
import java.awt.event.KeyEvent;

public class AllTestCases {


    public static void checkCharacter(char c, Robot robot) {

        switch (c) {
            case '+':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_EQUALS);
                break;
            case '-':
                simulateKeyPress(robot, KeyEvent.VK_MINUS);
                break;
            case '/':
                simulateKeyPress(robot, KeyEvent.VK_SLASH);
                break;
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
                simulateKeyPress(robot, KeyEvent.VK_QUOTE);
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
            case '#':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_3); // ASCII code for #
                break;
            case '^':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_6); // ASCII code for ^
                break;

            case '~':
                simulateKeyPress(robot, KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE);
                break;

            default:
                // Handle letters, digits, and other characters
                handleCharacter(robot, c);
                break;

        }


    }

    // Helper method to handle letters, digits, and other characters
    private static void handleCharacter(Robot robot, char c) {
        int keyCode;
        if (Character.isUpperCase(c)) {
            simulateKeyPress(robot, KeyEvent.VK_SHIFT);
        }
        try {
            keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (keyCode != KeyEvent.CHAR_UNDEFINED) {
                simulateKeyPress(robot, keyCode);
            }
        } catch (IllegalArgumentException e) {
            // Character not supported, print an error message
            System.err.println("Unsupported character: " + c);
        }
        if (Character.isUpperCase(c)) {
            simulateKeyRelease(robot, KeyEvent.VK_SHIFT);
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
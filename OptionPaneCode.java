/*Author: Huzaifa Khalid
 * Date: 2024-01-15
 * This code uses a GUI and gets user name, age and height and outputs
 * those values to them
 */

package OptionPane;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OptionPaneCode {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in); // declare scanner
    // vairable declarations
    String name;
    int age;
    double height;

    // code stars
    try { // try the following code to catch exceptions
    name = JOptionPane.showInputDialog("Enter your name: "); // get user name
    JOptionPane.showMessageDialog(null, "Hello "+name); // display name

    age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // get age
    JOptionPane.showMessageDialog(null, "You are "+age+" years old"); // display age

     height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(cm): ")); // get height
    JOptionPane.showMessageDialog(null, "You are "+height+" cm tall"); // display height
    s.close(); // close scanner
    }
    catch (Exception e) {
      System.out.println("Invalid input"); // print error message
    }
  }
}
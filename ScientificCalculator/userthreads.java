/*import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Calculator {
    // ... (previous code)

    Calculator() {
        initialize();
    }

    // ... (previous code)

    private void initialize() {
        // ... (previous code)

        // Create a button for a time-consuming operation
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setFont(new Font("Calibri Light", Font.PLAIN, 17));
        butttonPanel.add(calculateButton);

        // Add an ActionListener to the Calculate button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Disable the button while the calculation is in progress
                calculateButton.setEnabled(false);

                // Create a SwingWorker for the background task
                SwingWorker<Double, Void> worker = new SwingWorker<Double, Void>() {
                    @Override
                    protected Double doInBackground() throws Exception {
                        // Simulate a time-consuming calculation
                        Thread.sleep(3000); // Sleep for 3 seconds (replace with your actual calculation)

                        // Perform the actual calculation and return the result
                        double result = performTimeConsumingCalculation();
                        return result;
                    }

                    @Override
                    protected void done() {
                        try {
                            // Get the result from the background thread
                            double result = get();

                            // Update the UI with the result
                            textField.setText(String.valueOf(result));

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        } finally {
                            // Re-enable the button after the calculation is done
                            calculateButton.setEnabled(true);
                        }
                    }
                };

                // Start the SwingWorker to perform the background calculation
                worker.execute();
            }
        });

        frmCalculator.setBounds(200, 100, 400, 500);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Simulated time-consuming calculation method
    private double performTimeConsumingCalculation() {
        // Replace this with your actual calculation logic
        return 42.0; // Example result
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frmCalculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}*/

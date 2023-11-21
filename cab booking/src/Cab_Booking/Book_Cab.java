/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cab_Booking;



import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class Book_Cab extends JFrame {
    private JTextField sourceField;
    private JTextField destinationField;

    public Book_Cab() {
        setTitle("Cab Booking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Source Location
        JLabel sourceLabel = new JLabel("Source");
        sourceLabel.setBounds(20, 20, 80, 20);
        add(sourceLabel);

        sourceField = createAutoCompleteTextField();
        sourceField.setBounds(120, 20, 200, 25);
        add(sourceField);

        // Destination Location
        JLabel destinationLabel = new JLabel("Destination");
        destinationLabel.setBounds(20, 60, 80, 20);
        add(destinationLabel);

        destinationField = createAutoCompleteTextField();
        destinationField.setBounds(120, 60, 200, 25);
        add(destinationField);

        // Other UI components and actions can be added as needed

        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //private JTextField createAutoCompleteTextField() {
       // JTextField textField = new JTextField();
        //AutoCompleteDecorator.decorate(textField, this::getAutocompleteResults);
        //return textField;
    //}

    private List<String> getAutocompleteResults(String partialText) {
        try {
            String apiKey = "YOUR_GOOGLE_MAPS_API_KEY";
            String apiUrl = "https://maps.googleapis.com/maps/api/place/autocomplete/json";
            String input = URLEncoder.encode(partialText, "UTF-8");

            URL url = new URL(apiUrl + "?input=" + input + "&key=" + apiKey);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            // Parse JSON response and extract predictions
            List<String> predictions = new ArrayList<>();
            // Add your JSON parsing logic here

            return predictions;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Book_Cab());
    }
}

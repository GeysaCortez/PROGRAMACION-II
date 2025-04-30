/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class TeatroMunicipal extends JFrame implements ActionListener {
    private JRadioButton rbPalco, rbPlatea, rbGaleria;
    private JTextField tfNumero, tfDias;
    private JButton btnVender, btnSalir;
    private JLabel lblInformacion;

    public TeatroMunicipal() {
        setTitle("Teatro Municipal");
        setSize(520, 360);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); 

        // Título
        JLabel lblTitulo = new JLabel("Teatro Municipal");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setBounds(160, 10, 250, 30);
        add(lblTitulo);

        // Imagen 
        try {
            ImageIcon icon = new ImageIcon("teatro.jpg"); 
            JLabel lblImagen = new JLabel(icon);
            lblImagen.setBounds(420, 10, 70, 60);
            add(lblImagen);
        } catch (Exception e) {
            System.out.println("Imagen no encontrada.");
        }

        // Panel de datos 
       // JPanel panelCentro = new JPanel(new GridLayout(5, 1));
        //panelCentro.setBorder(new TitledBorder("Datos del Boleto"));
        
        JLabel lblDatos = new JLabel("Datos del Boleto");
        lblDatos.setFont(new Font("Arial", Font.BOLD, 12));
        lblDatos.setBounds(20, 60, 150, 20);
        add(lblDatos);
        

        // RadioButtons
        rbPalco = new JRadioButton("Palco", true);
        rbPalco.setBounds(40, 90, 70, 20);
        rbPlatea = new JRadioButton("Platea");
        rbPlatea.setBounds(140, 90, 70, 20);
        rbGaleria = new JRadioButton("Galeria");
        rbGaleria.setBounds(240, 90, 80, 20);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbPalco);
        grupo.add(rbPlatea);
        grupo.add(rbGaleria);
        add(rbPalco);
        add(rbPlatea);
        add(rbGaleria);

        // Campo número
        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(40, 120, 70, 20);
        add(lblNumero);
        tfNumero = new JTextField("1");
        tfNumero.setBounds(110, 120, 50, 20);
        add(tfNumero);

        // Campo días
        JLabel lblDias = new JLabel("Cant. Días para el Evento:");
        lblDias.setBounds(40, 150, 170, 20);
        add(lblDias);
        tfDias = new JTextField();
        tfDias.setBounds(210, 150, 50, 20);
        add(tfDias);

        // Botones
        btnVender = new JButton("Vende");
        btnVender.setBounds(100, 190, 100, 25);
        btnVender.addActionListener(this);
        add(btnVender);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(220, 190, 100, 25);
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir);

        // Información
        JLabel lblInfoTitulo = new JLabel("Información");
        lblInfoTitulo.setBounds(20, 230, 100, 20);
        add(lblInfoTitulo);

        lblInformacion = new JLabel("Número: , Precio: ", JLabel.CENTER);
        lblInformacion.setFont(new Font("Arial", Font.BOLD, 15));
        lblInformacion.setForeground(Color.BLUE);
        lblInformacion.setBounds(20, 260, 400, 30);
        
        add(lblInformacion, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int numero = Integer.parseInt(tfNumero.getText());
            int dias = Integer.parseInt(tfDias.getText());
            Boleto boleto;

            if (rbPalco.isSelected()) {
                boleto = new Palco(numero);
            } else if (rbPlatea.isSelected()) {
                boleto = new Platea(numero, dias);
            } else {
                boleto = new Galeria(numero, dias);
            }

            lblInformacion.setText(boleto.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeatroMunicipal().setVisible(true));
    }
}



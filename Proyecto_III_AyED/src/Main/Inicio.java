package Main;

import GUI.DatosGraficos;
import GUI.PintanrDibujos;
import DataStructures.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        varTiempo = new javax.swing.JLabel();
        kmRecorridos3 = new javax.swing.JLabel();
        gas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AyudaAlViajero = new javax.swing.JLabel();
        habitantes = new javax.swing.JLabel();
        JLTiempo3 = new javax.swing.JLabel();
        interes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 210, 50));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(51, 51, 51));
        txtColorOrigen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtColorOrigen.setText("Origen");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 50, 40));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(51, 51, 51));
        txtColorDestino.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtColorDestino.setText("Destino");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 50, 30));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(51, 51, 51));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        txtColorNodoRecorrido.setText("Nodo Recorrido ");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 100, 40));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Dubai", 1, 8)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 40, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mapa/mapa.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 850, 730));

        EleccionDestino.setBackground(new java.awt.Color(51, 51, 51));
        EleccionDestino.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(255, 255, 255));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oriental", "San Nicolás", "Agua Caliente", "Guadalupe", "Dulce Nombre", "Tres Ríos", "Cachí", "Orosi", "Paraiso", "Santiago", "Tejar", "Cervantes", "Juan Viñas", "Concepción", "Occidental", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 420, 30));

        BuscarCamino.setBackground(new java.awt.Color(51, 51, 51));
        BuscarCamino.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        BuscarCamino.setText("Ruta mas corta\n");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 300, 60));

        EleccionOrigen.setBackground(new java.awt.Color(51, 51, 51));
        EleccionOrigen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(255, 255, 255));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oriental", "San Nicolás", "Agua Caliente", "Guadalupe", "Dulce Nombre", "Tres Ríos", "Cachí", "Orosi", "Paraiso", "Santiago", "Tejar", "Cervantes", "Juan Viñas", "Concepción", "Occidental", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 420, 30));

        txtKMAcumulados.setBackground(new java.awt.Color(51, 51, 51));
        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 520, 90));

        txtDestino.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Selecciona el destino:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(51, 51, 51));
        kmRecorridos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 280, 40));

        txtOrigen.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 250, 40));

        LateralSuperior.setBackground(new java.awt.Color(51, 51, 51));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 730));

        LateralSuperior1.setBackground(new java.awt.Color(51, 51, 51));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 560, 30));

        LateralSuperior2.setBackground(new java.awt.Color(51, 51, 51));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setText("                                          Path finder");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 500, 30));

        varTiempo.setBackground(new java.awt.Color(51, 51, 51));
        varTiempo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        varTiempo.setForeground(new java.awt.Color(0, 0, 255));
        varTiempo.setOpaque(true);
        getContentPane().add(varTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 300, 50));

        kmRecorridos3.setBackground(new java.awt.Color(51, 51, 51));
        kmRecorridos3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        kmRecorridos3.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos3.setText("                         Kilometros recorridos:");
        kmRecorridos3.setOpaque(true);
        getContentPane().add(kmRecorridos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 410, 570, 40));

        gas.setBackground(new java.awt.Color(51, 51, 51));
        gas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        gas.setForeground(new java.awt.Color(255, 255, 255));
        gas.setText("Gasolineras: ");
        gas.setOpaque(true);
        getContentPane().add(gas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 500, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 500, 390));

        AyudaAlViajero.setBackground(new java.awt.Color(51, 51, 51));
        AyudaAlViajero.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        AyudaAlViajero.setForeground(new java.awt.Color(255, 255, 255));
        AyudaAlViajero.setText("                                             Ayuda al viajero");
        AyudaAlViajero.setOpaque(true);
        getContentPane().add(AyudaAlViajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 500, 40));

        habitantes.setBackground(new java.awt.Color(51, 51, 51));
        habitantes.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        habitantes.setForeground(new java.awt.Color(255, 255, 255));
        habitantes.setText(" Habitantes:");
        habitantes.setOpaque(true);
        getContentPane().add(habitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 500, 30));

        JLTiempo3.setBackground(new java.awt.Color(51, 51, 51));
        JLTiempo3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        JLTiempo3.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempo3.setText("       Tiempo estimado: ");
        JLTiempo3.setOpaque(true);
        getContentPane().add(JLTiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, 40));

        interes.setBackground(new java.awt.Color(51, 51, 51));
        interes.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        interes.setForeground(new java.awt.Color(255, 255, 255));
        interes.setText("Lugares de interés: ");
        interes.setOpaque(true);
        getContentPane().add(interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 500, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        int Matriz[][] = {
          // 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 
            {0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, // 1
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, // 2
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, // 3
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0}, // 4
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 6
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0}, // 7
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 8
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, // 9
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, // 10 
            {1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, // 11
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 12
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 13
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1}, // 14
            {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1}, // 15
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, // 16
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0}, // 17
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, // 18
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0} // 19
            
        };

        double coe[][] = {
          // 1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19
            {0, 0, 0, 4.2, 2.4, 0, 0, 0, 6.9, 0, 4.7, 0, 0, 0, 0, 0, 0, 0, 0}, // 1
            {0, 0, 0, 0, 0, 7.0, 0, 0, 0, 0, 0, 0, 0, 9.0, 0, 0, 0, 0, 0}, // 2
            {0, 0, 0, 0, 5.2, 0, 0, 0, 10.2, 0, 0, 0, 0, 0, 0, 0, 0, 14.4, 0}, // 3
            {4.2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.8, 0, 0, 0, 3.4, 6.7, 0, 0, 0}, // 4
            {2.6, 0, 5.2, 0, 0, 0, 0, 0, 0, 18.5, 5.3, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
            {0, 7.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 6
            {0, 0, 0, 0, 0, 0, 0, 11.4, 0, 0, 0, 16.9, 0, 0, 0, 0, 0, 27.1, 0}, // 7
            {0, 0, 0, 0, 0, 0, 11.4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 8
            {7.2, 0, 11.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7.8, 0, 0, 0, 0}, // 9
            {0, 0, 0, 0, 19.2, 0, 0, 0, 0, 0, 24.1, 3.5, 11.9, 0, 0, 0, 0, 0, 0}, // 10
            {4.2, 0, 0, 2.8, 5.2, 0, 0, 0, 0, 23.3, 0, 0, 0, 0, 0, 8.9, 0, 0, 0}, // 11 
            {0, 0, 0, 0, 0, 0, 14.2, 0, 0, 3.5, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 12
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 11.9, 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 13
            {0, 9.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32.3, 0, 15.7}, // 14
            {0, 0, 0, 3.5, 0, 0, 0, 0, 7.8, 0, 0, 0, 0, 0, 0,3.8, 0, 0, 11.0}, // 15
            {0, 0, 0, 6.2, 0, 0, 0, 0, 0, 0, 7.7, 0, 0, 0, 3.4, 0, 0, 0, 0}, // 16
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 31.8, 0, 0, 0, 30.6, 0}, // 17
            {0, 0, 14.6, 0, 0, 0, 27.8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 29.9, 0, 0}, // 18
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14.8, 10.4, 0, 0, 0, 0}  // 19      
            ,};

                //  1     2    3    4    5    6    7    8    9    10   11   12   13   14   15   16   17   18   19    
        int xx1[] = {350, 180, 370, 338, 370, 160, 480, 470, 310, 500, 358, 510, 550, 215, 300, 315, 110, 340, 260};
        int yy1[] = {270, 250, 300, 230, 250, 280, 335, 385, 280, 280, 220, 310, 250, 235, 245, 180, 380, 360, 255};
        String nom[] = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
      

      
        for (int j = 0; j < 19; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 19; j++) {
            for (int k = 0; k < 19; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 19;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Oriental".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("San Nicolas".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Aguacaliente".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Guadalupe".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Dulce Nombre".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Tres Ríos".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Cachí".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Orosí".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Paraíso".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Santiago".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("El Tejar".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("Cervantes".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Juan Viñas".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Concepción".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Occidental".equals(nombreOrigen)) {
            origen = 14;
        }
        if ("Carmen".equals(nombreOrigen)) {
            origen = 15;
        }
        if ("Corralillo".equals(nombreOrigen)) {
            origen = 16;
        }
        if ("Tierra Blanca".equals(nombreOrigen)) {
            origen = 17;
        }
        if ("Llano Grande".equals(nombreOrigen)) {
            origen = 18;
        }
        

        if ("Oriental".equals(nombreDestino)) {
            destino = 0;
        }
        if ("San Nicolás".equals(nombreDestino)) {
            destino = 1;
           
        }
        if ("Aguas Calientes".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Guadalupe".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Dulce Nombre".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Tres Ríos".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Cachí".equals(nombreDestino)) {
            destino = 6;
        }
        if ("Orosí".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Paraíso".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Santiago".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Tejar".equals(nombreDestino)) {
            destino = 10;
        }
        if ("Cervantes".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Juan Viñas".equals(nombreDestino)) {
            destino = 12;
        }
        if ("Concepción".equals(nombreDestino)) {
            destino = 13;
        }
        if ("Occidental".equals(nombreDestino)) {
            destino = 14;
        }
        if ("Carmen".equals(nombreDestino)) {
            destino = 15;
        }
        if ("Corralillo".equals(nombreDestino)) {
            destino = 16;
        }
        if ("Tierra Blanca".equals(nombreDestino)) {
            destino = 17;
        }
        if ("Llano Grande".equals(nombreDestino)) {
            destino = 18;
        }
        

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Math.round(Dijkstra.getAcumulado()) + " KM");
            varTiempo.setText(Math.round((Dijkstra.getAcumulado()/80)*60) + "min");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }
    //xd

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AyudaAlViajero;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel JLTiempo3;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JLabel gas;
    private javax.swing.JLabel habitantes;
    private javax.swing.JLabel interes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos3;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    private javax.swing.JLabel varTiempo;
    // End of variables declaration//GEN-END:variables
}

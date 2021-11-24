package Main;

import DataStructures.Graph;
import GUI.ViewGraphics;
import DataStructures.Dijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    Graph arboles = new Graph();

    public static void PintarFiguras(int tope, Graph arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    ViewGraphics.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            ViewGraphics.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public App() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtColorOrigen = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BuscarCamino = new javax.swing.JButton();
        MostrarCaminos = new javax.swing.JButton();
        EleccionDestino = new javax.swing.JComboBox<>();
        EleccionOrigen = new javax.swing.JComboBox<>();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        varTiempo = new javax.swing.JLabel();
        kmRecorridos3 = new javax.swing.JLabel();
        gas = new javax.swing.JLabel();
        AyudaAlViajero = new javax.swing.JLabel();
        habitantes = new javax.swing.JLabel();
        JLTiempo3 = new javax.swing.JLabel();
        interes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        min_atrasos = new javax.swing.JSpinner();
        txtDestino1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtColorOrigen.setBackground(new java.awt.Color(51, 51, 51));
        txtColorOrigen.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(51, 255, 51));
        txtColorOrigen.setText("Origen");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 70, 40));

        txtColorDestino.setBackground(new java.awt.Color(51, 51, 51));
        txtColorDestino.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(255, 0, 0));
        txtColorDestino.setText("Destino");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 70, 40));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(51, 51, 51));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(0, 51, 255));
        txtColorNodoRecorrido.setText("Nodos Recorridos ");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 150, 40));

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

        BuscarCamino.setBackground(new java.awt.Color(255, 255, 204));
        BuscarCamino.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        BuscarCamino.setText("Calcular la ruta mas corta ");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 300, 60));

        MostrarCaminos.setBackground(new java.awt.Color(255, 255, 204));
        MostrarCaminos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 210, 50));

        EleccionDestino.setBackground(new java.awt.Color(51, 51, 51));
        EleccionDestino.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(255, 255, 255));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oriental", "San Nicolás", "Agua Caliente", "Guadalupe", "Dulce Nombre", "Tres Ríos", "Cachí", "Orosí", "Paraíso", "Santiago", "Tejar", "Cervantes", "Juan Viñas", "Concepción", "Occidental", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande" }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 420, 30));

        EleccionOrigen.setBackground(new java.awt.Color(51, 51, 51));
        EleccionOrigen.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(255, 255, 255));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oriental", "San Nicolás", "Agua Caliente", "Guadalupe", "Dulce Nombre", "Tres Ríos", "Cachí", "Orosí", "Paraíso", "Santiago", "Tejar", "Cervantes", "Juan Viñas", "Concepción", "Occidental", "Carmen", "Corralillo", "Tierra Blanca", "Llano Grande" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 420, 30));

        txtDestino.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Ingrese los minutos de atraso:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(51, 51, 51));
        kmRecorridos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 310, 40));

        txtOrigen.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, 40));

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
        LateralSuperior2.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setText("                  Path finder");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 500, 60));

        varTiempo.setBackground(new java.awt.Color(51, 51, 51));
        varTiempo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        varTiempo.setForeground(new java.awt.Color(255, 255, 255));
        varTiempo.setOpaque(true);
        getContentPane().add(varTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 350, 40));

        kmRecorridos3.setBackground(new java.awt.Color(51, 51, 51));
        kmRecorridos3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        kmRecorridos3.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos3.setText("Kilometros recorridos:");
        kmRecorridos3.setOpaque(true);
        getContentPane().add(kmRecorridos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 500, 40));

        gas.setBackground(new java.awt.Color(51, 51, 51));
        gas.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        gas.setForeground(new java.awt.Color(255, 255, 255));
        gas.setText("Gasolineras: ");
        gas.setOpaque(true);
        getContentPane().add(gas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 500, 40));

        AyudaAlViajero.setBackground(new java.awt.Color(51, 51, 51));
        AyudaAlViajero.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        AyudaAlViajero.setForeground(new java.awt.Color(255, 255, 255));
        AyudaAlViajero.setText("                                Ayuda al viajero");
        AyudaAlViajero.setOpaque(true);
        getContentPane().add(AyudaAlViajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 500, 40));

        habitantes.setBackground(new java.awt.Color(51, 51, 51));
        habitantes.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        habitantes.setForeground(new java.awt.Color(255, 255, 255));
        habitantes.setText("Habitantes:");
        habitantes.setOpaque(true);
        getContentPane().add(habitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 500, 30));

        JLTiempo3.setBackground(new java.awt.Color(51, 51, 51));
        JLTiempo3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        JLTiempo3.setForeground(new java.awt.Color(255, 255, 255));
        JLTiempo3.setText("Tiempo estimado: ");
        JLTiempo3.setOpaque(true);
        getContentPane().add(JLTiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 230, 40));

        interes.setBackground(new java.awt.Color(51, 51, 51));
        interes.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        interes.setForeground(new java.awt.Color(255, 255, 255));
        interes.setText("Lugares de interés: ");
        interes.setOpaque(true);
        getContentPane().add(interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 610, 40));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        min_atrasos.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        getContentPane().add(min_atrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 100, 40));

        txtDestino1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        txtDestino1.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino1.setText("Selecciona el destino:");
        getContentPane().add(txtDestino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 260, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 500, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Oriental".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("San Nicolás".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Agua Caliente".equals(nombreOrigen)) {
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
        if ("Tejar".equals(nombreOrigen)) {
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
            habitantes.setText("Habitantes: 12.402");
            interes.setText("Lugares: La basílica de los Ángeles, Hospital Dr.Max Peralta Jiménez");
            gas.setText("Gasolineras: Gasolinera Raúl, Servicentro del oeste");
        }
        if ("San Nicolás".equals(nombreDestino)) {
            destino = 1;
            habitantes.setText("Habitantes: 29.130");
            interes.setText("Lugares: Productos Kitty, Quinta Bella Vista, Mucap");
            gas.setText("Gasolineras: Servicentro Cristo Rey.");
        }
        if ("Agua Caliente".equals(nombreDestino)) {
            destino = 2;
            habitantes.setText("Habitantes: 35.498");
            interes.setText("Lugares: Iglesia de Navarro del Muñeco, Cabañas Cerro Verde");
            gas.setText("Gasolineras: Gasolinera de Lima, Estación de Servicio Los Ángeles");
        }
        if ("Guadalupe".equals(nombreDestino)) {
            destino = 3;
            habitantes.setText("Habitantes: 16.199");
            interes.setText("Lugares: Parque Industrial Cartago, Vitec, Fortech Química");
            gas.setText("Gasolineras: Estación de Servicio Coopinsermu RL");
        }
        if ("Dulce Nombre".equals(nombreDestino)) {
            destino = 4;
            habitantes.setText("Habitantes: 11.773");
            interes.setText("Lugares: La Casita del Quilting, Aves Don Aquiles");
            gas.setText("Gasolineras: Delta Dulce Nombre, Servicentro y Autopulido Erick.");
        }
        if ("Tres Ríos".equals(nombreDestino)) {
            destino = 5;
            habitantes.setText("Habitantes: 9.331");
            interes.setText("Lugares: Iglesia Católica de Tres Ríos, Canopy Carpintera");
            gas.setText("Gasolineras: ServiIndoor, Delta Tres Ríos.");
        }
        if ("Cachí".equals(nombreDestino)) {
            destino = 6;
            habitantes.setText("Habitantes: 5.911");
            interes.setText("Lugares: Finca Zalmari, Represa de Cachí, Escalada de Cachí.");
            gas.setText("Gasolineras: Abastecedor Cachí");
        }
        if ("Orosí".equals(nombreDestino)) {
            destino = 7;
            habitantes.setText("Habitantes: 10.002");
            interes.setText("Lugares: Rancho Orosí, Río Palomo, II Giardino (Pizzeria)");
            gas.setText("Gasolineras: SERPASA");
        }
        if ("Paraíso".equals(nombreDestino)) {
            destino = 8;
            habitantes.setText("Habitantes: 21.507");
            interes.setText("Lugares: Mirador de Orosí, UCR");
            gas.setText("Gasolineras: SERPASA");
        }
        if ("Santiago".equals(nombreDestino)) {
            destino = 9;
            habitantes.setText("Habitantes: 6.332");
            interes.setText("Lugares: Iglesia de Santiago, Plaza de Fútbol de Santiago");
            gas.setText("Gasolineras: Gasolinera Santiago");
        }
        if ("Tejar".equals(nombreDestino)) {
            destino = 10;
            habitantes.setText("Habitantes: 26.630");
            interes.setText("Lugares: Hotel el Guarco, El Quijongo, Residencial el Cacique");
            gas.setText("Gasolineras: Servicentro el Guarco, Gasolinera Trova");
        }
        if ("Cervantes".equals(nombreDestino)) {
            destino = 11;
            habitantes.setText("Habitantes: 6.759");
            interes.setText("Lugares: Sala de Bellesa Nela, Countrytico");
            gas.setText("Gasolineras: Estación de Servicio Cervantes");
        }
        if ("Juan Viñas".equals(nombreDestino)) {
            destino = 12;
            habitantes.setText("Habitantes: 7.106");
            interes.setText("Lugares: Mini Super Santa María, clínica de Juan Viñas");
            gas.setText("Gasolineras: Gasolinera Juan Viñas");
        }
        if ("Concepción".equals(nombreDestino)) {
            destino = 13;
            habitantes.setText("Habitantes: 18.667");
            interes.setText("Lugares: Centro Comercial Monplaza, Ana Yanci Plazaola");
            gas.setText("Gasolineras: Abastecedor Concepción");
        }
        if ("Occidental".equals(nombreDestino)) {
            destino = 14;
            habitantes.setText("Habitantes: 10.394");
            interes.setText("Lugares: Extreme Tech Cartago, Colegio de San Luis Gonzaga");
            gas.setText("Gasolineras: Servicentro Metrópoli");
        }
        if ("Carmen".equals(nombreDestino)) {
            destino = 15;
            habitantes.setText("Habitantes: 19.062");
            interes.setText("Lugares: Cerrajería Autolock, Fashionista sneakers");
            gas.setText("Gasolineras: Servicentro Cartago");
        }
        if ("Corralillo".equals(nombreDestino)) {
            destino = 16;
            habitantes.setText("Habitantes: 11.833");
            interes.setText("Lugares: Escuela La Guaria, Laguna lodge");
            gas.setText("Gasolineras: Servicentro Río Conejo");
        }
        if ("Tierra Blanca".equals(nombreDestino)) {
            destino = 17;
            habitantes.setText("Habitantes: 5.756");
            interes.setText("Lugares: Pulperia San Bosco, Palí, Ferretería Vidal");
            gas.setText("Gasolineras: Servicentro El Surco");
        }
        if ("Llano Grande".equals(nombreDestino)) {
            destino = 18;
            habitantes.setText("Habitantes: 4.958");
            interes.setText("Lugares: Flores Del Norte, Vivero Llano Verde");
            gas.setText("Gasolineras: Llantera la plaza");
        }

        if (origen == destino) {

            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);

        } else {
            Dijkstra Dijkstra = new Dijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);

            kmRecorridos.setText(Math.round(Dijkstra.getAcumulado()) + " KM");
            varTiempo.setText(Math.round((Dijkstra.getAcumulado()/80)*60)+ (Integer) min_atrasos.getValue() + "min");
        }

    }//GEN-LAST:event_BuscarCaminoActionPerformed

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);

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
            };

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
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
    private javax.swing.JLabel gas;
    private javax.swing.JLabel habitantes;
    private javax.swing.JLabel interes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos3;
    private javax.swing.JSpinner min_atrasos;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JLabel txtDestino1;
    private javax.swing.JLabel txtOrigen;
    private javax.swing.JLabel varTiempo;
    // End of variables declaration//GEN-END:variables
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultadoFinal implements ActionListener {
        private JFrame VentanaScoreFinal;
        private Image ImgCobre, ImgHierro, ImgOro, ImgEsmeralda, ImgDiamante, ImgNetherita;
        private ImageIcon ImgCobre2, ImgHierro2, ImgOro2, ImgEsmeralda2, ImgDiamante2, ImgNetherita2;
        private JButton BtnFinalizar;
        private JLabel LblTituloScore, LblScoreCobre1, LblScoreCobre2, LblScoreCobre3, LblScoreCobre4, LblScoreHierro1,
                        LblScoreHierro2, LblScoreHierro3, LblScoreHierro4, LblScoreOro1, LblScoreOro2, LblScoreOro3,
                        LblScoreOro4,
                        LblScoreEsmeralda1, LblScoreEsmeralda2, LblScoreEsmeralda3, LblScoreEsmeralda4,
                        LblScoreDiamante1,
                        LblScoreDiamante2, LblScoreDiamante3, LblScoreDiamante4, LblScoreNetherita1, LblScoreNetherita2,
                        LblScoreNetherita3, LblScoreNetherita4;
        private String Negro = "", Blanco = "", Gris = "", Cobre = "", Hierro = "", Oro = "", Esmeralda = "",
                        Diamante = "",
                        Netherita = "", Verde = "", Rojo = "";
        private int PuntajeNivelCobre = 0, PuntajeNivelHierro = 0, PuntajeNivelOro = 0, PuntajeNivelEsmeralda = 0,
                        PuntajeNivelDiamante = 0, PuntajeNivelNetherita = 0;
        private Font FuenteMinecraft;

        public void CreandoVentanaScoreFinal() {

                // OBTENEMOS FUENTE, COLORES, ETIQUETAS
                ObtenerRecursos();

                // OBTENEMOS LAS IMAGENES
                ObtenerImagenesScoreFinal();

                // CREAMOS Y AGREGAMOS NUESTRO JFRAME
                VentanaScoreFinal = new JFrame();
                VentanaScoreFinal.setLayout(null);
                VentanaScoreFinal.setUndecorated(true);
                VentanaScoreFinal.setBounds(0, 0, 400, 550);
                VentanaScoreFinal.setVisible(true);
                VentanaScoreFinal.setResizable(false);
                VentanaScoreFinal.setLocationRelativeTo(null);

                // ASIGNAMOS EL ICONO A NUESTRA VENTANA
                VentanaScoreFinal.setIconImage(
                                new ImageIcon(getClass().getResource("Images/Experiencia.png")).getImage());

                // CREAMOS Y AGREGAMOS EL BOTON DE CERRAR SCORE
                BtnFinalizar = new JButton("FINALIZAR");
                VentanaScoreFinal.add(BtnFinalizar);

                // AGREGAMOS NUESTRO TITULO
                LblTituloScore = new JLabel("RESULTADO FINAL POR NIVEL", JLabel.CENTER);
                VentanaScoreFinal.add(LblTituloScore);

                // AGREGAMOS EL NUMERO DEL NIVEL COBRE
                LblScoreCobre1 = new JLabel("1", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreCobre1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL COBRE
                LblScoreCobre2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreCobre2);

                // AGREGAMOS EL NOMBRE DEL NIVEL COBRE
                LblScoreCobre3 = new JLabel("NIVEL COBRE", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreCobre3);

                // AGREGAMOS EL RESULTADO DEL NIVEL COBRE
                LblScoreCobre4 = new JLabel(PuntajeNivelCobre + " DE 5", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreCobre4);

                // AGREGAMOS EL NUMERO DEL NIVEL HIERRO
                LblScoreHierro1 = new JLabel("2", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreHierro1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL HIERRO
                LblScoreHierro2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreHierro2);

                // AGREGAMOS EL NOMBRE DEL NIVEL HIERRO
                LblScoreHierro3 = new JLabel("NIVEL HIERRO", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreHierro3);

                // AGREGAMOS EL RESULTADO DEL NIVEL HIERRO
                LblScoreHierro4 = new JLabel(PuntajeNivelHierro + " DE 6", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreHierro4);

                // AGREGAMOS EL NUMERO DEL NIVEL ORO
                LblScoreOro1 = new JLabel("3", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreOro1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL ORO
                LblScoreOro2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreOro2);

                // AGREGAMOS EL NOMBRE DEL NIVEL ORO
                LblScoreOro3 = new JLabel("NIVEL ORO", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreOro3);

                // AGREGAMOS EL RESULTADO DEL NIVEL ORO
                LblScoreOro4 = new JLabel(PuntajeNivelOro + " DE 6", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreOro4);

                // AGREGAMOS EL NUMERO DEL NIVEL ESMERALDA
                LblScoreEsmeralda1 = new JLabel("4", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreEsmeralda1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL ESMERALDA
                LblScoreEsmeralda2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreEsmeralda2);

                // AGREGAMOS EL NOMBRE DEL NIVEL ESMERALDA
                LblScoreEsmeralda3 = new JLabel("NIVEL ESMERALDA", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreEsmeralda3);

                // AGREGAMOS EL RESULTADO DEL NIVEL ESMERALDA
                LblScoreEsmeralda4 = new JLabel(PuntajeNivelEsmeralda + " DE 4", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreEsmeralda4);

                // AGREGAMOS EL NUMERO DEL NIVEL DIAMANTE
                LblScoreDiamante1 = new JLabel("5", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreDiamante1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL DIAMANTE
                LblScoreDiamante2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreDiamante2);

                // AGREGAMOS EL NOMBRE DEL NIVEL DIAMANTE
                LblScoreDiamante3 = new JLabel("NIVEL DIAMANTE", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreDiamante3);

                // AGREGAMOS EL RESULTADO DEL NIVEL DIAMANTE
                LblScoreDiamante4 = new JLabel(PuntajeNivelDiamante + " DE 6", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreDiamante4);

                // AGREGAMOS EL NUMERO DEL NIVEL NETHERITA
                LblScoreNetherita1 = new JLabel("6", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreNetherita1);

                // AGREGAMOS EL NUMERO ICONO DEL NIVEL NETHERITA
                LblScoreNetherita2 = new JLabel("", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreNetherita2);

                // AGREGAMOS EL NOMBRE DEL NIVEL NETHERITA
                LblScoreNetherita3 = new JLabel("NIVEL NETHERITA", JLabel.LEFT);
                VentanaScoreFinal.add(LblScoreNetherita3);

                // AGREGAMOS EL RESULTADO DEL NIVEL NETHERITA
                LblScoreNetherita4 = new JLabel(PuntajeNivelNetherita + " DE 8", JLabel.CENTER);
                VentanaScoreFinal.add(LblScoreNetherita4);

                // ASIGNAMOS PROPIEDADES A NUESTRO TITULO DE SCORE
                LblTituloScore.setBounds(0, 0, 400, 50);
                LblTituloScore.setFont(FuenteMinecraft.deriveFont(17f));
                LblTituloScore.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblTituloScore.setOpaque(true);
                LblTituloScore.setForeground(Color.decode(Blanco));
                LblTituloScore.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 1 DE COBRE
                LblScoreCobre1.setBounds(0, 50, 75, 75);
                LblScoreCobre1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreCobre1.setOpaque(true);
                LblScoreCobre1.setForeground(Color.decode(Cobre));
                LblScoreCobre1.setBackground(Color.decode(Negro));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 1 DE COBRE
                LblScoreCobre2.setBounds(75, 50, 50, 75);
                LblScoreCobre2.setOpaque(true);
                LblScoreCobre2.setBackground(Color.decode(Negro));
                LblScoreCobre2.setIcon(ImgCobre2);

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 1 DE COBRE
                LblScoreCobre3.setBounds(125, 50, 200, 75);
                LblScoreCobre3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreCobre3.setOpaque(true);
                LblScoreCobre3.setBackground(Color.decode(Negro));
                LblScoreCobre3.setForeground(Color.decode(Cobre));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 1 DE COBRE
                LblScoreCobre4.setBounds(325, 50, 75, 75);
                LblScoreCobre4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreCobre4.setOpaque(true);
                LblScoreCobre4.setBackground(Color.decode(Negro));
                LblScoreCobre4.setForeground(Color.decode(Cobre));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 2 DE HIERRO
                LblScoreHierro1.setBounds(0, 125, 75, 75);
                LblScoreHierro1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreHierro1.setOpaque(true);
                LblScoreHierro1.setForeground(Color.decode(Hierro));
                LblScoreHierro1.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 2 DE HIERRO
                LblScoreHierro2.setBounds(75, 125, 50, 75);
                LblScoreHierro2.setIcon(ImgHierro2);
                LblScoreHierro2.setOpaque(true);
                LblScoreHierro2.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 2 DE HIERRO
                LblScoreHierro3.setBounds(125, 125, 200, 75);
                LblScoreHierro3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreHierro3.setOpaque(true);
                LblScoreHierro3.setForeground(Color.decode(Hierro));
                LblScoreHierro3.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 2 DE HIERRO
                LblScoreHierro4.setBounds(325, 125, 75, 75);
                LblScoreHierro4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreHierro4.setOpaque(true);
                LblScoreHierro4.setForeground(Color.decode(Hierro));
                LblScoreHierro4.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 3 DE ORO
                LblScoreOro1.setBounds(0, 200, 75, 75);
                LblScoreOro1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreOro1.setOpaque(true);
                LblScoreOro1.setBackground(Color.decode(Negro));
                LblScoreOro1.setForeground(Color.decode(Oro));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 3 DE ORO
                LblScoreOro2.setBounds(75, 200, 50, 75);
                LblScoreOro2.setOpaque(true);
                LblScoreOro2.setBackground(Color.decode(Negro));
                LblScoreOro2.setIcon(ImgOro2);

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 3 DE ORO
                LblScoreOro3.setBounds(125, 200, 200, 75);
                LblScoreOro3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreOro3.setOpaque(true);
                LblScoreOro3.setBackground(Color.decode(Negro));
                LblScoreOro3.setForeground(Color.decode(Oro));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 3 DE ORO
                LblScoreOro4.setBounds(325, 200, 75, 75);
                LblScoreOro4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreOro4.setOpaque(true);
                LblScoreOro4.setBackground(Color.decode(Negro));
                LblScoreOro4.setForeground(Color.decode(Oro));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 4 DE ESMERALDA
                LblScoreEsmeralda1.setBounds(0, 275, 75, 75);
                LblScoreEsmeralda1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreEsmeralda1.setOpaque(true);
                LblScoreEsmeralda1.setForeground(Color.decode(Esmeralda));
                LblScoreEsmeralda1.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 4 DE ESMERALDA
                LblScoreEsmeralda2.setBounds(75, 275, 50, 75);
                LblScoreEsmeralda2.setIcon(ImgEsmeralda2);
                LblScoreEsmeralda2.setOpaque(true);
                LblScoreEsmeralda2.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 4 DE ESMERALDA
                LblScoreEsmeralda3.setBounds(125, 275, 200, 75);
                LblScoreEsmeralda3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreEsmeralda3.setOpaque(true);
                LblScoreEsmeralda3.setForeground(Color.decode(Esmeralda));
                LblScoreEsmeralda3.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 4 DE ESMERALDA
                LblScoreEsmeralda4.setBounds(325, 275, 75, 75);
                LblScoreEsmeralda4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreEsmeralda4.setOpaque(true);
                LblScoreEsmeralda4.setForeground(Color.decode(Esmeralda));
                LblScoreEsmeralda4.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 5 DE DIAMANTE
                LblScoreDiamante1.setBounds(0, 350, 75, 75);
                LblScoreDiamante1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreDiamante1.setOpaque(true);
                LblScoreDiamante1.setBackground(Color.decode(Negro));
                LblScoreDiamante1.setForeground(Color.decode(Diamante));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 5 DE DIAMANTE
                LblScoreDiamante2.setBounds(75, 350, 50, 75);
                LblScoreDiamante2.setOpaque(true);
                LblScoreDiamante2.setBackground(Color.decode(Negro));
                LblScoreDiamante2.setIcon(ImgDiamante2);

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 5 DE DIAMANTE
                LblScoreDiamante3.setBounds(125, 350, 200, 75);
                LblScoreDiamante3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreDiamante3.setOpaque(true);
                LblScoreDiamante3.setBackground(Color.decode(Negro));
                LblScoreDiamante3.setForeground(Color.decode(Diamante));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 5 DE DIAMANTE
                LblScoreDiamante4.setBounds(325, 350, 75, 75);
                LblScoreDiamante4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreDiamante4.setOpaque(true);
                LblScoreDiamante4.setBackground(Color.decode(Negro));
                LblScoreDiamante4.setForeground(Color.decode(Diamante));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 6 DE NETHERITA
                LblScoreNetherita1.setBounds(0, 425, 75, 75);
                LblScoreNetherita1.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreNetherita1.setOpaque(true);
                LblScoreNetherita1.setForeground(Color.decode(Netherita));
                LblScoreNetherita1.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 6 DE NETHERITA
                LblScoreNetherita2.setBounds(75, 425, 50, 75);
                LblScoreNetherita2.setIcon(ImgNetherita2);
                LblScoreNetherita2.setOpaque(true);
                LblScoreNetherita2.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 6 DE NETHERITA
                LblScoreNetherita3.setBounds(125, 425, 200, 75);
                LblScoreNetherita3.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreNetherita3.setOpaque(true);
                LblScoreNetherita3.setForeground(Color.decode(Netherita));
                LblScoreNetherita3.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 6 DE NETHERITA
                LblScoreNetherita4.setBounds(325, 425, 75, 75);
                LblScoreNetherita4.setFont(FuenteMinecraft.deriveFont(15f));
                LblScoreNetherita4.setOpaque(true);
                LblScoreNetherita4.setForeground(Color.decode(Netherita));
                LblScoreNetherita4.setBackground(Color.decode(Gris));

                // ASIGNAMOS PROPIEDADES A BOTON DE REINTENTAR
                BtnFinalizar.setBounds(0, 500, 400, 50);
                BtnFinalizar.setFocusPainted(false);
                BtnFinalizar.setBorder(null);
                BtnFinalizar.setBackground(Color.decode(Rojo));
                BtnFinalizar.setForeground(Color.decode(Blanco));
                BtnFinalizar.setFont(FuenteMinecraft.deriveFont(15f));
                BtnFinalizar.addActionListener(this);
        }

        public void ObtenerImagenesScoreFinal() {
                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgCobre = new ImageIcon("Images/Cobre.png").getImage();
                ImgCobre2 = new ImageIcon(
                                ImgCobre.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgHierro = new ImageIcon("Images/Hierro.png").getImage();
                ImgHierro2 = new ImageIcon(
                                ImgHierro.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgOro = new ImageIcon("Images/Oro.png").getImage();
                ImgOro2 = new ImageIcon(
                                ImgOro.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgEsmeralda = new ImageIcon("Images/Esmeralda.png").getImage();
                ImgEsmeralda2 = new ImageIcon(
                                ImgEsmeralda.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgDiamante = new ImageIcon("Images/Diamante.png").getImage();
                ImgDiamante2 = new ImageIcon(
                                ImgDiamante.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgNetherita = new ImageIcon("Images/Netherita.png").getImage();
                ImgNetherita2 = new ImageIcon(
                                ImgNetherita.getScaledInstance(20, 20,
                                                Image.SCALE_SMOOTH));
        }

        public void ObtenerRecursos() {

                // OBTENEMOS LOS RECURSOS DE NUESTRA PLANTILLA GENERAL
                PlantillaGeneral PGSF = new PlantillaGeneral();
                PGSF.AñadirFuente();

                // OBTENEMOS LOS PUNTAJES DE CADA NIVEL
                VentanaCobre VC = new VentanaCobre();
                VentanaHierro VH = new VentanaHierro();
                VentanaOro VO = new VentanaOro();
                VentanaEsmeralda VE = new VentanaEsmeralda();
                VentanaDiamante VD = new VentanaDiamante();
                VentanaNetherita VN = new VentanaNetherita();

                // OBTENEMOS EL PUNTAJE DE CADA NIVEL
                PuntajeNivelCobre = VC.PuntajeNivelCobre;
                PuntajeNivelHierro = VH.PuntajeNivelHierro;
                PuntajeNivelOro = VO.PuntajeNivelOro;
                PuntajeNivelEsmeralda = VE.PuntajeNivelEsmeralda;
                PuntajeNivelDiamante = VD.PuntajeNivelDiamante;
                PuntajeNivelNetherita = VN.PuntajeNivelNetherita;

                // OBTENEMOS LA FUENTE
                FuenteMinecraft = PGSF.FuenteMinecraft;

                // OBTENEMOS LOS COLORES
                Negro = PGSF.Negro;
                Blanco = PGSF.Blanco;
                Gris = PGSF.Gris;
                Cobre = PGSF.Cobre;
                Hierro = PGSF.Hierro;
                Oro = PGSF.Oro;
                Esmeralda = PGSF.Esmeralda;
                Diamante = PGSF.Diamante;
                Netherita = PGSF.Netherita;
                Verde = PGSF.Verde;
                Rojo = PGSF.Rojo;
        }

        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == BtnFinalizar) {
                        System.exit(0);
                }
        }
}

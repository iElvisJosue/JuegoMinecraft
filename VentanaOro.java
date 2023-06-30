import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;

public class VentanaOro extends JFrame implements ActionListener, ChangeListener {

        private JFrame VentanaNivelOro;
        private JPanel Panel1, Panel2, Panel3, Panel4;
        private Image IconoNivel, IconoMostrar, IconoOcultar, ImgP1O1, ImgP1O2, ImgP1O3, ImgP1O4, ImgP2O1,
                        ImgP2O2, ImgP2O3, ImgP2O4, ImgP3O1, ImgP3O2, ImgP3O3, ImgP3O4, ImgP4O1, ImgP4O2, ImgP4O3,
                        ImgP4O4, ImgP5O5, ImgP5O6, ImgP5O7, ImgP5O8, ImgP5O9, ImgP5O10, ImgP5O11, ImgP5O12, ImgP5O1,
                        ImgP5O2, ImgP5O3, ImgP5O4, ImgP6O1, ImgP6O2, ImgP6O3, ImgP6O4, ImgP6O5, ImgP6O6, ImgP6O7,
                        ImgP6O8, ImgP6O9, ImgP6O10, ImgP6O11, ImgP6O12, Wallpaper;
        private ImageIcon IconoNivel2, IconoMostrar2, IconoOcultar2, ImgP1O1Num2, ImgP1O2Num2, ImgP1O3Num2,
                        ImgP1O4Num2, ImgP2O1Num2, ImgP2O2Num2, ImgP2O3Num2, ImgP2O4Num2, ImgP3O1Num2, ImgP3O2Num2,
                        ImgP3O3Num2, ImgP3O4Num2, ImgP4O1Num2, ImgP4O2Num2, ImgP4O3Num2, ImgP4O4Num2, ImgP5O1Num2,
                        ImgP5O2Num2, ImgP5O3Num2, ImgP5O4Num2, ImgP5O5Num2, ImgP5O6Num2, ImgP5O7Num2, ImgP5O8Num2,
                        ImgP5O9Num2, ImgP5O10Num2, ImgP5O11Num2, ImgP5O12Num2, ImgP6O1Num2, ImgP6O2Num2, ImgP6O3Num2,
                        ImgP6O4Num2, ImgP6O5Num2, ImgP6O6Num2, ImgP6O7Num2, ImgP6O8Num2, ImgP6O9Num2, ImgP6O10Num2,
                        ImgP6O11Num2, ImgP6O12Num2, Wallpaper2;
        private JRadioButton Pregunta1Opcion1, Pregunta1Opcion2, Pregunta1Opcion3, Pregunta1Opcion4, Pregunta2Opcion1,
                        Pregunta2Opcion2, Pregunta2Opcion3, Pregunta2Opcion4, Pregunta3Opcion1, Pregunta3Opcion2,
                        Pregunta3Opcion3, Pregunta3Opcion4, Pregunta4Opcion1, Pregunta4Opcion2, Pregunta4Opcion3,
                        Pregunta4Opcion4;
        private ButtonGroup Pregunta1, Pregunta2, Pregunta3, Pregunta4;
        private JButton BtnInstrucciones, BtnSiguiente, BtnSiguiente2, BtnSiguiente3, BtnFinalizar;
        private JLabel LblIconoNivel, LblNivel, LblInstruccionesNivel, LblPregunta1, LblPregunta2, LblPregunta3,
                        LblPregunta4, LblPregunta5, LblPregunta6,
                        LblPregunta1Opcion1, LblPregunta1Opcion2, LblPregunta1Opcion3, LblPregunta1Opcion4,
                        LblPregunta2Opcion1, LblPregunta2Opcion2, LblPregunta2Opcion3, LblPregunta2Opcion4,
                        LblPregunta3Opcion1, LblPregunta3Opcion2, LblPregunta3Opcion3, LblPregunta3Opcion4,
                        LblPregunta4Opcion1, LblPregunta4Opcion2, LblPregunta4Opcion3, LblPregunta4Opcion4,
                        LblPregunta5Opcion1, LblPregunta5Opcion2, LblPregunta5Opcion3, LblPregunta5Opcion4,
                        LblPregunta5Opcion5, LblPregunta5Opcion6, LblPregunta5Opcion7, LblPregunta5Opcion8,
                        LblPregunta5Opcion9, LblPregunta5Opcion10, LblPregunta5Opcion11, LblPregunta5Opcion12,
                        LblPregunta6Opcion1, LblPregunta6Opcion2, LblPregunta6Opcion3, LblPregunta6Opcion4,
                        LblPregunta6Opcion5, LblPregunta6Opcion6, LblPregunta6Opcion7, LblPregunta6Opcion8,
                        LblPregunta6Opcion9, LblPregunta6Opcion10, LblPregunta6Opcion11, LblPregunta6Opcion12,
                        LblRadio1, LblRadio2, LblRadio3, LblRadio4, LblCheckBox5, LblCheckBox6, LblCover, LblCover2,
                        LblCover3, LblCover4, LblWallpaper, LblWallpaper2, LblWallpaper3, LblWallpaper4, LblScoreCobre,
                        LblScoreHierro;
        private JCheckBox Pregunta5Opcion1, Pregunta5Opcion2, Pregunta5Opcion3, Pregunta5Opcion4, Pregunta5Opcion5,
                        Pregunta5Opcion6, Pregunta5Opcion7, Pregunta5Opcion8, Pregunta5Opcion9, Pregunta5Opcion10,
                        Pregunta5Opcion11, Pregunta5Opcion12, Pregunta6Opcion1, Pregunta6Opcion2, Pregunta6Opcion3,
                        Pregunta6Opcion4, Pregunta6Opcion5, Pregunta6Opcion6, Pregunta6Opcion7, Pregunta6Opcion8,
                        Pregunta6Opcion9, Pregunta6Opcion10, Pregunta6Opcion11, Pregunta6Opcion12;
        private String TxtNivel = "", TxtInstruccionesNivel = "", TxtPregunta1 = "", TxtPregunta2 = "",
                        TxtPregunta3 = "", TxtPregunta4 = "", TxtPregunta5 = "", TxtPregunta6 = "", Fuente = "",
                        Negro = "", Blanco = "", Oro = "", Verde = "";
        private Font FuenteMinecraft;
        private int m = 1, PuntajeNivelCobre = 0, PuntajeNivelHierro = 0;
        public static int PuntajeNivelOro = 0;

        public void CreandoVentanaNivelOro() {

                // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL HIERRO
                PersonalizarPlantillaOro();

                // GUARDANAMOS NUESTRAS IMAGENES
                AlmacenarImagenesNivelOro();

                // COLOCAMOS LOS PUNTAJES EN EL SCOREBOARD
                ScoreBoardOro();

                // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
                CrearSidebarLeftOro();

                // CREAMOS NUESTRO PANEL DE LAS PRIMERAS PREGUNTAS
                PanelPreguntasNivelOro1();
        }

        public void PersonalizarPlantillaOro() {
                // INSTANCIAMOS LA PLANTILLA
                PlantillaGeneral PlantillaGeneralParaNivelOro = new PlantillaGeneral();

                // OBTENEMOS LA PLANTILLA Y LA AGREAMOS A NUESTRO JFRAME
                VentanaNivelOro = PlantillaGeneralParaNivelOro.CreandoPlantillaGeneral();

                // ASIGNAMOS EL ICONO A NUESTRA VENTANA
                VentanaNivelOro.setIconImage(
                                new ImageIcon(getClass().getResource("ImgNivelOro/Oro.png")).getImage());

                // OBTENEMOS Y ALMACENAMOS LOS COLORES Y FUENTE A UTILIZAR
                FuenteMinecraft = PlantillaGeneralParaNivelOro.FuenteMinecraft;

                Fuente = PlantillaGeneralParaNivelOro.Fuente;
                Negro = PlantillaGeneralParaNivelOro.Negro;
                Blanco = PlantillaGeneralParaNivelOro.Blanco;
                Oro = PlantillaGeneralParaNivelOro.Oro;
                Verde = PlantillaGeneralParaNivelOro.Verde;

                // OBTENEMOS EL PUNTAJE DEL NIVEL COBRE/HIERRO
                LblScoreCobre = PlantillaGeneralParaNivelOro.LblScoreCobre4;
                LblScoreHierro = PlantillaGeneralParaNivelOro.LblScoreHierro4;
        }

        public void AlmacenarImagenesNivelOro() {
                // GUARDAMOS LA IMAGEN DEL NIVEL Oro
                IconoNivel = new ImageIcon("ImgNivelOro/Oro.png").getImage();
                IconoNivel2 = new ImageIcon(IconoNivel.getScaledInstance(135, 115,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE ICONO Oro
                IconoMostrar = new ImageIcon("ImgNivelOro/Mostrar.png").getImage();
                IconoMostrar2 = new ImageIcon(IconoMostrar.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ICONO Oro
                IconoOcultar = new ImageIcon("ImgNivelOro/Ocultar.png").getImage();
                IconoOcultar2 = new ImageIcon(IconoOcultar.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 1
                ImgP1O1 = new ImageIcon("ImgNivelOro/Pregunta1/Guardian.png").getImage();
                ImgP1O1Num2 = new ImageIcon(ImgP1O1.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 1
                ImgP1O2 = new ImageIcon("ImgNivelOro/Pregunta1/Ghast.png").getImage();
                ImgP1O2Num2 = new ImageIcon(ImgP1O2.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 1
                ImgP1O3 = new ImageIcon("ImgNivelOro/Pregunta1/GuardianAnciano.png").getImage();
                ImgP1O3Num2 = new ImageIcon(ImgP1O3.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 1
                ImgP1O4 = new ImageIcon("ImgNivelOro/Pregunta1/Ravager.png").getImage();
                ImgP1O4Num2 = new ImageIcon(ImgP1O4.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 2
                ImgP2O1 = new ImageIcon("ImgNivelOro/Pregunta2/ChuletaDeCerdoCocinada.png").getImage();
                ImgP2O1Num2 = new ImageIcon(ImgP2O1.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 2
                ImgP2O2 = new ImageIcon("ImgNivelOro/Pregunta2/PatataCocida.png").getImage();
                ImgP2O2Num2 = new ImageIcon(ImgP2O2.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 2
                ImgP2O3 = new ImageIcon("ImgNivelOro/Pregunta2/PescadoCocinado.png").getImage();
                ImgP2O3Num2 = new ImageIcon(ImgP2O3.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 2
                ImgP2O4 = new ImageIcon("ImgNivelOro/Pregunta2/PolloCocinado.png").getImage();
                ImgP2O4Num2 = new ImageIcon(ImgP2O4.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 3
                ImgP3O1 = new ImageIcon("ImgNivelOro/Pregunta3/BroteDeAbeto.png").getImage();
                ImgP3O1Num2 = new ImageIcon(ImgP3O1.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 3
                ImgP3O2 = new ImageIcon("ImgNivelOro/Pregunta3/ChampiñonMarron.png").getImage();
                ImgP3O2Num2 = new ImageIcon(ImgP3O2.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 3
                ImgP3O3 = new ImageIcon("ImgNivelOro/Pregunta3/Libro.png").getImage();
                ImgP3O3Num2 = new ImageIcon(ImgP3O3.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 3
                ImgP3O4 = new ImageIcon("ImgNivelOro/Pregunta3/SensorDeLuz.png").getImage();
                ImgP3O4Num2 = new ImageIcon(ImgP3O4.getScaledInstance(85, 85, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 4
                ImgP4O1 = new ImageIcon("ImgNivelOro/Pregunta4/PicosDeHielo.png").getImage();
                ImgP4O1Num2 = new ImageIcon(ImgP4O1.getScaledInstance(180, 125, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 4
                ImgP4O2 = new ImageIcon("ImgNivelOro/Pregunta4/PlayaNevada.png").getImage();
                ImgP4O2Num2 = new ImageIcon(ImgP4O2.getScaledInstance(180, 125, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 4
                ImgP4O3 = new ImageIcon("ImgNivelOro/Pregunta4/TaigaNevada.png").getImage();
                ImgP4O3Num2 = new ImageIcon(ImgP4O3.getScaledInstance(180, 125, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 4
                ImgP4O4 = new ImageIcon("ImgNivelOro/Pregunta4/LlanuraNevada.png").getImage();
                ImgP4O4Num2 = new ImageIcon(ImgP4O4.getScaledInstance(180, 125, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 5
                ImgP5O1 = new ImageIcon("ImgNivelOro/Pregunta5/OjoDeAraña.png").getImage();
                ImgP5O1Num2 = new ImageIcon(ImgP5O1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 5
                ImgP5O2 = new ImageIcon("ImgNivelOro/Pregunta5/Magma.png").getImage();
                ImgP5O2Num2 = new ImageIcon(ImgP5O2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 5
                ImgP5O3 = new ImageIcon("ImgNivelOro/Pregunta5/PezGlobo.png").getImage();
                ImgP5O3Num2 = new ImageIcon(ImgP5O3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 5
                ImgP5O4 = new ImageIcon("ImgNivelOro/Pregunta5/Fuerza.png").getImage();
                ImgP5O4Num2 = new ImageIcon(ImgP5O4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 5
                ImgP5O5 = new ImageIcon("ImgNivelOro/Pregunta5/Berruga.png").getImage();
                ImgP5O5Num2 = new ImageIcon(ImgP5O5.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 5
                ImgP5O6 = new ImageIcon("ImgNivelOro/Pregunta5/Azucar.png").getImage();
                ImgP5O6Num2 = new ImageIcon(ImgP5O6.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 5
                ImgP5O7 = new ImageIcon("ImgNivelOro/Pregunta5/LagrimaDeGhast.png").getImage();
                ImgP5O7Num2 = new ImageIcon(ImgP5O7.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 5
                ImgP5O8 = new ImageIcon("ImgNivelOro/Pregunta5/OjoDeArañaFermentado.png").getImage();
                ImgP5O8Num2 = new ImageIcon(ImgP5O8.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 5
                ImgP5O9 = new ImageIcon("ImgNivelOro/Pregunta5/ZanahoriaDorada.png").getImage();
                ImgP5O9Num2 = new ImageIcon(ImgP5O9.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 5
                ImgP5O10 = new ImageIcon("ImgNivelOro/Pregunta5/SandiaLuminosa.png").getImage();
                ImgP5O10Num2 = new ImageIcon(ImgP5O10.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 5
                ImgP5O11 = new ImageIcon("ImgNivelOro/Pregunta5/BotellaDeAgua.png").getImage();
                ImgP5O11Num2 = new ImageIcon(ImgP5O11.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 5
                ImgP5O12 = new ImageIcon("ImgNivelOro/Pregunta5/PataDeConejo.png").getImage();
                ImgP5O12Num2 = new ImageIcon(ImgP5O12.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 6
                ImgP6O1 = new ImageIcon("ImgNivelOro/Pregunta6/Diamante.png").getImage();
                ImgP6O1Num2 = new ImageIcon(ImgP6O1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 6
                ImgP6O2 = new ImageIcon("ImgNivelOro/Pregunta6/ObsidianaLlorosa.png").getImage();
                ImgP6O2Num2 = new ImageIcon(ImgP6O2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 6
                ImgP6O3 = new ImageIcon("ImgNivelOro/Pregunta6/Libreria.png").getImage();
                ImgP6O3Num2 = new ImageIcon(ImgP6O3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 6
                ImgP6O4 = new ImageIcon("ImgNivelOro/Pregunta6/LibroEncantado.png").getImage();
                ImgP6O4Num2 = new ImageIcon(ImgP6O4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 6
                ImgP6O5 = new ImageIcon("ImgNivelOro/Pregunta6/ObsidianaLuminosa.png").getImage();
                ImgP6O5Num2 = new ImageIcon(ImgP6O5.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 6
                ImgP6O6 = new ImageIcon("ImgNivelOro/Pregunta6/Lapislazuli.png").getImage();
                ImgP6O6Num2 = new ImageIcon(ImgP6O6.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 6
                ImgP6O7 = new ImageIcon("ImgNivelOro/Pregunta6/Libro.png").getImage();
                ImgP6O7Num2 = new ImageIcon(ImgP6O7.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 6
                ImgP6O8 = new ImageIcon("ImgNivelOro/Pregunta6/Lana.png").getImage();
                ImgP6O8Num2 = new ImageIcon(ImgP6O8.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 6
                ImgP6O9 = new ImageIcon("ImgNivelOro/Pregunta6/LibroPluma.png").getImage();
                ImgP6O9Num2 = new ImageIcon(ImgP6O9.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 6
                ImgP6O10 = new ImageIcon("ImgNivelOro/Pregunta6/Obsidiana.png").getImage();
                ImgP6O10Num2 = new ImageIcon(ImgP6O10.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 6
                ImgP6O11 = new ImageIcon("ImgNivelOro/Pregunta6/Esmeralda.png").getImage();
                ImgP6O11Num2 = new ImageIcon(ImgP6O11.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 6
                ImgP6O12 = new ImageIcon("ImgNivelOro/Pregunta6/BloqueDiamante.png").getImage();
                ImgP6O12Num2 = new ImageIcon(ImgP6O12.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE NUESTRO BACKGROUND
                Wallpaper = new ImageIcon("ImgNivelOro/Wallpaper.jpg").getImage();
                Wallpaper2 = new ImageIcon(
                                Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
        }

        public void ScoreBoardOro() {
                VentanaCobre VC = new VentanaCobre();
                VentanaHierro VH = new VentanaHierro();
                PuntajeNivelCobre = VC.PuntajeNivelCobre;
                PuntajeNivelHierro = VH.PuntajeNivelHierro;
                LblScoreCobre.setText(PuntajeNivelCobre + " DE 5");
                LblScoreHierro.setText(PuntajeNivelHierro + " DE 6");
        }

        public void CrearSidebarLeftOro() {
                // CREAMOS Y COLOCAMOS EL ICONO DEL NIVEL
                LblIconoNivel = new JLabel("", JLabel.CENTER);
                VentanaNivelOro.add(LblIconoNivel);

                // CREAMOS Y COLOCAMOS EL TEXTO DEL NIVEL
                TxtNivel = "<html><body>NIVEL 3 <b style=color:'" + Oro + "'>ORO</b></body></html>";
                LblNivel = new JLabel(TxtNivel, JLabel.CENTER);
                VentanaNivelOro.add(LblNivel);

                // CREAMOS Y COLOCAMOS EL TEXTO CON LAS INSTRUCCIONES
                TxtInstruccionesNivel = "<html><body><center><b style=color:'" + Oro
                                + "'>DETALLES DEL NIVEL</b><br><br>CANTIDAD DE PREGUNTAS <b style=color:'" + Oro
                                + "'>6</b><br>TIPO DE PREGUNTAS <b style=color:'" + Oro
                                + "'>OPCION MULTIPLE DE RESPUESTA UNICA Y RESPUESTA MULTIPLE</b><br>TIEMPO <b style=color:'"
                                + Oro
                                + "'>ILIMITADO</b></center></body></html>";
                LblInstruccionesNivel = new JLabel(TxtInstruccionesNivel, JLabel.CENTER);
                VentanaNivelOro.add(LblInstruccionesNivel);

                // CREAMOS Y COLOCAMOS EL BOTON DE VER INSTRUCCIONES
                BtnInstrucciones = new JButton();
                VentanaNivelOro.add(BtnInstrucciones);

                // ASIGNAMOS PROPIEDADES AL ICONO DEL NIVEL
                LblIconoNivel.setBounds(0, 100, 400, 150);
                LblIconoNivel.setIcon(IconoNivel2);

                // ASIGNAMOS PROPIEDADES AL TEXTO DEL NIVEL
                LblNivel.setBounds(10, 270, 380, 40);
                LblNivel.setForeground(Color.decode(Blanco));
                LblNivel.setFont(FuenteMinecraft.deriveFont(27f));

                // ASIGNAMOS PROPIEDADES AL TEXTO CON LAS INSTRUCCIONES
                LblInstruccionesNivel.setBounds(10, 330, 380, 150);
                LblInstruccionesNivel.setForeground(Color.decode(Blanco));
                LblInstruccionesNivel.setFont(FuenteMinecraft.deriveFont(17f));

                // ASIGNAMOS PROPIEDADES AL BOTON DE VER INSTRUCCIONES
                BtnInstrucciones.setBounds(180, 500, 40, 30);
                BtnInstrucciones.setContentAreaFilled(false);
                BtnInstrucciones.setBackground(Color.decode(Negro));
                BtnInstrucciones.setFocusPainted(false);
                BtnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.decode(Negro), 1));
                BtnInstrucciones.setIcon(IconoOcultar2);
                BtnInstrucciones.addActionListener(this);
        }

        public void PanelPreguntasNivelOro1() {
                // CREAMOS Y AGREGAMOS EL PANEL
                Panel1 = new JPanel();
                VentanaNivelOro.add(Panel1);

                // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
                TxtPregunta1 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA #1:</b> SU EFECTO ESPECIAL ES PROPORCIONAR <b style=color:'" + Negro
                                + "'>FATIGA AL MINAR III</b> POR 5 MINUTOS</body></html>";
                LblPregunta1 = new JLabel(TxtPregunta1, JLabel.CENTER);
                Panel1.add(LblPregunta1);
                TxtPregunta2 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA #2:</b> CUAL DE LOS SIGUIENTES ALIMENTOS <b style=color:'" + Negro
                                + "'>LLENA MAS</b> PUNTOS DE HAMBRE</body></html>";
                LblPregunta2 = new JLabel(TxtPregunta2, JLabel.CENTER);
                Panel1.add(LblPregunta2);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 1
                Pregunta1Opcion1 = new JRadioButton("");
                Panel1.add(Pregunta1Opcion1);
                LblPregunta1Opcion1 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta1Opcion1);

                Pregunta1Opcion2 = new JRadioButton();
                Panel1.add(Pregunta1Opcion2);
                LblPregunta1Opcion2 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta1Opcion2);

                Pregunta1Opcion3 = new JRadioButton();
                Panel1.add(Pregunta1Opcion3);
                LblPregunta1Opcion3 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta1Opcion3);

                Pregunta1Opcion4 = new JRadioButton();
                Panel1.add(Pregunta1Opcion4);
                LblPregunta1Opcion4 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta1Opcion4);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 2
                Pregunta2Opcion1 = new JRadioButton();
                Panel1.add(Pregunta2Opcion1);
                LblPregunta2Opcion1 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta2Opcion1);

                Pregunta2Opcion2 = new JRadioButton();
                Panel1.add(Pregunta2Opcion2);
                LblPregunta2Opcion2 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta2Opcion2);

                Pregunta2Opcion3 = new JRadioButton();
                Panel1.add(Pregunta2Opcion3);
                LblPregunta2Opcion3 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta2Opcion3);

                Pregunta2Opcion4 = new JRadioButton();
                Panel1.add(Pregunta2Opcion4);
                LblPregunta2Opcion4 = new JLabel("", JLabel.CENTER);
                Panel1.add(LblPregunta2Opcion4);

                // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 1
                Pregunta1 = new ButtonGroup();
                Pregunta1.add(Pregunta1Opcion1);
                Pregunta1.add(Pregunta1Opcion2);
                Pregunta1.add(Pregunta1Opcion3);
                Pregunta1.add(Pregunta1Opcion4);

                // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 2
                Pregunta2 = new ButtonGroup();
                Pregunta2.add(Pregunta2Opcion1);
                Pregunta2.add(Pregunta2Opcion2);
                Pregunta2.add(Pregunta2Opcion3);
                Pregunta2.add(Pregunta2Opcion4);

                // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
                LblRadio1 = new JLabel();
                Panel1.add(LblRadio1);
                LblRadio2 = new JLabel();
                Panel1.add(LblRadio2);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnSiguiente = new JButton("SIGUIENTE");
                Panel1.add(BtnSiguiente);

                // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
                LblCover = new JLabel();
                Panel1.add(LblCover);
                LblWallpaper = new JLabel();
                Panel1.add(LblWallpaper);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
                Panel1.setLayout(null);
                Panel1.setBounds(400, 30, 900, 700);

                // TITULO EN PREGUNTA 1
                LblPregunta1.setBounds(10, 10, 800, 50);
                LblPregunta1.setOpaque(true);
                LblPregunta1.setBackground(Color.decode(Oro));
                LblPregunta1.setForeground(Color.decode(Verde));
                LblPregunta1.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta1.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 1|| IMAGEN EN OPCION 1 EN PREGUNTA 1
                Pregunta1Opcion1.setBounds(110, 80, 20, 20);
                Pregunta1Opcion1.setContentAreaFilled(false);
                LblPregunta1Opcion1.setBounds(10, 100, 220, 195);
                LblPregunta1Opcion1.setIcon(ImgP1O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 1|| IMAGEN EN OPCION 2 EN PREGUNTA 1
                Pregunta1Opcion2.setBounds(330, 80, 20, 20);
                Pregunta1Opcion2.setContentAreaFilled(false);
                LblPregunta1Opcion2.setBounds(230, 100, 220, 195);
                LblPregunta1Opcion2.setIcon(ImgP1O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 1|| IMAGEN EN OPCION 3 EN PREGUNTA 1
                Pregunta1Opcion3.setBounds(550, 80, 20, 20);
                Pregunta1Opcion3.setContentAreaFilled(false);
                LblPregunta1Opcion3.setBounds(450, 100, 220, 195);
                LblPregunta1Opcion3.setIcon(ImgP1O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 1|| IMAGEN EN OPCION 4 EN PREGUNTA 1
                Pregunta1Opcion4.setBounds(770, 80, 20, 20);
                Pregunta1Opcion4.setContentAreaFilled(false);
                LblPregunta1Opcion4.setBounds(670, 100, 220, 195);
                LblPregunta1Opcion4.setIcon(ImgP1O4Num2);

                // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 1
                LblRadio1.setBounds(10, 70, 880, 225);
                LblRadio1.setOpaque(true);
                LblRadio1.setBackground(new Color(38, 38, 38, 150));
                LblRadio1.setForeground(Color.decode(Blanco));
                LblRadio1.setFont(new Font(Fuente, Font.BOLD, 20));

                // TITULO PREGUNTA 2
                LblPregunta2.setBounds(10, 305, 750, 50);
                LblPregunta2.setOpaque(true);
                LblPregunta2.setBackground(Color.decode(Oro));
                LblPregunta2.setForeground(Color.decode(Verde));
                LblPregunta2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta2.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 2|| IMAGEN EN OPCION 1 EN PREGUNTA 2
                Pregunta2Opcion1.setBounds(110, 375, 20, 20);
                Pregunta2Opcion1.setContentAreaFilled(false);
                LblPregunta2Opcion1.setBounds(10, 395, 220, 195);
                LblPregunta2Opcion1.setIcon(ImgP2O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 2|| IMAGEN EN OPCION 2 EN PREGUNTA 2
                Pregunta2Opcion2.setBounds(330, 375, 20, 20);
                Pregunta2Opcion2.setContentAreaFilled(false);
                LblPregunta2Opcion2.setBounds(230, 395, 220, 195);
                LblPregunta2Opcion2.setIcon(ImgP2O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 2|| IMAGEN EN OPCION 3 EN PREGUNTA 2
                Pregunta2Opcion3.setBounds(550, 375, 20, 20);
                Pregunta2Opcion3.setContentAreaFilled(false);
                LblPregunta2Opcion3.setBounds(450, 395, 220, 195);
                LblPregunta2Opcion3.setIcon(ImgP2O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 2|| IMAGEN EN OPCION 4 EN PREGUNTA 2
                Pregunta2Opcion4.setBounds(770, 375, 20, 20);
                Pregunta2Opcion4.setContentAreaFilled(false);
                LblPregunta2Opcion4.setBounds(670, 395, 220, 195);
                LblPregunta2Opcion4.setIcon(ImgP2O4Num2);

                LblRadio2.setBounds(10, 365, 880, 225);
                LblRadio2.setOpaque(true);
                LblRadio2.setBackground(new Color(38, 38, 38, 150));
                LblRadio2.setForeground(Color.decode(Blanco));
                LblRadio2.setFont(new Font(Fuente, Font.BOLD, 20));

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnSiguiente.setBounds(740, 605, 150, 50);
                BtnSiguiente.setBackground(Color.decode(Oro));
                BtnSiguiente.setForeground(Color.decode(Verde));
                BtnSiguiente.setFocusPainted(false);
                BtnSiguiente.setFont(FuenteMinecraft.deriveFont(15f));
                BtnSiguiente.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                BtnSiguiente.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
                LblCover.setBounds(0, 0, 901, 701);
                LblCover.setOpaque(true);
                LblCover.setBackground(new Color(0, 0, 0, 100));
                LblCover.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

                LblWallpaper.setBounds(0, 0, 900, 700);
                LblWallpaper.setIcon(Wallpaper2);

                VentanaNivelOro.repaint();
        }

        public void PanelPreguntasNivelOro2() {
                Panel2 = new JPanel();
                VentanaNivelOro.add(Panel2);

                // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
                TxtPregunta3 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA #3:</b> UNO DE LOS SIGUIENTES OBJETOS <b style=color:'" + Negro
                                + "'>NO SIRVE</b> COMO COMBUSTIBLE PARA HORNO</body></html>";
                LblPregunta3 = new JLabel(TxtPregunta3, JLabel.CENTER);
                Panel2.add(LblPregunta3);
                TxtPregunta4 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA #4:</b> ES UN BIOMA DE <b style=color:'" + Negro
                                + "'>LLANURA NEVADA</b></body></html>";
                LblPregunta4 = new JLabel(TxtPregunta4, JLabel.CENTER);
                Panel2.add(LblPregunta4);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 3
                Pregunta3Opcion1 = new JRadioButton();
                Panel2.add(Pregunta3Opcion1);
                LblPregunta3Opcion1 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta3Opcion1);

                Pregunta3Opcion2 = new JRadioButton();
                Panel2.add(Pregunta3Opcion2);
                LblPregunta3Opcion2 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta3Opcion2);

                Pregunta3Opcion3 = new JRadioButton();
                Panel2.add(Pregunta3Opcion3);
                LblPregunta3Opcion3 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta3Opcion3);

                Pregunta3Opcion4 = new JRadioButton();
                Panel2.add(Pregunta3Opcion4);
                LblPregunta3Opcion4 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta3Opcion4);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 4
                Pregunta4Opcion1 = new JRadioButton();
                Panel2.add(Pregunta4Opcion1);
                LblPregunta4Opcion1 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta4Opcion1);

                Pregunta4Opcion2 = new JRadioButton();
                Panel2.add(Pregunta4Opcion2);
                LblPregunta4Opcion2 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta4Opcion2);

                Pregunta4Opcion3 = new JRadioButton();
                Panel2.add(Pregunta4Opcion3);
                LblPregunta4Opcion3 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta4Opcion3);

                Pregunta4Opcion4 = new JRadioButton();
                Panel2.add(Pregunta4Opcion4);
                LblPregunta4Opcion4 = new JLabel("", JLabel.CENTER);
                Panel2.add(LblPregunta4Opcion4);

                // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 3
                Pregunta3 = new ButtonGroup();
                Pregunta3.add(Pregunta3Opcion1);
                Pregunta3.add(Pregunta3Opcion2);
                Pregunta3.add(Pregunta3Opcion3);
                Pregunta3.add(Pregunta3Opcion4);

                // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 4
                Pregunta4 = new ButtonGroup();
                Pregunta4.add(Pregunta4Opcion1);
                Pregunta4.add(Pregunta4Opcion2);
                Pregunta4.add(Pregunta4Opcion3);
                Pregunta4.add(Pregunta4Opcion4);

                // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
                LblRadio3 = new JLabel();
                Panel2.add(LblRadio3);
                LblRadio4 = new JLabel();
                Panel2.add(LblRadio4);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnSiguiente2 = new JButton("SIGUIENTE");
                Panel2.add(BtnSiguiente2);

                // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
                LblCover2 = new JLabel();
                Panel2.add(LblCover2);
                LblWallpaper2 = new JLabel();
                Panel2.add(LblWallpaper2);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
                Panel2.setLayout(null);
                Panel2.setBounds(400, 30, 900, 700);

                // TITULO EN PREGUNTA 3
                LblPregunta3.setBounds(10, 10, 820, 50);
                LblPregunta3.setOpaque(true);
                LblPregunta3.setBackground(Color.decode(Oro));
                LblPregunta3.setForeground(Color.decode(Verde));
                LblPregunta3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta3.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 3|| IMAGEN EN OPCION 1 EN PREGUNTA 3
                Pregunta3Opcion1.setBounds(110, 80, 20, 20);
                Pregunta3Opcion1.setContentAreaFilled(false);
                LblPregunta3Opcion1.setBounds(10, 100, 220, 195);
                LblPregunta3Opcion1.setIcon(ImgP3O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 3|| IMAGEN EN OPCION 2 EN PREGUNTA 3
                Pregunta3Opcion2.setBounds(330, 80, 20, 20);
                Pregunta3Opcion2.setContentAreaFilled(false);
                LblPregunta3Opcion2.setBounds(230, 100, 220, 195);
                LblPregunta3Opcion2.setIcon(ImgP3O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 3|| IMAGEN EN OPCION 3 EN PREGUNTA 3
                Pregunta3Opcion3.setBounds(550, 80, 20, 20);
                Pregunta3Opcion3.setContentAreaFilled(false);
                LblPregunta3Opcion3.setBounds(450, 100, 220, 195);
                LblPregunta3Opcion3.setIcon(ImgP3O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 3|| IMAGEN EN OPCION 4 EN PREGUNTA 3
                Pregunta3Opcion4.setBounds(770, 80, 20, 20);
                Pregunta3Opcion4.setContentAreaFilled(false);
                LblPregunta3Opcion4.setBounds(670, 100, 220, 195);
                LblPregunta3Opcion4.setIcon(ImgP3O4Num2);

                // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 1
                LblRadio3.setBounds(10, 70, 880, 225);
                LblRadio3.setOpaque(true);
                LblRadio3.setBackground(new Color(38, 38, 38, 150));

                // TITULO PREGUNTA 4
                LblPregunta4.setBounds(10, 305, 450, 50);
                LblPregunta4.setOpaque(true);
                LblPregunta4.setBackground(Color.decode(Oro));
                LblPregunta4.setForeground(Color.decode(Verde));
                LblPregunta4.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta4.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 4|| IMAGEN EN OPCION 1 EN PREGUNTA 4
                Pregunta4Opcion1.setBounds(110, 375, 20, 20);
                Pregunta4Opcion1.setContentAreaFilled(false);
                LblPregunta4Opcion1.setBounds(10, 395, 220, 195);
                LblPregunta4Opcion1.setIcon(ImgP4O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 4|| IMAGEN EN OPCION 2 EN PREGUNTA 4
                Pregunta4Opcion2.setBounds(330, 375, 20, 20);
                Pregunta4Opcion2.setContentAreaFilled(false);
                LblPregunta4Opcion2.setBounds(230, 395, 220, 195);
                LblPregunta4Opcion2.setIcon(ImgP4O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 4|| IMAGEN EN OPCION 3 EN PREGUNTA 4
                Pregunta4Opcion3.setBounds(550, 375, 20, 20);
                Pregunta4Opcion3.setContentAreaFilled(false);
                LblPregunta4Opcion3.setBounds(450, 395, 220, 195);
                LblPregunta4Opcion3.setIcon(ImgP4O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 4|| IMAGEN EN OPCION 4 EN PREGUNTA 4
                Pregunta4Opcion4.setBounds(770, 375, 20, 20);
                Pregunta4Opcion4.setContentAreaFilled(false);
                LblPregunta4Opcion4.setBounds(670, 395, 220, 195);
                LblPregunta4Opcion4.setIcon(ImgP4O4Num2);

                LblRadio4.setBounds(10, 365, 880, 225);
                LblRadio4.setOpaque(true);
                LblRadio4.setBackground(new Color(38, 38, 38, 150));

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnSiguiente2.setBounds(740, 605, 150, 50);
                BtnSiguiente2.setBackground(Color.decode(Oro));
                BtnSiguiente2.setForeground(Color.decode(Verde));
                BtnSiguiente2.setFocusPainted(false);
                BtnSiguiente2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                BtnSiguiente2.setFont(FuenteMinecraft.deriveFont(15f));
                BtnSiguiente2.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
                LblCover2.setBounds(0, 0, 901, 701);
                LblCover2.setOpaque(true);
                LblCover2.setBackground(new Color(0, 0, 0, 100));
                LblCover2.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

                LblWallpaper2.setBounds(0, 0, 900, 700);
                LblWallpaper2.setIcon(Wallpaper2);
        }

        public void PanelPreguntasNivelOro3() {
                // CREAMOS Y AGREGAMOS EL PANEL
                Panel3 = new JPanel();
                VentanaNivelOro.add(Panel3);

                // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
                TxtPregunta5 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA #5:</b> SELECCIONA LOS INGREDIENTES NECESARIOS PARA CREAR UNA <b style=color:'"
                                + Negro + "'>POCION DE FUERZA</b></body></html>";
                LblPregunta5 = new JLabel(TxtPregunta5, JLabel.CENTER);
                Panel3.add(LblPregunta5);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
                Pregunta5Opcion1 = new JCheckBox();
                Panel3.add(Pregunta5Opcion1);
                LblPregunta5Opcion1 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion1);

                Pregunta5Opcion2 = new JCheckBox();
                Panel3.add(Pregunta5Opcion2);
                LblPregunta5Opcion2 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion2);

                Pregunta5Opcion3 = new JCheckBox();
                Panel3.add(Pregunta5Opcion3);
                LblPregunta5Opcion3 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion3);

                Pregunta5Opcion4 = new JCheckBox();
                Panel3.add(Pregunta5Opcion4);
                LblPregunta5Opcion4 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion4);

                Pregunta5Opcion5 = new JCheckBox();
                Panel3.add(Pregunta5Opcion5);
                LblPregunta5Opcion5 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion5);

                Pregunta5Opcion6 = new JCheckBox();
                Panel3.add(Pregunta5Opcion6);
                LblPregunta5Opcion6 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion6);

                Pregunta5Opcion7 = new JCheckBox();
                Panel3.add(Pregunta5Opcion7);
                LblPregunta5Opcion7 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion7);

                Pregunta5Opcion8 = new JCheckBox();
                Panel3.add(Pregunta5Opcion8);
                LblPregunta5Opcion8 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion8);

                Pregunta5Opcion9 = new JCheckBox();
                Panel3.add(Pregunta5Opcion9);
                LblPregunta5Opcion9 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion9);

                Pregunta5Opcion10 = new JCheckBox();
                Panel3.add(Pregunta5Opcion10);
                LblPregunta5Opcion10 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion10);

                Pregunta5Opcion11 = new JCheckBox();
                Panel3.add(Pregunta5Opcion11);
                LblPregunta5Opcion11 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion11);

                Pregunta5Opcion12 = new JCheckBox();
                Panel3.add(Pregunta5Opcion12);
                LblPregunta5Opcion12 = new JLabel("", JLabel.CENTER);
                Panel3.add(LblPregunta5Opcion12);

                // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
                LblCheckBox5 = new JLabel();
                Panel3.add(LblCheckBox5);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnSiguiente3 = new JButton("SIGUIENTE");
                Panel3.add(BtnSiguiente3);

                // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
                LblCover3 = new JLabel();
                Panel3.add(LblCover3);
                LblWallpaper3 = new JLabel();
                Panel3.add(LblWallpaper3);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
                Panel3.setLayout(null);
                Panel3.setBounds(400, 30, 900, 700);

                // TITULO EN PREGUNTA 5
                LblPregunta5.setBounds(10, 10, 850, 50);
                LblPregunta5.setOpaque(true);
                LblPregunta5.setBackground(Color.decode(Oro));
                LblPregunta5.setForeground(Color.decode(Verde));
                LblPregunta5.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta5.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
                Pregunta5Opcion1.setBounds(110, 80, 20, 20);
                Pregunta5Opcion1.setContentAreaFilled(false);
                Pregunta5Opcion1.addChangeListener(this);
                LblPregunta5Opcion1.setBounds(10, 100, 220, 145);
                LblPregunta5Opcion1.setIcon(ImgP5O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
                Pregunta5Opcion2.setBounds(330, 80, 20, 20);
                Pregunta5Opcion2.setContentAreaFilled(false);
                Pregunta5Opcion2.addChangeListener(this);
                LblPregunta5Opcion2.setBounds(230, 100, 220, 145);
                LblPregunta5Opcion2.setIcon(ImgP5O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
                Pregunta5Opcion3.setBounds(550, 80, 20, 20);
                Pregunta5Opcion3.setContentAreaFilled(false);
                Pregunta5Opcion3.addChangeListener(this);
                LblPregunta5Opcion3.setBounds(450, 100, 220, 145);
                LblPregunta5Opcion3.setIcon(ImgP5O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
                Pregunta5Opcion4.setBounds(770, 80, 20, 20);
                Pregunta5Opcion4.setContentAreaFilled(false);
                Pregunta5Opcion4.addChangeListener(this);
                LblPregunta5Opcion4.setBounds(670, 100, 220, 145);
                LblPregunta5Opcion4.setIcon(ImgP5O4Num2);

                // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
                Pregunta5Opcion5.setBounds(110, 245, 20, 20);
                Pregunta5Opcion5.setContentAreaFilled(false);
                Pregunta5Opcion5.addChangeListener(this);
                LblPregunta5Opcion5.setBounds(10, 265, 220, 145);
                LblPregunta5Opcion5.setIcon(ImgP5O5Num2);

                // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
                Pregunta5Opcion6.setBounds(330, 245, 20, 20);
                Pregunta5Opcion6.setContentAreaFilled(false);
                Pregunta5Opcion6.addChangeListener(this);
                LblPregunta5Opcion6.setBounds(230, 265, 220, 145);
                LblPregunta5Opcion6.setIcon(ImgP5O6Num2);

                // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
                Pregunta5Opcion7.setBounds(550, 245, 20, 20);
                Pregunta5Opcion7.setContentAreaFilled(false);
                Pregunta5Opcion7.addChangeListener(this);
                LblPregunta5Opcion7.setBounds(450, 265, 220, 145);
                LblPregunta5Opcion7.setIcon(ImgP5O7Num2);

                // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
                Pregunta5Opcion8.setBounds(770, 245, 20, 20);
                Pregunta5Opcion8.setContentAreaFilled(false);
                Pregunta5Opcion8.addChangeListener(this);
                LblPregunta5Opcion8.setBounds(670, 265, 220, 145);
                LblPregunta5Opcion8.setIcon(ImgP5O8Num2);

                // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
                Pregunta5Opcion9.setBounds(110, 410, 20, 20);
                Pregunta5Opcion9.setContentAreaFilled(false);
                Pregunta5Opcion9.addChangeListener(this);
                LblPregunta5Opcion9.setBounds(10, 430, 220, 145);
                LblPregunta5Opcion9.setIcon(ImgP5O9Num2);

                // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
                Pregunta5Opcion10.setBounds(330, 410, 20, 20);
                Pregunta5Opcion10.setContentAreaFilled(false);
                Pregunta5Opcion10.addChangeListener(this);
                LblPregunta5Opcion10.setBounds(230, 430, 220, 145);
                LblPregunta5Opcion10.setIcon(ImgP5O10Num2);

                // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
                Pregunta5Opcion11.setBounds(550, 410, 20, 20);
                Pregunta5Opcion11.setContentAreaFilled(false);
                Pregunta5Opcion11.addChangeListener(this);
                LblPregunta5Opcion11.setBounds(450, 430, 220, 145);
                LblPregunta5Opcion11.setIcon(ImgP5O11Num2);

                // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
                Pregunta5Opcion12.setBounds(770, 410, 20, 20);
                Pregunta5Opcion12.setContentAreaFilled(false);
                Pregunta5Opcion12.addChangeListener(this);
                LblPregunta5Opcion12.setBounds(670, 430, 220, 145);
                LblPregunta5Opcion12.setIcon(ImgP5O12Num2);

                // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
                LblCheckBox5.setBounds(10, 70, 880, 520);
                LblCheckBox5.setOpaque(true);
                LblCheckBox5.setBackground(new Color(38, 38, 38, 150));

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnSiguiente3.setBounds(740, 605, 150, 50);
                BtnSiguiente3.setBackground(Color.decode(Oro));
                BtnSiguiente3.setForeground(Color.decode(Verde));
                BtnSiguiente3.setFocusPainted(false);
                BtnSiguiente3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                BtnSiguiente3.setFont(FuenteMinecraft.deriveFont(15f));
                BtnSiguiente3.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
                LblCover3.setBounds(0, 0, 901, 701);
                LblCover3.setOpaque(true);
                LblCover3.setBackground(new Color(0, 0, 0, 100));
                LblCover3.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

                LblWallpaper3.setBounds(0, 0, 900, 700);
                LblWallpaper3.setIcon(Wallpaper2);
        }

        public void PanelPreguntasNivelOro4() {
                // CREAMOS Y AGREGAMOS EL PANEL
                Panel4 = new JPanel();
                VentanaNivelOro.add(Panel4);

                // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
                TxtPregunta6 = "<html><body><b style=color:'" + Negro
                                + "'>PREGUNTA FINAL:</b> SELECCIONA LOS OBJETOS PARA <b style=color:'" + Negro
                                + "'>CRAFTEAR</b> UNA MESA DE ENCANTAMIENTOS</body></html>";
                LblPregunta6 = new JLabel(TxtPregunta6, JLabel.CENTER);
                Panel4.add(LblPregunta6);

                // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
                Pregunta6Opcion1 = new JCheckBox();
                Panel4.add(Pregunta6Opcion1);
                LblPregunta6Opcion1 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion1);

                Pregunta6Opcion2 = new JCheckBox();
                Panel4.add(Pregunta6Opcion2);
                LblPregunta6Opcion2 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion2);

                Pregunta6Opcion3 = new JCheckBox();
                Panel4.add(Pregunta6Opcion3);
                LblPregunta6Opcion3 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion3);

                Pregunta6Opcion4 = new JCheckBox();
                Panel4.add(Pregunta6Opcion4);
                LblPregunta6Opcion4 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion4);

                Pregunta6Opcion5 = new JCheckBox();
                Panel4.add(Pregunta6Opcion5);
                LblPregunta6Opcion5 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion5);

                Pregunta6Opcion6 = new JCheckBox();
                Panel4.add(Pregunta6Opcion6);
                LblPregunta6Opcion6 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion6);

                Pregunta6Opcion7 = new JCheckBox();
                Panel4.add(Pregunta6Opcion7);
                LblPregunta6Opcion7 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion7);

                Pregunta6Opcion8 = new JCheckBox();
                Panel4.add(Pregunta6Opcion8);
                LblPregunta6Opcion8 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion8);

                Pregunta6Opcion9 = new JCheckBox();
                Panel4.add(Pregunta6Opcion9);
                LblPregunta6Opcion9 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion9);

                Pregunta6Opcion10 = new JCheckBox();
                Panel4.add(Pregunta6Opcion10);
                LblPregunta6Opcion10 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion10);

                Pregunta6Opcion11 = new JCheckBox();
                Panel4.add(Pregunta6Opcion11);
                LblPregunta6Opcion11 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion11);

                Pregunta6Opcion12 = new JCheckBox();
                Panel4.add(Pregunta6Opcion12);
                LblPregunta6Opcion12 = new JLabel("", JLabel.CENTER);
                Panel4.add(LblPregunta6Opcion12);

                // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
                LblCheckBox6 = new JLabel();
                Panel4.add(LblCheckBox6);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnFinalizar = new JButton("FINALIZAR NIVEL");
                Panel4.add(BtnFinalizar);

                // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
                LblCover4 = new JLabel();
                Panel4.add(LblCover4);
                LblWallpaper4 = new JLabel();
                Panel4.add(LblWallpaper4);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
                Panel4.setLayout(null);
                Panel4.setBounds(400, 30, 900, 700);

                // TITULO EN PREGUNTA 5
                LblPregunta6.setBounds(10, 10, 825, 50);
                LblPregunta6.setOpaque(true);
                LblPregunta6.setBackground(Color.decode(Oro));
                LblPregunta6.setForeground(Color.decode(Verde));
                LblPregunta6.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta6.setFont(FuenteMinecraft.deriveFont(15f));

                // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
                Pregunta6Opcion1.setBounds(110, 80, 20, 20);
                Pregunta6Opcion1.setContentAreaFilled(false);
                Pregunta6Opcion1.addChangeListener(this);
                LblPregunta6Opcion1.setBounds(10, 100, 220, 145);
                LblPregunta6Opcion1.setIcon(ImgP6O1Num2);

                // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
                Pregunta6Opcion2.setBounds(330, 80, 20, 20);
                Pregunta6Opcion2.setContentAreaFilled(false);
                Pregunta6Opcion2.addChangeListener(this);
                LblPregunta6Opcion2.setBounds(230, 100, 220, 145);
                LblPregunta6Opcion2.setIcon(ImgP6O2Num2);

                // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
                Pregunta6Opcion3.setBounds(550, 80, 20, 20);
                Pregunta6Opcion3.setContentAreaFilled(false);
                Pregunta6Opcion3.addChangeListener(this);
                LblPregunta6Opcion3.setBounds(450, 100, 220, 145);
                LblPregunta6Opcion3.setIcon(ImgP6O3Num2);

                // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
                Pregunta6Opcion4.setBounds(770, 80, 20, 20);
                Pregunta6Opcion4.setContentAreaFilled(false);
                Pregunta6Opcion4.addChangeListener(this);
                LblPregunta6Opcion4.setBounds(670, 100, 220, 145);
                LblPregunta6Opcion4.setIcon(ImgP6O4Num2);

                // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
                Pregunta6Opcion5.setBounds(110, 245, 20, 20);
                Pregunta6Opcion5.setContentAreaFilled(false);
                Pregunta6Opcion5.addChangeListener(this);
                LblPregunta6Opcion5.setBounds(10, 265, 220, 145);
                LblPregunta6Opcion5.setIcon(ImgP6O5Num2);

                // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
                Pregunta6Opcion6.setBounds(330, 245, 20, 20);
                Pregunta6Opcion6.setContentAreaFilled(false);
                Pregunta6Opcion6.addChangeListener(this);
                LblPregunta6Opcion6.setBounds(230, 265, 220, 145);
                LblPregunta6Opcion6.setIcon(ImgP6O6Num2);

                // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
                Pregunta6Opcion7.setBounds(550, 245, 20, 20);
                Pregunta6Opcion7.setContentAreaFilled(false);
                Pregunta6Opcion7.addChangeListener(this);
                LblPregunta6Opcion7.setBounds(450, 265, 220, 145);
                LblPregunta6Opcion7.setIcon(ImgP6O7Num2);

                // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
                Pregunta6Opcion8.setBounds(770, 245, 20, 20);
                Pregunta6Opcion8.setContentAreaFilled(false);
                Pregunta6Opcion8.addChangeListener(this);
                LblPregunta6Opcion8.setBounds(670, 265, 220, 145);
                LblPregunta6Opcion8.setIcon(ImgP6O8Num2);

                // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
                Pregunta6Opcion9.setBounds(110, 410, 20, 20);
                Pregunta6Opcion9.setContentAreaFilled(false);
                Pregunta6Opcion9.addChangeListener(this);
                LblPregunta6Opcion9.setBounds(10, 430, 220, 145);
                LblPregunta6Opcion9.setIcon(ImgP6O9Num2);

                // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
                Pregunta6Opcion10.setBounds(330, 410, 20, 20);
                Pregunta6Opcion10.setContentAreaFilled(false);
                Pregunta6Opcion10.addChangeListener(this);
                LblPregunta6Opcion10.setBounds(230, 430, 220, 145);
                LblPregunta6Opcion10.setIcon(ImgP6O10Num2);

                // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
                Pregunta6Opcion11.setBounds(550, 410, 20, 20);
                Pregunta6Opcion11.setContentAreaFilled(false);
                Pregunta6Opcion11.addChangeListener(this);
                LblPregunta6Opcion11.setBounds(450, 430, 220, 145);
                LblPregunta6Opcion11.setIcon(ImgP6O11Num2);

                // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
                Pregunta6Opcion12.setBounds(770, 410, 20, 20);
                Pregunta6Opcion12.setContentAreaFilled(false);
                Pregunta6Opcion12.addChangeListener(this);
                LblPregunta6Opcion12.setBounds(670, 430, 220, 145);
                LblPregunta6Opcion12.setIcon(ImgP6O12Num2);

                // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
                LblCheckBox6.setBounds(10, 70, 880, 520);
                LblCheckBox6.setOpaque(true);
                LblCheckBox6.setBackground(new Color(38, 38, 38, 150));

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnFinalizar.setBounds(690, 605, 200, 50);
                BtnFinalizar.setBackground(Color.decode(Oro));
                BtnFinalizar.setForeground(Color.decode(Verde));
                BtnFinalizar.setFocusPainted(false);
                BtnFinalizar.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                BtnFinalizar.setFont(FuenteMinecraft.deriveFont(15f));
                BtnFinalizar.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
                LblCover4.setBounds(0, 0, 901, 701);
                LblCover4.setOpaque(true);
                LblCover4.setBackground(new Color(0, 0, 0, 100));
                LblCover4.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

                LblWallpaper4.setBounds(0, 0, 900, 700);
                LblWallpaper4.setIcon(Wallpaper2);
        }

        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == BtnSiguiente) {
                        if (Pregunta1Opcion3.isSelected()) {
                                PuntajeNivelOro++;
                        }
                        if (Pregunta2Opcion1.isSelected()) {
                                PuntajeNivelOro++;
                        }
                        Panel1.setVisible(false);
                        PanelPreguntasNivelOro2();
                }
                if (e.getSource() == BtnSiguiente2) {
                        if (Pregunta3Opcion3.isSelected()) {
                                PuntajeNivelOro++;
                        }
                        if (Pregunta4Opcion4.isSelected()) {
                                PuntajeNivelOro++;
                        }
                        Panel2.setVisible(false);
                        PanelPreguntasNivelOro3();
                }
                if (e.getSource() == BtnSiguiente3) {
                        if (Pregunta5Opcion4.isSelected() == true && Pregunta5Opcion5.isSelected() == true
                                        && Pregunta5Opcion11.isSelected() == true
                                        && Pregunta5Opcion1.isSelected() == false
                                        && Pregunta5Opcion2.isSelected() == false
                                        && Pregunta5Opcion3.isSelected() == false
                                        && Pregunta5Opcion6.isSelected() == false
                                        && Pregunta5Opcion7.isSelected() == false
                                        && Pregunta5Opcion8.isSelected() == false
                                        && Pregunta5Opcion9.isSelected() == false
                                        && Pregunta5Opcion10.isSelected() == false
                                        && Pregunta5Opcion12.isSelected() == false) {
                                PuntajeNivelOro++;
                                Panel3.setVisible(false);
                                PanelPreguntasNivelOro4();
                        } else {
                                Panel3.setVisible(false);
                                PanelPreguntasNivelOro4();
                        }
                }
                if (e.getSource() == BtnFinalizar) {
                        if (Pregunta6Opcion1.isSelected() == true && Pregunta6Opcion7.isSelected() == true
                                        && Pregunta6Opcion10.isSelected() == true
                                        && Pregunta6Opcion2.isSelected() == false
                                        && Pregunta6Opcion3.isSelected() == false
                                        && Pregunta6Opcion4.isSelected() == false
                                        && Pregunta6Opcion5.isSelected() == false
                                        && Pregunta6Opcion6.isSelected() == false
                                        && Pregunta6Opcion8.isSelected() == false
                                        && Pregunta6Opcion9.isSelected() == false
                                        && Pregunta6Opcion11.isSelected() == false
                                        && Pregunta6Opcion12.isSelected() == false) {
                                PuntajeNivelOro++;
                                VentanaNivelOro.setVisible(false);
                                CargandoNivel CN = new CargandoNivel();
                                CN.VentanaCargandoNivel();
                                CN.AnimacionCargando("Oro");

                        } else {
                                VentanaNivelOro.setVisible(false);
                                CargandoNivel CN = new CargandoNivel();
                                CN.VentanaCargandoNivel();
                                CN.AnimacionCargando("Oro");
                        }
                }
                if (e.getSource() == BtnInstrucciones) {
                        if (m == 1) {
                                LblInstruccionesNivel.setVisible(false);
                                BtnInstrucciones.setBounds(180, 330, 40, 30);
                                BtnInstrucciones.setIcon(IconoMostrar2);
                                m = 0;
                        } else {
                                LblInstruccionesNivel.setVisible(true);
                                BtnInstrucciones.setBounds(180, 500, 40, 30);
                                BtnInstrucciones.setIcon(IconoOcultar2);
                                m = 1;
                        }
                }
        }

        public void stateChanged(ChangeEvent e) {
                if (e.getSource() == Pregunta5Opcion1) {
                        if (Pregunta5Opcion1.isSelected() == true) {
                                Pregunta5Opcion1.setContentAreaFilled(true);
                                Pregunta5Opcion1.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion1.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion2) {
                        if (Pregunta5Opcion2.isSelected() == true) {
                                Pregunta5Opcion2.setContentAreaFilled(true);
                                Pregunta5Opcion2.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion2.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion3) {
                        if (Pregunta5Opcion3.isSelected() == true) {
                                Pregunta5Opcion3.setContentAreaFilled(true);
                                Pregunta5Opcion3.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion3.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion4) {
                        if (Pregunta5Opcion4.isSelected() == true) {
                                Pregunta5Opcion4.setContentAreaFilled(true);
                                Pregunta5Opcion4.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion4.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion5) {
                        if (Pregunta5Opcion5.isSelected() == true) {
                                Pregunta5Opcion5.setContentAreaFilled(true);
                                Pregunta5Opcion5.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion5.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion6) {
                        if (Pregunta5Opcion6.isSelected() == true) {
                                Pregunta5Opcion6.setContentAreaFilled(true);
                                Pregunta5Opcion6.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion6.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion7) {
                        if (Pregunta5Opcion7.isSelected() == true) {
                                Pregunta5Opcion7.setContentAreaFilled(true);
                                Pregunta5Opcion7.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion7.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion8) {
                        if (Pregunta5Opcion8.isSelected() == true) {
                                Pregunta5Opcion8.setContentAreaFilled(true);
                                Pregunta5Opcion8.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion8.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion9) {
                        if (Pregunta5Opcion9.isSelected() == true) {
                                Pregunta5Opcion9.setContentAreaFilled(true);
                                Pregunta5Opcion9.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion9.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion10) {
                        if (Pregunta5Opcion10.isSelected() == true) {
                                Pregunta5Opcion10.setContentAreaFilled(true);
                                Pregunta5Opcion10.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion10.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion11) {
                        if (Pregunta5Opcion11.isSelected() == true) {
                                Pregunta5Opcion11.setContentAreaFilled(true);
                                Pregunta5Opcion11.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion11.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta5Opcion12) {
                        if (Pregunta5Opcion12.isSelected() == true) {
                                Pregunta5Opcion12.setContentAreaFilled(true);
                                Pregunta5Opcion12.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta5Opcion12.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion1) {
                        if (Pregunta6Opcion1.isSelected() == true) {
                                Pregunta6Opcion1.setContentAreaFilled(true);
                                Pregunta6Opcion1.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion1.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion2) {
                        if (Pregunta6Opcion2.isSelected() == true) {
                                Pregunta6Opcion2.setContentAreaFilled(true);
                                Pregunta6Opcion2.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion2.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion3) {
                        if (Pregunta6Opcion3.isSelected() == true) {
                                Pregunta6Opcion3.setContentAreaFilled(true);
                                Pregunta6Opcion3.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion3.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion4) {
                        if (Pregunta6Opcion4.isSelected() == true) {
                                Pregunta6Opcion4.setContentAreaFilled(true);
                                Pregunta6Opcion4.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion4.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion5) {
                        if (Pregunta6Opcion5.isSelected() == true) {
                                Pregunta6Opcion5.setContentAreaFilled(true);
                                Pregunta6Opcion5.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion5.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion6) {
                        if (Pregunta6Opcion6.isSelected() == true) {
                                Pregunta6Opcion6.setContentAreaFilled(true);
                                Pregunta6Opcion6.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion6.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion7) {
                        if (Pregunta6Opcion7.isSelected() == true) {
                                Pregunta6Opcion7.setContentAreaFilled(true);
                                Pregunta6Opcion7.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion7.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion8) {
                        if (Pregunta6Opcion8.isSelected() == true) {
                                Pregunta6Opcion8.setContentAreaFilled(true);
                                Pregunta6Opcion8.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion8.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion9) {
                        if (Pregunta6Opcion9.isSelected() == true) {
                                Pregunta6Opcion9.setContentAreaFilled(true);
                                Pregunta6Opcion9.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion9.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion10) {
                        if (Pregunta6Opcion10.isSelected() == true) {
                                Pregunta6Opcion10.setContentAreaFilled(true);
                                Pregunta6Opcion10.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion10.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion11) {
                        if (Pregunta6Opcion11.isSelected() == true) {
                                Pregunta6Opcion11.setContentAreaFilled(true);
                                Pregunta6Opcion11.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion11.setContentAreaFilled(false);
                        }
                }
                if (e.getSource() == Pregunta6Opcion12) {
                        if (Pregunta6Opcion12.isSelected() == true) {
                                Pregunta6Opcion12.setContentAreaFilled(true);
                                Pregunta6Opcion12.setBackground(Color.decode(Oro));
                        } else {
                                Pregunta6Opcion12.setContentAreaFilled(false);
                        }
                }
        }

}

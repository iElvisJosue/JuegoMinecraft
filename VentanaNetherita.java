import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaNetherita extends JFrame implements ActionListener {

        private JFrame VentanaNivelNetherita;
        private DragMouseAdapter Arrastrar;
        private JPanel Panel1, Panel2, Panel3, Panel4;
        private JTextField Pregunta5, Pregunta6, Pregunta7, Pregunta8;
        private Image IconoNivel, IconoMostrar, IconoOcultar, Wallpaper, P1I1, P1I2, P1I3,
                        P1I4, P1I5, P1I6, P1I7, P1I8, P1I9, P1I10, P1I11, P1I12, P1I13, P2I1, P2I2, P2I3,
                        P2I4, P2I5, P2I6, P2I7, P2I8, P2I9, P2I10, P2I11, P2I12, P3I1, P3I2, P3I3,
                        P3I4, P3I5, P3I6, P3I7, P3I8, P3I9, P3I10, P3I11, P3I12, P4I1, P4I2, P4I3,
                        P4I4, P4I5, P4I6, P4I7, P4I8, P4I9, P4I10, P4I11, P4I12;
        private ImageIcon IconoNivel2, IconoMostrar2, IconoOcultar2, Wallpaper2, P1I1Num2, P1I2Num2, P1I3Num2,
                        P1I4Num2, P1I5Num2, P1I6Num2, P1I7Num2, P1I8Num2, P1I9Num2, P1I10Num2, P1I11Num2, P1I12Num2,
                        P1I13Num2,
                        P2I1Num2, P2I2Num2, P2I3Num2, P2I4Num2, P2I5Num2, P2I6Num2, P2I7Num2, P2I8Num2, P2I9Num2,
                        P2I10Num2,
                        P2I11Num2, P2I12Num2, P3I1Num2, P3I2Num2, P3I3Num2, P3I4Num2, P3I5Num2, P3I6Num2, P3I7Num2,
                        P3I8Num2,
                        P3I9Num2, P3I10Num2, P3I11Num2, P3I12Num2, P4I1Num2, P4I2Num2, P4I3Num2, P4I4Num2, P4I5Num2,
                        P4I6Num2,
                        P4I7Num2, P4I8Num2, P4I9Num2, P4I10Num2, P4I11Num2, P4I12Num2;
        private Font FuenteMinecraft;
        private JProgressBar BarraNivelNetherita;
        private JButton BtnInstrucciones, BtnNetherita, BtnNetherita2, BtnNetherita3, BtnNetherita4, BtnFinalizar,
                        BtnMesa1, BtnMesa2, BtnMesa3, BtnMesa4, BtnMesa5, BtnMesa6, BtnMesa7, BtnMesa8, BtnMesa9;
        private JLabel LblIconoNivel, LblNivel, LblInstruccionesNivel, LblPregunta1, LblPregunta1BG, LblPregunta5,
                        LblPregunta6, LblPregunta7, LblPregunta8, LblCover, LblWallpaper, LblScoreCobre, LblScoreHierro,
                        LblScoreOro, LblScoreEsmeralda, LblScoreDiamante, CrafteoItem1, CrafteoItem2, CrafteoItem3,
                        CrafteoItem4,
                        CrafteoItem5, CrafteoItem6, CrafteoItem7, CrafteoItem8, CrafteoItem9, CrafteoItem10,
                        CrafteoItem11,
                        CrafteoItem12, CrafteoItem13;
        private String TxtNivel = "", TxtInstruccionesNivel = "", TxtPregunta1 = "", TxtPregunta2 = "",
                        TxtPregunta3 = "",
                        TxtPregunta4 = "", TxtPregunta5 = "", TxtPregunta6 = "", TxtPregunta7 = "", TxtPregunta8 = "",
                        Negro = "",
                        Blanco = "", Netherita = "", Oro = "", Rojo = "",
                        RespuestaP5 = "GAMERULE DODAYLIGHTCYCLE FALSE",
                        RespuestaP6 = "GAMEMODE 3", RespuestaP7 = "GAMERULE DOWEATHERCYCLE FALSE",
                        RespuestaP8 = "TIME SET 18000";
        private int m = 1, te = 210, PuntajeNivelCobre = 0, PuntajeNivelHierro = 0, PuntajeNivelOro = 0,
                        PuntajeNivelEsmeralda = 0, PuntajeNivelDiamante = 0, Item1 = 0,
                        Item2 = 0,
                        Item3 = 0, Item4 = 0, Item5 = 0, Item6 = 0, Item7 = 0, Item8 = 0, Item9 = 0, Item10 = 0,
                        Item11 = 0,
                        Item12 = 0, Item13 = 0, Mesa1 = 0, Mesa2 = 0, Mesa3 = 0, Mesa4 = 0, Mesa5 = 0, Mesa6 = 0,
                        Mesa7 = 0,
                        Mesa8 = 0, Mesa9 = 0;
        public static int PuntajeNivelNetherita = 0;

        public void CreandoVentanaNivelNetherita() {
                // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL NETHERITA
                PersonalizarPlantillaNetherita();

                // GUARDANAMOS NUESTRAS IMAGENES
                AlmacenarImagenesNivelNetherita();

                // COLOCAMOS LOS PUNTAJES EN EL SCOREBOARD
                ScoreBoardNetherita();

                // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
                CrearSidebarLeftNetherita();

                // CREAMOS NUESTROS PANELES PRINCIPALES
                CreacionDePanelesPrincipales();

                // CREAMOS NUESTRO PANEL DE LAS PRIMERAS PREGUNTAS
                PanelMesaCrafteo1();

                // INICIAMOS NUESTRO CRONOMETRO
                CronometroNetherita();
        }

        public void PersonalizarPlantillaNetherita() {
                // INSTANCIAMOS LA CLASE DE NUESTRA PLANTILLA GENERAL
                PlantillaGeneral plantillaGeneralParaNivelNetherita = new PlantillaGeneral();

                // OBTENEMOS LA PLANTILLA Y LA AGREAMOS A NUESTRO JFRAME
                VentanaNivelNetherita = plantillaGeneralParaNivelNetherita.CreandoPlantillaGeneral();

                // OBTENEMOS Y ALMACENAMOS LOS COLORES Y FUENTE A UTILIZAR
                FuenteMinecraft = plantillaGeneralParaNivelNetherita.FuenteMinecraft;
                Negro = plantillaGeneralParaNivelNetherita.Negro;
                Blanco = plantillaGeneralParaNivelNetherita.Blanco;
                Netherita = plantillaGeneralParaNivelNetherita.Netherita;
                Oro = plantillaGeneralParaNivelNetherita.Oro;
                Rojo = plantillaGeneralParaNivelNetherita.Rojo;

                // ASIGNAMOS EL ICONO A NUESTRA VENTANA
                VentanaNivelNetherita.setIconImage(
                                new ImageIcon(getClass().getResource("ImgNivelNetherita/Netherita.png")).getImage());

                // OBTENEMOS EL PUNTAJE DEL NIVEL COBRE/HIERRO/ORO/ESMERALDA
                LblScoreCobre = plantillaGeneralParaNivelNetherita.LblScoreCobre4;
                LblScoreHierro = plantillaGeneralParaNivelNetherita.LblScoreHierro4;
                LblScoreOro = plantillaGeneralParaNivelNetherita.LblScoreOro4;
                LblScoreEsmeralda = plantillaGeneralParaNivelNetherita.LblScoreEsmeralda4;
                LblScoreDiamante = plantillaGeneralParaNivelNetherita.LblScoreDiamante4;
        }

        public void AlmacenarImagenesNivelNetherita() {
                // GUARDAMOS LA IMAGEN DEL NIVEL NETHERITA
                IconoNivel = new ImageIcon("ImgNivelNetherita/Netherita.png").getImage();
                IconoNivel2 = new ImageIcon(IconoNivel.getScaledInstance(135, 115,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE ICONO MOSTRAR
                IconoMostrar = new ImageIcon("ImgNivelNetherita/Mostrar.png").getImage();
                IconoMostrar2 = new ImageIcon(IconoMostrar.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ICONO OCULTAR
                IconoOcultar = new ImageIcon("ImgNivelNetherita/Ocultar.png").getImage();
                IconoOcultar2 = new ImageIcon(IconoOcultar.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 1 EN PREGUNTA 1
                P1I1 = new ImageIcon("ImgNivelNetherita/Pregunta1/ChampiñonRojo.png").getImage();
                P1I1Num2 = new ImageIcon(P1I1.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 2 EN PREGUNTA 1
                P1I2 = new ImageIcon("ImgNivelNetherita/Pregunta1/Remolacha.png").getImage();
                P1I2Num2 = new ImageIcon(P1I2.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 3 EN PREGUNTA 1
                P1I3 = new ImageIcon("ImgNivelNetherita/Pregunta1/Sopa.png").getImage();
                P1I3Num2 = new ImageIcon(P1I3.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 4 EN PREGUNTA 1
                P1I4 = new ImageIcon("ImgNivelNetherita/Pregunta1/Zanahoria.png").getImage();
                P1I4Num2 = new ImageIcon(P1I4.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 5 EN PREGUNTA 1
                P1I5 = new ImageIcon("ImgNivelNetherita/Pregunta1/ConejoCrudo.png").getImage();
                P1I5Num2 = new ImageIcon(P1I5.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 6 EN PREGUNTA 1
                P1I6 = new ImageIcon("ImgNivelNetherita/Pregunta1/Patata.png").getImage();
                P1I6Num2 = new ImageIcon(P1I6.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 7 EN PREGUNTA 1
                P1I7 = new ImageIcon("ImgNivelNetherita/Pregunta1/ConejoCocinado.png").getImage();
                P1I7Num2 = new ImageIcon(P1I7.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 8 EN PREGUNTA 1
                P1I8 = new ImageIcon("ImgNivelNetherita/Pregunta1/PolloCocinado.png").getImage();
                P1I8Num2 = new ImageIcon(P1I8.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 9 EN PREGUNTA 1
                P1I9 = new ImageIcon("ImgNivelNetherita/Pregunta1/ZanahoriaDorada.png").getImage();
                P1I9Num2 = new ImageIcon(P1I9.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 10 EN PREGUNTA 1
                P1I10 = new ImageIcon("ImgNivelNetherita/Pregunta1/Cuenco.png").getImage();
                P1I10Num2 = new ImageIcon(P1I10.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 11 EN PREGUNTA 1
                P1I11 = new ImageIcon("ImgNivelNetherita/Pregunta1/PataDeConejo.png").getImage();
                P1I11Num2 = new ImageIcon(P1I11.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 12 EN PREGUNTA 1
                P1I12 = new ImageIcon("ImgNivelNetherita/Pregunta1/PatataCocida.png").getImage();
                P1I12Num2 = new ImageIcon(P1I12.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 13 EN PREGUNTA 1
                P1I13 = new ImageIcon("ImgNivelNetherita/Pregunta1/Invisible.png").getImage();
                P1I13Num2 = new ImageIcon(P1I13.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 1 EN PREGUNTA 2
                P2I1 = new ImageIcon("ImgNivelNetherita/Pregunta2/Zanahoria.png").getImage();
                P2I1Num2 = new ImageIcon(P2I1.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 2 EN PREGUNTA 2
                P2I2 = new ImageIcon("ImgNivelNetherita/Pregunta2/Trigo.png").getImage();
                P2I2Num2 = new ImageIcon(P2I2.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 3 EN PREGUNTA 2
                P2I3 = new ImageIcon("ImgNivelNetherita/Pregunta2/SemillaCacao.png").getImage();
                P2I3Num2 = new ImageIcon(P2I3.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 4 EN PREGUNTA 2
                P2I4 = new ImageIcon("ImgNivelNetherita/Pregunta2/PolvoDeHueso.png").getImage();
                P2I4Num2 = new ImageIcon(P2I4.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 5 EN PREGUNTA 2
                P2I5 = new ImageIcon("ImgNivelNetherita/Pregunta2/Pan.png").getImage();
                P2I5Num2 = new ImageIcon(P2I5.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 6 EN PREGUNTA 2
                P2I6 = new ImageIcon("ImgNivelNetherita/Pregunta2/Leche.png").getImage();
                P2I6Num2 = new ImageIcon(P2I6.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 7 EN PREGUNTA 2
                P2I7 = new ImageIcon("ImgNivelNetherita/Pregunta2/Huevo.png").getImage();
                P2I7Num2 = new ImageIcon(P2I7.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 8 EN PREGUNTA 2
                P2I8 = new ImageIcon("ImgNivelNetherita/Pregunta2/Azucar.png").getImage();
                P2I8Num2 = new ImageIcon(P2I8.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 9 EN PREGUNTA 2
                P2I9 = new ImageIcon("ImgNivelNetherita/Pregunta2/ChampiñonMarron.png").getImage();
                P2I9Num2 = new ImageIcon(P2I9.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 10 EN PREGUNTA 2
                P2I10 = new ImageIcon("ImgNivelNetherita/Pregunta2/Cuenco.png").getImage();
                P2I10Num2 = new ImageIcon(P2I10.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 11 EN PREGUNTA 2
                P2I11 = new ImageIcon("ImgNivelNetherita/Pregunta2/Galleta.png").getImage();
                P2I11Num2 = new ImageIcon(P2I11.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 12 EN PREGUNTA 2
                P2I12 = new ImageIcon("ImgNivelNetherita/Pregunta2/Agua.png").getImage();
                P2I12Num2 = new ImageIcon(P2I12.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 1 EN PREGUNTA 3
                P3I1 = new ImageIcon("ImgNivelNetherita/Pregunta3/Glowstone.png").getImage();
                P3I1Num2 = new ImageIcon(P3I1.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 2 EN PREGUNTA 3
                P3I2 = new ImageIcon("ImgNivelNetherita/Pregunta3/CargaIgnea.png").getImage();
                P3I2Num2 = new ImageIcon(P3I2.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 3 EN PREGUNTA 3
                P3I3 = new ImageIcon("ImgNivelNetherita/Pregunta3/Cuarzo.png").getImage();
                P3I3Num2 = new ImageIcon(P3I3.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 4 EN PREGUNTA 3
                P3I4 = new ImageIcon("ImgNivelNetherita/Pregunta3/Dinamita.png").getImage();
                P3I4Num2 = new ImageIcon(P3I4.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 5 EN PREGUNTA 3
                P3I5 = new ImageIcon("ImgNivelNetherita/Pregunta3/Fuerza.png").getImage();
                P3I5Num2 = new ImageIcon(P3I5.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 6 EN PREGUNTA 3
                P3I6 = new ImageIcon("ImgNivelNetherita/Pregunta3/Carbon.png").getImage();
                P3I6Num2 = new ImageIcon(P3I6.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 7 EN PREGUNTA 3
                P3I7 = new ImageIcon("ImgNivelNetherita/Pregunta3/LagrimaDeGhast.png").getImage();
                P3I7Num2 = new ImageIcon(P3I7.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 8 EN PREGUNTA 3
                P3I8 = new ImageIcon("ImgNivelNetherita/Pregunta3/Magma.png").getImage();
                P3I8Num2 = new ImageIcon(P3I8.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 9 EN PREGUNTA 3
                P3I9 = new ImageIcon("ImgNivelNetherita/Pregunta3/Polvora.png").getImage();
                P3I9Num2 = new ImageIcon(P3I9.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 10 EN PREGUNTA 3
                P3I10 = new ImageIcon("ImgNivelNetherita/Pregunta3/Redstone.png").getImage();
                P3I10Num2 = new ImageIcon(P3I10.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 11 EN PREGUNTA 3
                P3I11 = new ImageIcon("ImgNivelNetherita/Pregunta3/SandiaLuminosa.png").getImage();
                P3I11Num2 = new ImageIcon(P3I11.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 12 EN PREGUNTA 3
                P3I12 = new ImageIcon("ImgNivelNetherita/Pregunta3/Slime.png").getImage();
                P3I12Num2 = new ImageIcon(P3I12.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 1 EN PREGUNTA 4
                P4I1 = new ImageIcon("ImgNivelNetherita/Pregunta4/Antorcha.png").getImage();
                P4I1Num2 = new ImageIcon(P4I1.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 2 EN PREGUNTA 4
                P4I2 = new ImageIcon("ImgNivelNetherita/Pregunta4/Arena.png").getImage();
                P4I2Num2 = new ImageIcon(P4I2.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 3 EN PREGUNTA 4
                P4I3 = new ImageIcon("ImgNivelNetherita/Pregunta4/AntorchaRedstone.png").getImage();
                P4I3Num2 = new ImageIcon(P4I3.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 4 EN PREGUNTA 4
                P4I4 = new ImageIcon("ImgNivelNetherita/Pregunta4/Hierro.png").getImage();
                P4I4Num2 = new ImageIcon(P4I4.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 5 EN PREGUNTA 4
                P4I5 = new ImageIcon("ImgNivelNetherita/Pregunta4/Palanca.png").getImage();
                P4I5Num2 = new ImageIcon(P4I5.getScaledInstance(60, 50,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 6 EN PREGUNTA 4
                P4I6 = new ImageIcon("ImgNivelNetherita/Pregunta4/Piedra.png").getImage();
                P4I6Num2 = new ImageIcon(P4I6.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 7 EN PREGUNTA 4
                P4I7 = new ImageIcon("ImgNivelNetherita/Pregunta4/Rail.png").getImage();
                P4I7Num2 = new ImageIcon(P4I7.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 8 EN PREGUNTA 4
                P4I8 = new ImageIcon("ImgNivelNetherita/Pregunta4/Repetidor.png").getImage();
                P4I8Num2 = new ImageIcon(P4I8.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 9 EN PREGUNTA 4
                P4I9 = new ImageIcon("ImgNivelNetherita/Pregunta4/Redstone.png").getImage();
                P4I9Num2 = new ImageIcon(P4I9.getScaledInstance(40, 30,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 10 EN PREGUNTA 4
                P4I10 = new ImageIcon("ImgNivelNetherita/Pregunta4/RailPropulsor.png").getImage();
                P4I10Num2 = new ImageIcon(P4I10.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 11 EN PREGUNTA 4
                P4I11 = new ImageIcon("ImgNivelNetherita/Pregunta4/Roca.png").getImage();
                P4I11Num2 = new ImageIcon(P4I11.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DEL ITEM 12 EN PREGUNTA 4
                P4I12 = new ImageIcon("ImgNivelNetherita/Pregunta4/Tierra.png").getImage();
                P4I12Num2 = new ImageIcon(P4I12.getScaledInstance(50, 40,
                                Image.SCALE_SMOOTH));

                // GUARDAMOS LA IMAGEN DE NUESTRO BACKGROUND
                Wallpaper = new ImageIcon("ImgNivelNetherita/Wallpaper.jpg").getImage();
                Wallpaper2 = new ImageIcon(
                                Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
        }

        public void ScoreBoardNetherita() {
                VentanaCobre VC = new VentanaCobre();
                VentanaHierro VH = new VentanaHierro();
                VentanaOro VO = new VentanaOro();
                VentanaEsmeralda VE = new VentanaEsmeralda();
                VentanaDiamante VD = new VentanaDiamante();
                PuntajeNivelCobre = VC.PuntajeNivelCobre;
                PuntajeNivelHierro = VH.PuntajeNivelHierro;
                PuntajeNivelOro = VO.PuntajeNivelOro;
                PuntajeNivelEsmeralda = VE.PuntajeNivelEsmeralda;
                PuntajeNivelDiamante = VD.PuntajeNivelDiamante;
                LblScoreCobre.setText(PuntajeNivelCobre + " DE 5");
                LblScoreHierro.setText(PuntajeNivelHierro + " DE 6");
                LblScoreOro.setText(PuntajeNivelOro + " DE 6");
                LblScoreEsmeralda.setText(PuntajeNivelEsmeralda + " DE 4");
                LblScoreDiamante.setText(PuntajeNivelDiamante + " DE 6");
        }

        public void CrearSidebarLeftNetherita() {
                // CREAMOS Y COLOCAMOS EL ICONO DEL NIVEL
                LblIconoNivel = new JLabel("", JLabel.CENTER);
                VentanaNivelNetherita.add(LblIconoNivel);

                // CREAMOS Y COLOCAMOS EL TEXTO DEL NIVEL
                TxtNivel = "<html><body>NIVEL 6 <b style=color:'" + Netherita + "'>Netherita</b></body></html>";
                LblNivel = new JLabel(TxtNivel, JLabel.CENTER);
                VentanaNivelNetherita.add(LblNivel);

                // CREAMOS Y COLOCAMOS EL TEXTO CON LAS INSTRUCCIONES
                TxtInstruccionesNivel = "<html><body><center><b style=color:'" + Netherita
                                + "'>DETALLES DEL NIVEL</b><br><br>CANTIDAD DE PREGUNTAS <b style=color:'" + Netherita
                                + "'>8</b><br>TIPO DE PREGUNTAS <b style=color:'" + Netherita
                                + "'>CRAFTEOS, ABIERTAS, ESCUCHAR</b><br>TIEMPO <b style=color:'"
                                + Netherita
                                + "'>200 SEGUNDOS</b><br>DATO <b style=color:'" + Netherita
                                + "'>ARRASTRA Y SUELTA PARA COLOCAR. PRESIONA PARA ELIMINAR.</b></center></body></html>";
                LblInstruccionesNivel = new JLabel(TxtInstruccionesNivel, JLabel.CENTER);
                VentanaNivelNetherita.add(LblInstruccionesNivel);

                // CREAMOS Y COLOCAMOS EL BOTON DE VER INSTRUCCIONES
                BtnInstrucciones = new JButton();
                VentanaNivelNetherita.add(BtnInstrucciones);

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
                BtnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.decode(Negro), 1));
                BtnInstrucciones.setFocusPainted(false);
                BtnInstrucciones.setIcon(IconoOcultar2);
                BtnInstrucciones.addActionListener(this);
        }

        public void CreacionDePanelesPrincipales() {
                // CREAMOS Y AGREGAMOS EL PANEL DE FONDO
                Panel1 = new JPanel();
                VentanaNivelNetherita.add(Panel1);

                // CREAMOS Y AGREGAMOS EL PANEL DE LOS CRAFTEOS
                Panel2 = new JPanel();
                Panel1.add(Panel2);

                // CREAMOS Y AGREGAMOS EL PANEL DE LA BARRA DE TIEMPO
                Panel3 = new JPanel();
                Panel1.add(Panel3);

                // CREAMOS Y AGREGAMOS EL PANEL DE LAS PREGUNTAS
                Panel4 = new JPanel();
                Panel1.add(Panel4);

                // AGREGAMOS LA BARRA DE TIEMPO
                BarraNivelNetherita = new JProgressBar(0, te);
                Panel3.add(BarraNivelNetherita);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnNetherita = new JButton("SIGUIENTE");
                Panel3.add(BtnNetherita);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnNetherita2 = new JButton("SIGUIENTE");
                Panel3.add(BtnNetherita2);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnNetherita3 = new JButton("SIGUIENTE");
                Panel3.add(BtnNetherita3);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnNetherita4 = new JButton("SIGUIENTE");
                Panel3.add(BtnNetherita4);

                // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
                BtnFinalizar = new JButton("VER RESULTADOS");
                Panel3.add(BtnFinalizar);

                // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
                LblCover = new JLabel();
                Panel1.add(LblCover);
                LblWallpaper = new JLabel();
                Panel1.add(LblWallpaper);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL QUE CONTIENE EL FONDO
                Panel1.setLayout(null);
                Panel1.setBounds(400, 30, 900, 700);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE BARRA
                Panel3.setLayout(null);
                Panel3.setBounds(10, 600, 880, 60);
                Panel3.setOpaque(true);
                Panel3.setBackground(new Color(0, 0, 0, 0));

                // DAMOS PROPIEDADES A NUESTRA BARRA DE TIEMPO
                BarraNivelNetherita.setBounds(0, 5, 730, 50);
                BarraNivelNetherita.setStringPainted(true);
                BarraNivelNetherita.setForeground(Color.decode(Netherita));
                BarraNivelNetherita.setString("");
                BarraNivelNetherita.setBorder(null);
                BarraNivelNetherita.setValue(te);

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnNetherita.setBounds(740, 5, 150, 50);
                BtnNetherita.setFocusPainted(false);
                BtnNetherita.setBackground(Color.decode(Netherita));
                BtnNetherita.setForeground(Color.decode(Blanco));
                BtnNetherita.setFont(FuenteMinecraft.deriveFont(15f));
                BtnNetherita.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
                BtnNetherita.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnNetherita2.setBounds(740, 5, 150, 50);
                BtnNetherita2.setFocusPainted(false);
                BtnNetherita2.setBackground(Color.decode(Netherita));
                BtnNetherita2.setForeground(Color.decode(Blanco));
                BtnNetherita2.setFont(FuenteMinecraft.deriveFont(15f));
                BtnNetherita2.setVisible(false);
                BtnNetherita2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
                BtnNetherita2.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnNetherita3.setBounds(740, 5, 150, 50);
                BtnNetherita3.setFocusPainted(false);
                BtnNetherita3.setBackground(Color.decode(Netherita));
                BtnNetherita3.setForeground(Color.decode(Blanco));
                BtnNetherita3.setFont(FuenteMinecraft.deriveFont(15f));
                BtnNetherita3.setVisible(false);
                BtnNetherita3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
                BtnNetherita3.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnNetherita4.setBounds(740, 5, 150, 50);
                BtnNetherita4.setFocusPainted(false);
                BtnNetherita4.setBackground(Color.decode(Netherita));
                BtnNetherita4.setForeground(Color.decode(Blanco));
                BtnNetherita4.setFont(FuenteMinecraft.deriveFont(15f));
                BtnNetherita4.setVisible(false);
                BtnNetherita4.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
                BtnNetherita4.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
                BtnFinalizar.setBounds(690, 5, 200, 50);
                BtnFinalizar.setFocusPainted(false);
                BtnFinalizar.setBackground(Color.decode(Netherita));
                BtnFinalizar.setForeground(Color.decode(Blanco));
                BtnFinalizar.setFont(FuenteMinecraft.deriveFont(15f));
                BtnFinalizar.setVisible(false);
                BtnFinalizar.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
                BtnFinalizar.addActionListener(this);

                // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
                LblCover.setBounds(0, 0, 901, 701);
                LblCover.setOpaque(true);
                LblCover.setBackground(new Color(0, 0, 0, 100));

                LblWallpaper.setBounds(0, 0, 900, 700);
                LblWallpaper.setIcon(Wallpaper2);
        }

        public void PanelMesaCrafteo1() {
                TxtPregunta1 = "<html><body><b style=color:'" + Oro
                                + "'>RETO #1:</b> CRAFTEA UN <b style=color:'" + Oro
                                + "'>ESTOFADO DE CONEJO</b> CON LOS OBJETOS LATERALES</body></html>";
                // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
                LblPregunta1 = new JLabel(TxtPregunta1, JLabel.CENTER);
                Panel2.add(LblPregunta1);

                // CREO MIS ITEMS
                CrafteoItem1 = new JLabel(P1I1Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem1);
                CrafteoItem2 = new JLabel(P1I2Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem2);
                CrafteoItem3 = new JLabel(P1I3Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem3);
                CrafteoItem4 = new JLabel(P1I4Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem4);
                CrafteoItem5 = new JLabel(P1I5Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem5);
                CrafteoItem6 = new JLabel(P1I6Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem6);
                CrafteoItem7 = new JLabel(P1I7Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem7);
                CrafteoItem8 = new JLabel(P1I8Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem8);
                CrafteoItem9 = new JLabel(P1I9Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem9);
                CrafteoItem10 = new JLabel(P1I10Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem10);
                CrafteoItem11 = new JLabel(P1I11Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem11);
                CrafteoItem12 = new JLabel(P1I12Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem12);
                CrafteoItem13 = new JLabel(P1I13Num2, JLabel.CENTER);
                Panel2.add(CrafteoItem13);

                // CREAMOS NUESTRA MESA DE CRAFTEO
                BtnMesa1 = new JButton(P1I13Num2);
                BtnMesa1.setFocusable(false);
                Panel2.add(BtnMesa1);
                BtnMesa2 = new JButton(P1I13Num2);
                BtnMesa2.setFocusable(false);
                Panel2.add(BtnMesa2);
                BtnMesa3 = new JButton(P1I13Num2);
                BtnMesa3.setFocusable(false);
                Panel2.add(BtnMesa3);
                BtnMesa4 = new JButton(P1I13Num2);
                BtnMesa4.setFocusable(false);
                Panel2.add(BtnMesa4);
                BtnMesa5 = new JButton(P1I13Num2);
                BtnMesa5.setFocusable(false);
                Panel2.add(BtnMesa5);
                BtnMesa6 = new JButton(P1I13Num2);
                BtnMesa6.setFocusable(false);
                Panel2.add(BtnMesa6);
                BtnMesa7 = new JButton(P1I13Num2);
                BtnMesa7.setFocusable(false);
                Panel2.add(BtnMesa7);
                BtnMesa8 = new JButton(P1I13Num2);
                BtnMesa8.setFocusable(false);
                Panel2.add(BtnMesa8);
                BtnMesa9 = new JButton(P1I13Num2);
                BtnMesa9.setFocusable(false);
                Panel2.add(BtnMesa9);

                // CREO MI ARRASTRE
                Arrastrar = new DragMouseAdapter();

                LblPregunta1BG = new JLabel();
                Panel2.add(LblPregunta1BG);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
                Panel2.setLayout(null);
                Panel2.setBounds(10, 10, 880, 580);
                Panel2.setOpaque(false);

                // TITULO EN PREGUNTA 5
                LblPregunta1.setBounds(0, 10, 690, 50);
                LblPregunta1.setOpaque(true);
                LblPregunta1.setBackground(Color.decode(Netherita));
                LblPregunta1.setForeground(Color.decode(Blanco));
                LblPregunta1.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
                LblPregunta1.setFont(FuenteMinecraft.deriveFont(15f));

                // ASIGNAMOS PROPIEDADES AL PRIMER ITEM
                CrafteoItem1.setBounds(0, 70, 86, 86);
                CrafteoItem1.setOpaque(true);
                CrafteoItem1.setBackground(Color.decode(Netherita));
                CrafteoItem1.addMouseListener(Arrastrar);
                CrafteoItem1.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL SEGUNDO ITEM
                CrafteoItem2.setBounds(0, 156, 86, 86);
                CrafteoItem2.setOpaque(true);
                CrafteoItem2.setBackground(Color.decode(Netherita));
                CrafteoItem2.addMouseListener(Arrastrar);
                CrafteoItem2.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL TERCER ITEM
                CrafteoItem3.setBounds(0, 242, 86, 86);
                CrafteoItem3.setOpaque(true);
                CrafteoItem3.setBackground(Color.decode(Netherita));
                CrafteoItem3.addMouseListener(Arrastrar);
                CrafteoItem3.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL CUARTO ITEM
                CrafteoItem4.setBounds(0, 328, 86, 86);
                CrafteoItem4.setOpaque(true);
                CrafteoItem4.setBackground(Color.decode(Netherita));
                CrafteoItem4.addMouseListener(Arrastrar);
                CrafteoItem4.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL QUINTO ITEM
                CrafteoItem5.setBounds(0, 414, 86, 86);
                CrafteoItem5.setOpaque(true);
                CrafteoItem5.setBackground(Color.decode(Netherita));
                CrafteoItem5.addMouseListener(Arrastrar);
                CrafteoItem5.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL SEXTO ITEM
                CrafteoItem6.setBounds(0, 500, 86, 86);
                CrafteoItem6.setOpaque(true);
                CrafteoItem6.setBackground(Color.decode(Netherita));
                CrafteoItem6.addMouseListener(Arrastrar);
                CrafteoItem6.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL SEPTIMO ITEM
                CrafteoItem7.setBounds(794, 70, 86, 86);
                CrafteoItem7.setOpaque(true);
                CrafteoItem7.setBackground(Color.decode(Netherita));
                CrafteoItem7.addMouseListener(Arrastrar);
                CrafteoItem7.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL OCTAVO ITEM
                CrafteoItem8.setBounds(794, 156, 86, 86);
                CrafteoItem8.setOpaque(true);
                CrafteoItem8.setBackground(Color.decode(Netherita));
                CrafteoItem8.addMouseListener(Arrastrar);
                CrafteoItem8.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL NOVENO ITEM
                CrafteoItem9.setBounds(794, 242, 86, 86);
                CrafteoItem9.setOpaque(true);
                CrafteoItem9.setBackground(Color.decode(Netherita));
                CrafteoItem9.addMouseListener(Arrastrar);
                CrafteoItem9.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL DECIMO ITEM
                CrafteoItem10.setBounds(794, 328, 86, 86);
                CrafteoItem10.setOpaque(true);
                CrafteoItem10.setBackground(Color.decode(Netherita));
                CrafteoItem10.addMouseListener(Arrastrar);
                CrafteoItem10.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL ONCEAVO ITEM
                CrafteoItem11.setBounds(794, 414, 86, 86);
                CrafteoItem11.setOpaque(true);
                CrafteoItem11.setBackground(Color.decode(Netherita));
                CrafteoItem11.addMouseListener(Arrastrar);
                CrafteoItem11.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES AL DOCEAVO ITEM
                CrafteoItem12.setBounds(794, 500, 86, 86);
                CrafteoItem12.setOpaque(true);
                CrafteoItem12.setBackground(Color.decode(Netherita));
                CrafteoItem12.addMouseListener(Arrastrar);
                CrafteoItem12.setTransferHandler(new TransferHandler("icon"));

                // ASIGNAMOS PROPIEDADES A NUESTRA MENSA DE CRAFTEO
                BtnMesa1.setBounds(311, 201, 86, 86);
                BtnMesa1.setBackground(Color.decode(Netherita));
                BtnMesa1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa1.setTransferHandler(new TransferHandler("icon"));
                BtnMesa1.addActionListener(this);

                BtnMesa2.setBounds(397, 201, 86, 86);
                BtnMesa2.setBackground(Color.decode(Netherita));
                BtnMesa2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa2.setTransferHandler(new TransferHandler("icon"));
                BtnMesa2.addActionListener(this);

                BtnMesa3.setBounds(483, 201, 86, 86);
                BtnMesa3.setBackground(Color.decode(Netherita));
                BtnMesa3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa3.setTransferHandler(new TransferHandler("icon"));
                BtnMesa3.addActionListener(this);

                BtnMesa4.setBounds(311, 287, 86, 86);
                BtnMesa4.setBackground(Color.decode(Netherita));
                BtnMesa4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa4.setTransferHandler(new TransferHandler("icon"));
                BtnMesa4.addActionListener(this);

                BtnMesa5.setBounds(397, 287, 86, 86);
                BtnMesa5.setBackground(Color.decode(Netherita));
                BtnMesa5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa5.setTransferHandler(new TransferHandler("icon"));
                BtnMesa5.addActionListener(this);

                BtnMesa6.setBounds(483, 287, 86, 86);
                BtnMesa6.setBackground(Color.decode(Netherita));
                BtnMesa6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa6.setTransferHandler(new TransferHandler("icon"));
                BtnMesa6.addActionListener(this);

                BtnMesa7.setBounds(311, 373, 86, 86);
                BtnMesa7.setBackground(Color.decode(Netherita));
                BtnMesa7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa7.setTransferHandler(new TransferHandler("icon"));
                BtnMesa7.addActionListener(this);

                BtnMesa8.setBounds(397, 373, 86, 86);
                BtnMesa8.setBackground(Color.decode(Netherita));
                BtnMesa8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa8.setTransferHandler(new TransferHandler("icon"));
                BtnMesa8.addActionListener(this);

                BtnMesa9.setBounds(483, 373, 86, 86);
                BtnMesa9.setBackground(Color.decode(Netherita));
                BtnMesa9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                BtnMesa9.setTransferHandler(new TransferHandler("icon"));
                BtnMesa9.addActionListener(this);

                // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
                LblPregunta1BG.setBounds(0, 70, 880, 520);
                LblPregunta1BG.setOpaque(true);
                LblPregunta1BG.setBackground(new Color(38, 38, 38, 150));

                VentanaNivelNetherita.repaint();
        }

        public void PanelMesaCrafteo2() {
                TxtPregunta2 = "<html><body><b style=color:'" + Oro
                                + "'>RETO #2:</b> CRAFTEA UN <b style=color:'" + Oro
                                + "'>PASTEL/TARTA</b> CON LOS OBJETOS LATERALES</body></html>";
                // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
                LblPregunta1.setText(TxtPregunta2);
                LblPregunta1.setSize(620, 50);

                CrafteoItem1.setIcon(P2I1Num2);
                CrafteoItem2.setIcon(P2I2Num2);
                CrafteoItem3.setIcon(P2I3Num2);
                CrafteoItem4.setIcon(P2I4Num2);
                CrafteoItem5.setIcon(P2I5Num2);
                CrafteoItem6.setIcon(P2I6Num2);
                CrafteoItem7.setIcon(P2I7Num2);
                CrafteoItem8.setIcon(P2I8Num2);
                CrafteoItem9.setIcon(P2I9Num2);
                CrafteoItem10.setIcon(P2I10Num2);
                CrafteoItem11.setIcon(P2I11Num2);
                CrafteoItem12.setIcon(P2I12Num2);
        }

        public void PanelMesaCrafteo3() {
                TxtPregunta3 = "<html><body><b style=color:'" + Oro
                                + "'>RETO #3:</b> CRAFTEA UNA <b style=color:'" + Oro
                                + "'>CARGA IGNEA</b> CON LOS OBJETOS LATERALES</body></html>";
                // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
                LblPregunta1.setText(TxtPregunta3);
                LblPregunta1.setSize(620, 50);

                CrafteoItem1.setIcon(P3I1Num2);
                CrafteoItem2.setIcon(P3I2Num2);
                CrafteoItem3.setIcon(P3I3Num2);
                CrafteoItem4.setIcon(P3I4Num2);
                CrafteoItem5.setIcon(P3I5Num2);
                CrafteoItem6.setIcon(P3I6Num2);
                CrafteoItem7.setIcon(P3I7Num2);
                CrafteoItem8.setIcon(P3I8Num2);
                CrafteoItem9.setIcon(P3I9Num2);
                CrafteoItem10.setIcon(P3I10Num2);
                CrafteoItem11.setIcon(P3I11Num2);
                CrafteoItem12.setIcon(P3I12Num2);
        }

        public void PanelMesaCrafteo4() {
                TxtPregunta4 = "<html><body><b style=color:'" + Oro
                                + "'>RETO #4:</b> CRAFTEA UN <b style=color:'" + Oro
                                + "'>REPETIDOR DE REDSTONE</b> CON LOS OBJETOS LATERALES</body></html>";
                // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
                LblPregunta1.setText(TxtPregunta4);
                LblPregunta1.setSize(720, 50);

                CrafteoItem1.setIcon(P4I1Num2);
                CrafteoItem2.setIcon(P4I2Num2);
                CrafteoItem3.setIcon(P4I3Num2);
                CrafteoItem4.setIcon(P4I4Num2);
                CrafteoItem5.setIcon(P4I5Num2);
                CrafteoItem6.setIcon(P4I6Num2);
                CrafteoItem7.setIcon(P4I7Num2);
                CrafteoItem8.setIcon(P4I8Num2);
                CrafteoItem9.setIcon(P4I9Num2);
                CrafteoItem10.setIcon(P4I10Num2);
                CrafteoItem11.setIcon(P4I11Num2);
                CrafteoItem12.setIcon(P4I12Num2);
        }

        public void PanelPreguntas1() {
                // AGREGAMOS NUESTRA QUINTA PREGUNTA
                TxtPregunta5 = "<html><body><b style=color:'" + Oro
                                + "'>PREGUNTA #5:</b> ESCRIBE EL COMANDO PARA EVITAR QUE EL <b style=color:'" + Oro
                                + "'>TIEMPO AVANCE</b></body></html>";
                LblPregunta5 = new JLabel(TxtPregunta5, JLabel.CENTER);
                Panel4.add(LblPregunta5);

                // AGREGAMOS NUESTRA SEXTA PREGUNTA
                TxtPregunta6 = "<html><body><b style=color:'" + Oro
                                + "'>PREGUNTA #6:</b> ESCRIBE EL COMANDO PARA CAMBIAR A <b style=color:'" + Oro
                                + "'>MODO ESPECTADOR</b></body></html>";
                LblPregunta6 = new JLabel(TxtPregunta6, JLabel.CENTER);
                Panel4.add(LblPregunta6);

                // AGREGAMOS NUESTRA SEPTIMA PREGUNTA
                TxtPregunta7 = "<html><body><b style=color:'" + Oro
                                + "'>PREGUNTA #7:</b> ESCRIBE EL COMANDO PARA <b style=color:'" + Oro
                                + "'>MANTENER EL CLIMA</b></body></html>";
                LblPregunta7 = new JLabel(TxtPregunta7, JLabel.CENTER);
                Panel4.add(LblPregunta7);

                // AGREGAMOS NUESTRA OCTAVA PREGUNTA
                TxtPregunta8 = "<html><body><b style=color:'" + Oro
                                + "'>PREGUNTA #8:</b> ESCRIBE EL COMANDO PARA PONER LA <b style=color:'" + Oro
                                + "'>MEDIANOCHE</b></body></html>";
                LblPregunta8 = new JLabel(TxtPregunta8, JLabel.CENTER);
                Panel4.add(LblPregunta8);

                // AGREGOS NUESTROS INPUT TEXT PARA NUESTRAS RESPUESTAS
                Pregunta5 = new JTextField();
                Panel4.add(Pregunta5);
                Pregunta6 = new JTextField();
                Panel4.add(Pregunta6);
                Pregunta7 = new JTextField();
                Panel4.add(Pregunta7);
                Pregunta8 = new JTextField();
                Panel4.add(Pregunta8);

                // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
                Panel4.setLayout(null);
                Panel4.setBounds(10, 10, 880, 580);
                Panel4.setOpaque(false);

                // TITULO EN PREGUNTA 5
                LblPregunta5.setBounds(0, 10, 680, 50);
                LblPregunta5.setOpaque(true);
                LblPregunta5.setBackground(Color.decode(Netherita));
                LblPregunta5.setForeground(Color.decode(Negro));
                LblPregunta5.setBorder(BorderFactory.createEmptyBorder(8, 0, 0, 0));
                LblPregunta5.setFont(FuenteMinecraft.deriveFont(15f));

                // AGREGAMOS EL INPUT TEXT DE NUESTRA PREGUNTA 5
                Pregunta5.setBounds(0, 70, 880, 75);
                Pregunta5.setBackground(Color.decode(Oro));
                Pregunta5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Pregunta5.setFont(FuenteMinecraft.deriveFont(15f));
                Pregunta5.setForeground(Color.decode(Netherita));

                // TITULO EN PREGUNTA 6
                LblPregunta6.setBounds(0, 155, 670, 50);
                LblPregunta6.setOpaque(true);
                LblPregunta6.setBackground(Color.decode(Netherita));
                LblPregunta6.setForeground(Color.decode(Negro));
                LblPregunta6.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
                LblPregunta6.setFont(FuenteMinecraft.deriveFont(15f));

                // AGREGAMOS EL INPUT TEXT DE NUESTRA PREGUNTA 6
                Pregunta6.setBounds(0, 215, 880, 75);
                Pregunta6.setBackground(Color.decode(Oro));
                Pregunta6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Pregunta6.setFont(FuenteMinecraft.deriveFont(15f));
                Pregunta6.setForeground(Color.decode(Netherita));

                // TITULO EN PREGUNTA 7
                LblPregunta7.setBounds(0, 300, 590, 50);
                LblPregunta7.setOpaque(true);
                LblPregunta7.setBackground(Color.decode(Netherita));
                LblPregunta7.setForeground(Color.decode(Negro));
                LblPregunta7.setBorder(BorderFactory.createEmptyBorder(8, 0, 0, 0));
                LblPregunta7.setFont(FuenteMinecraft.deriveFont(15f));

                // AGREGAMOS EL INPUT TEXT DE NUESTRA PREGUNTA 7
                Pregunta7.setBounds(0, 360, 880, 75);
                Pregunta7.setBackground(Color.decode(Oro));
                Pregunta7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Pregunta7.setFont(FuenteMinecraft.deriveFont(15f));
                Pregunta7.setForeground(Color.decode(Netherita));

                // TITULO EN PREGUNTA 8
                LblPregunta8.setBounds(0, 445, 610, 50);
                LblPregunta8.setOpaque(true);
                LblPregunta8.setBackground(Color.decode(Netherita));
                LblPregunta8.setForeground(Color.decode(Negro));
                LblPregunta8.setBorder(BorderFactory.createEmptyBorder(8, 0, 0, 0));
                LblPregunta8.setFont(FuenteMinecraft.deriveFont(15f));

                // AGREGAMOS EL INPUT TEXT DE NUESTRA PREGUNTA 8
                Pregunta8.setBounds(0, 505, 880, 75);
                Pregunta8.setBackground(Color.decode(Oro));
                Pregunta8.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                Pregunta8.setFont(FuenteMinecraft.deriveFont(15f));
                Pregunta8.setForeground(Color.decode(Netherita));

        }

        public void CronometroNetherita() {
                Thread hilo = new Thread() {
                        public void run() {
                                while (te >= 0) {
                                        if (te == 120) {
                                                BarraNivelNetherita.setForeground(Color.ORANGE);
                                        }
                                        if (te == 60) {
                                                BarraNivelNetherita.setForeground(Color.decode(Rojo));
                                        }
                                        try {
                                                Thread.sleep(1000);
                                                BarraNivelNetherita.setValue(te);
                                                te--;
                                        } catch (Exception e) {
                                                System.out.println(e);
                                        }
                                }
                                MostrarPuntajeFinal();
                        }
                };
                hilo.start();
        }

        public void ObtenerHashCode() {
                Item1 = CrafteoItem1.getIcon().hashCode();
                Item2 = CrafteoItem2.getIcon().hashCode();
                Item3 = CrafteoItem3.getIcon().hashCode();
                Item4 = CrafteoItem4.getIcon().hashCode();
                Item5 = CrafteoItem5.getIcon().hashCode();
                Item6 = CrafteoItem6.getIcon().hashCode();
                Item7 = CrafteoItem7.getIcon().hashCode();
                Item8 = CrafteoItem8.getIcon().hashCode();
                Item9 = CrafteoItem9.getIcon().hashCode();
                Item10 = CrafteoItem10.getIcon().hashCode();
                Item11 = CrafteoItem11.getIcon().hashCode();
                Item12 = CrafteoItem12.getIcon().hashCode();
                Item13 = CrafteoItem13.getIcon().hashCode();
                Mesa1 = BtnMesa1.getIcon().hashCode();
                Mesa2 = BtnMesa2.getIcon().hashCode();
                Mesa3 = BtnMesa3.getIcon().hashCode();
                Mesa4 = BtnMesa4.getIcon().hashCode();
                Mesa5 = BtnMesa5.getIcon().hashCode();
                Mesa6 = BtnMesa6.getIcon().hashCode();
                Mesa7 = BtnMesa7.getIcon().hashCode();
                Mesa8 = BtnMesa8.getIcon().hashCode();
                Mesa9 = BtnMesa9.getIcon().hashCode();
        }

        public void LimpiarMesaCrafteo() {
                BtnMesa1.setIcon(P1I13Num2);
                BtnMesa2.setIcon(P1I13Num2);
                BtnMesa3.setIcon(P1I13Num2);
                BtnMesa4.setIcon(P1I13Num2);
                BtnMesa5.setIcon(P1I13Num2);
                BtnMesa6.setIcon(P1I13Num2);
                BtnMesa7.setIcon(P1I13Num2);
                BtnMesa8.setIcon(P1I13Num2);
                BtnMesa9.setIcon(P1I13Num2);
        }

        public void MostrarPuntajeFinal() {
                VentanaNivelNetherita.setVisible(false);
                CargandoNivel CN = new CargandoNivel();
                CN.VentanaCargandoNivel();
                CN.CargarResultados();
        }

        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == BtnMesa1) {
                        BtnMesa1.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa2) {
                        BtnMesa2.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa3) {
                        BtnMesa3.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa4) {
                        BtnMesa4.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa5) {
                        BtnMesa5.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa6) {
                        BtnMesa6.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa7) {
                        BtnMesa7.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa8) {
                        BtnMesa8.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnMesa9) {
                        BtnMesa9.setIcon(P1I13Num2);
                }
                if (e.getSource() == BtnNetherita) {
                        ObtenerHashCode();
                        if (Item1 == Mesa6 && Item4 == Mesa4 && Item7 == Mesa2 && Item10 == Mesa8 && Item12 == Mesa5
                                        && Item13 == Mesa1 && Item13 == Mesa3 && Item13 == Mesa7 && Item13 == Mesa9) {
                                PuntajeNivelNetherita++;
                                BtnNetherita.setVisible(false);
                                BtnNetherita2.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo2();
                        } else {
                                BtnNetherita.setVisible(false);
                                BtnNetherita2.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo2();
                        }
                }
                if (e.getSource() == BtnNetherita2) {
                        ObtenerHashCode();
                        if (Item6 == Mesa1 && Item6 == Mesa2 && Item6 == Mesa3 && Item8 == Mesa4 && Item7 == Mesa5
                                        && Item8 == Mesa6
                                        && Item2 == Mesa7 && Item2 == Mesa8 && Item2 == Mesa9) {
                                PuntajeNivelNetherita++;
                                BtnNetherita2.setVisible(false);
                                BtnNetherita3.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo3();
                        } else {
                                BtnNetherita2.setVisible(false);
                                BtnNetherita3.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo3();
                        }
                }
                if (e.getSource() == BtnNetherita3) {
                        ObtenerHashCode();
                        if (Item13 == Mesa1 && Item13 == Mesa2 && Item13 == Mesa3 && Item6 == Mesa4 && Item9 == Mesa5
                                        && Item5 == Mesa6 && Item13 == Mesa7 && Item13 == Mesa8 && Item13 == Mesa9) {
                                PuntajeNivelNetherita++;
                                BtnNetherita3.setVisible(false);
                                BtnNetherita4.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo4();
                        } else {
                                BtnNetherita3.setVisible(false);
                                BtnNetherita4.setVisible(true);
                                LimpiarMesaCrafteo();
                                PanelMesaCrafteo4();
                        }
                }
                if (e.getSource() == BtnNetherita4) {
                        ObtenerHashCode();
                        if (Item13 == Mesa1 && Item13 == Mesa2 && Item13 == Mesa3 && Item3 == Mesa4 && Item9 == Mesa5
                                        && Item3 == Mesa6 && Item6 == Mesa7 && Item6 == Mesa8 && Item6 == Mesa9) {
                                PuntajeNivelNetherita++;
                                Panel2.setVisible(false);
                                BtnNetherita4.setVisible(false);
                                BtnFinalizar.setVisible(true);
                                BarraNivelNetherita.setSize(680, 50);
                                PanelPreguntas1();
                        } else {
                                Panel2.setVisible(false);
                                BtnNetherita4.setVisible(false);
                                BtnFinalizar.setVisible(true);
                                BarraNivelNetherita.setSize(680, 50);
                                PanelPreguntas1();
                        }
                }
                if (e.getSource() == BtnFinalizar) {
                        String RespuestaUsuarioP5, RespuestaUsuarioP6, RespuestaUsuarioP7, RespuestaUsuarioP8;
                        RespuestaUsuarioP5 = Pregunta5.getText().toUpperCase().trim();
                        RespuestaUsuarioP6 = Pregunta6.getText().toUpperCase().trim();
                        RespuestaUsuarioP7 = Pregunta7.getText().toUpperCase().trim();
                        RespuestaUsuarioP8 = Pregunta8.getText().toUpperCase().trim();
                        if (RespuestaUsuarioP5.equals(RespuestaP5)) {
                                PuntajeNivelNetherita++;
                        }
                        if (RespuestaUsuarioP6.equals(RespuestaP6)) {
                                PuntajeNivelNetherita++;
                        }
                        if (RespuestaUsuarioP7.equals(RespuestaP7)) {
                                PuntajeNivelNetherita++;
                        }
                        if (RespuestaUsuarioP8.equals(RespuestaP8)) {
                                PuntajeNivelNetherita++;
                        }
                        MostrarPuntajeFinal();
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

        public class DragMouseAdapter extends MouseAdapter {

                public void mousePressed(MouseEvent e) {
                        var c = (JComponent) e.getSource();
                        var handler = c.getTransferHandler();
                        handler.exportAsDrag(c, e, TransferHandler.COPY);
                }
        }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaNiveles extends JFrame implements ActionListener, MouseListener {

        private JFrame VentanaNiveles;
        private Image Avatar, Empezar, Wallpaper, ImgCobre, ImgHierro, ImgOro, ImgEsmeralda, ImgDiamante,
                        ImgNetherita;
        private ImageIcon Avatar2, Empezar2, ImgCobre2, ImgHierro2, ImgOro2, ImgEsmeralda2, ImgDiamante2,
                        ImgNetherita2, Wallpaper2;
        private String UsuarioNiveles = "", Presentacion = "", Verde = "", Limon = "", Blanco = "",
                        Negro = "", Cobre = "", Hierro = "", Oro = "", Esmeralda = "", Diamante = "", Netherita = "",
                        Niveles = "";
        private JLabel LblAvatar, LblPresentacion, LblTitulo, LblCobre, LblHierro, LblOro, LblEsmeralda, LblDiamante,
                        LblNetherita, LblCover, LblWallpaper, LblBtnCobre, LblBtnHierro, LblBtnOro, LblBtnEsmeralda,
                        LblBtnDiamante, LblBtnNetherita;
        private Font FuenteMinecraft;
        private JButton BtnEmpezar, BtnScore;

        public void CreandoVentanaNiveles() {

                // PERSONALIZAMOS LA PLANTILLA DE NIVELES
                PersonalizarPlantillaNiveles();

                // GUARDANAMOS NUESTRAS IMAGENES
                ObtenerImagenesNiveles();

                // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
                CrearSideBarLeft();

                // CREAMOS Y COLOCAMOS NUESTRA LISTA DE NIVELES
                CrearListaDeNiveles();

                // COLOCAMOS NUESTRA IMAGEN DE FONDO
                PonerImagenDeFondo();
        }

        public void PersonalizarPlantillaNiveles() {
                // INSTANCIAMOS LA CLASE DE NUESTRA PLANTILLA
                PlantillaGeneral PlantillaGeneralParaNiveles = new PlantillaGeneral();

                // OBTENEMOS EL NOMBRE DE USUARIO
                VentanaLogin VTNLogin = new VentanaLogin();
                VTNLogin.ObtenerImagenesLogin();
                UsuarioNiveles = VTNLogin.Usuario;

                // CREAMOS EL JFRAME DE VETANA LOGIN Y ALMACENAMOS LA PLANTILLA GENERAL
                VentanaNiveles = new JFrame();
                VentanaNiveles = PlantillaGeneralParaNiveles.CreandoPlantillaGeneral();

                // OBTENEMOS LAS FUENTES Y COLORES A UTILIZAR
                FuenteMinecraft = PlantillaGeneralParaNiveles.FuenteMinecraft;

                Verde = PlantillaGeneralParaNiveles.Verde;
                Limon = PlantillaGeneralParaNiveles.Limon;
                Blanco = PlantillaGeneralParaNiveles.Blanco;
                Negro = PlantillaGeneralParaNiveles.Negro;
                Cobre = PlantillaGeneralParaNiveles.Cobre;
                Hierro = PlantillaGeneralParaNiveles.Hierro;
                Oro = PlantillaGeneralParaNiveles.Oro;
                Esmeralda = PlantillaGeneralParaNiveles.Esmeralda;
                Diamante = PlantillaGeneralParaNiveles.Diamante;
                Netherita = PlantillaGeneralParaNiveles.Netherita;

                // OCULTAMOS EL BOTON DE MOSTRAR SCORE
                BtnScore = PlantillaGeneralParaNiveles.BtnScore;
                BtnScore.setVisible(false);
        }

        public void ObtenerImagenesNiveles() {
                // ALMACENAMOS NUESTRA IMAGEN DE ICONO DE USUARIO
                Avatar = new ImageIcon("ImgNiveles/Avatar.png").getImage();
                Avatar2 = new ImageIcon(Avatar.getScaledInstance(150, 150,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE BOTON DE EMPEZAR
                Empezar = new ImageIcon("ImgNiveles/Empezar.png").getImage();
                Empezar2 = new ImageIcon(Empezar.getScaledInstance(120, 30,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
                ImgCobre = new ImageIcon("ImgNiveles/Cobre.png").getImage();
                ImgCobre2 = new ImageIcon(ImgCobre.getScaledInstance(100, 80,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL HIERRO
                ImgHierro = new ImageIcon("ImgNiveles/Hierro.png").getImage();
                ImgHierro2 = new ImageIcon(ImgHierro.getScaledInstance(100, 80,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL ORO
                ImgOro = new ImageIcon("ImgNiveles/Oro.png").getImage();
                ImgOro2 = new ImageIcon(ImgOro.getScaledInstance(100, 80,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL ESMERALDA
                ImgEsmeralda = new ImageIcon("ImgNiveles/Esmeralda.png").getImage();
                ImgEsmeralda2 = new ImageIcon(ImgEsmeralda.getScaledInstance(80, 90,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL DIAMANTE
                ImgDiamante = new ImageIcon("ImgNiveles/Diamante.png").getImage();
                ImgDiamante2 = new ImageIcon(ImgDiamante.getScaledInstance(80, 90,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE NIVEL NETHERITA
                ImgNetherita = new ImageIcon("ImgNiveles/Netherita.png").getImage();
                ImgNetherita2 = new ImageIcon(ImgNetherita.getScaledInstance(100, 80,
                                Image.SCALE_SMOOTH));

                // ALMACENAMOS NUESTRA IMAGEN DE FONDO
                Wallpaper = new ImageIcon("ImgNiveles/Wallpaper.jpg").getImage();
                Wallpaper2 = new ImageIcon(Wallpaper.getScaledInstance(900, 700,
                                Image.SCALE_SMOOTH));
        }

        public void CrearSideBarLeft() {
                // CREAMOS Y AGREAMOS EL ICONO DE USUARIO
                LblAvatar = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblAvatar);

                // CREAMOS Y AGREGAMOS NUESTRO TEXTO DE PRESENTACION
                Presentacion = "<html><body><center>ESTAS JUGANDO COMO<br><br> <b style=color:'"
                                + Verde + "'>" + UsuarioNiveles + "</b></center></html></body>";
                LblPresentacion = new JLabel(Presentacion, JLabel.CENTER);
                VentanaNiveles.add(LblPresentacion);

                // CREAMOS Y AGREGAMOS EL BOTON DE EMPEZAR
                BtnEmpezar = new JButton();
                VentanaNiveles.add(BtnEmpezar);

                // PERSONALIZAMOS NUESTRO ICONO DE USUARIO
                LblAvatar.setBounds(0, 140, 400, 150);
                LblAvatar.setIcon(Avatar2);

                // PERSONALIZAMOS NUESTRO TEXTO DE PRESENTACION
                LblPresentacion.setBounds(0, 310, 400, 80);
                LblPresentacion.setForeground(Color.decode(Blanco));
                LblPresentacion.setFont(FuenteMinecraft.deriveFont(25f));

                // PERSONALIZAMOS NUESTRO BOTON DE EMPEZAR
                BtnEmpezar.setBounds(10, 410, 380, 50);
                BtnEmpezar.setBackground(Color.decode(Verde));
                BtnEmpezar.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
                BtnEmpezar.setFocusPainted(false);
                BtnEmpezar.setIcon(Empezar2);
                BtnEmpezar.addMouseListener(this);
                BtnEmpezar.addActionListener(this);
        }

        public void CrearListaDeNiveles() {
                // CREAMOS Y AGREGAMOS EL TITULO
                Niveles = "<html><body>EL JUEGO CONSTA DE <b style=color:'" + Verde
                                + "'>6 NIVELES</b> Y SU DIFICULTAD ES DEFINIDA POR EL MATERIAL DE LA IMAGEN</body></html>";
                LblTitulo = new JLabel(Niveles, JLabel.CENTER);
                LblTitulo.setForeground(Color.decode(Blanco));
                LblTitulo.setFont(FuenteMinecraft);
                VentanaNiveles.add(LblTitulo);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL COBRE
                LblCobre = new JLabel("Nivel COBRE", JLabel.CENTER);
                VentanaNiveles.add(LblCobre);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL HIERRO
                LblHierro = new JLabel("Nivel HIERRO", JLabel.CENTER);
                VentanaNiveles.add(LblHierro);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL ORO
                LblOro = new JLabel("Nivel ORO", JLabel.CENTER);
                VentanaNiveles.add(LblOro);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL ESMERALDA
                LblEsmeralda = new JLabel("Nivel ESMERALDA", JLabel.CENTER);
                VentanaNiveles.add(LblEsmeralda);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL DIAMANTE
                LblDiamante = new JLabel("Nivel DIAMANTE", JLabel.CENTER);
                VentanaNiveles.add(LblDiamante);

                // CREAMOS Y AGREGAMOS EL TITULO DEL NIVEL NETHERITA
                LblNetherita = new JLabel("Nivel NETHERITA", JLabel.CENTER);
                VentanaNiveles.add(LblNetherita);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE COBRE
                LblBtnCobre = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnCobre);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE HIERRO
                LblBtnHierro = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnHierro);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE ORO
                LblBtnOro = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnOro);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE ESMERALDA
                LblBtnEsmeralda = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnEsmeralda);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE DIAMANTE
                LblBtnDiamante = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnDiamante);

                // CREAMOS Y AGREGAMOS EL "BOTON" DE NETHERITA
                LblBtnNetherita = new JLabel("", JLabel.CENTER);
                VentanaNiveles.add(LblBtnNetherita);

                // PERSONALIZAMOS EL TITULO DE NIVELES
                LblTitulo.setBounds(410, 40, 880, 50);
                LblTitulo.setOpaque(true);
                LblTitulo.setBackground(Color.decode(Negro));
                LblTitulo.setForeground(Color.decode(Blanco));
                LblTitulo.setFont(FuenteMinecraft.deriveFont(15f));

                // PERSONALIZAMOS LA SECCION DEL NIVEL COBRE
                LblCobre.setBounds(410, 100, 435, 50);
                LblCobre.setOpaque(true);
                LblCobre.setBackground(Color.decode(Cobre));
                LblCobre.setForeground(Color.decode(Blanco));
                LblCobre.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnCobre.setBounds(410, 150, 435, 140);
                LblBtnCobre.setOpaque(true);
                LblBtnCobre.setBackground(Color.decode(Negro));
                LblBtnCobre.setIcon(ImgCobre2);

                // PERSONALIZAMOS LA SECCION DEL NIVEL HIERRO
                LblHierro.setBounds(410, 300, 435, 50);
                LblHierro.setOpaque(true);
                LblHierro.setBackground(Color.decode(Hierro));
                LblHierro.setForeground(Color.decode(Blanco));
                LblHierro.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnHierro.setBounds(410, 350, 435, 140);
                LblBtnHierro.setOpaque(true);
                LblBtnHierro.setBackground(Color.decode(Negro));
                LblBtnHierro.setIcon(ImgHierro2);

                // PERSONALIZAMOS LA SECCION DEL NIVEL ORO
                LblOro.setBounds(410, 500, 435, 50);
                LblOro.setOpaque(true);
                LblOro.setBackground(Color.decode(Oro));
                LblOro.setForeground(Color.decode(Blanco));
                LblOro.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnOro.setBounds(410, 550, 435, 140);
                LblBtnOro.setOpaque(true);
                LblBtnOro.setBackground(Color.decode(Negro));
                LblBtnOro.setIcon(ImgOro2);

                // PERSONALIZAMOS LA SECCION DEL NIVEL ESMERALDA
                LblEsmeralda.setBounds(855, 100, 435, 50);
                LblEsmeralda.setOpaque(true);
                LblEsmeralda.setBackground(Color.decode(Esmeralda));
                LblEsmeralda.setForeground(Color.decode(Blanco));
                LblEsmeralda.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnEsmeralda.setBounds(855, 150, 435, 140);
                LblBtnEsmeralda.setOpaque(true);
                LblBtnEsmeralda.setBackground(Color.decode(Negro));
                LblBtnEsmeralda.setIcon(ImgEsmeralda2);

                // PERSONALIZAMOS LA SECCION DEL NIVEL DIAMANTE
                LblDiamante.setBounds(855, 300, 435, 50);
                LblDiamante.setOpaque(true);
                LblDiamante.setBackground(Color.decode(Diamante));
                LblDiamante.setForeground(Color.decode(Blanco));
                LblDiamante.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnDiamante.setBounds(855, 350, 435, 140);
                LblBtnDiamante.setOpaque(true);
                LblBtnDiamante.setBackground(Color.decode(Negro));
                LblBtnDiamante.setIcon(ImgDiamante2);

                // PERSONALIZAMOS LA SECCION DEL NIVEL NETHERITA
                LblNetherita.setBounds(855, 500, 435, 50);
                LblNetherita.setOpaque(true);
                LblNetherita.setBackground(Color.decode(Netherita));
                LblNetherita.setForeground(Color.decode(Blanco));
                LblNetherita.setFont(FuenteMinecraft.deriveFont(15f));

                LblBtnNetherita.setBounds(855, 550, 435, 140);
                LblBtnNetherita.setOpaque(true);
                LblBtnNetherita.setBackground(Color.decode(Negro));
                LblBtnNetherita.setIcon(ImgNetherita2);

                VentanaNiveles.repaint();
        }

        public void PonerImagenDeFondo() {
                // CREAMOS Y COLOCAMOS NUESTRO COVER SEMIOSCURO
                LblCover = new JLabel();
                VentanaNiveles.add(LblCover);

                // CREAMOS Y COLOCAMOS NUESTRO BACKGROUND
                LblWallpaper = new JLabel();
                VentanaNiveles.add(LblWallpaper);

                // ASIGNAMOS PROPIEDADES A NUESTRO COVER SEMIOSCURO
                LblCover.setBounds(400, 0, 901, 701);
                LblCover.setOpaque(true);
                LblCover.setBackground(new Color(0, 0, 0, 100));
                LblCover.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

                // ASIGNAMOS PROPIEDADES A NUESTRO BACKGROUND
                LblWallpaper.setBounds(400, 0, 900, 700);
                LblWallpaper.setIcon(Wallpaper2);
        }

        public void actionPerformed(ActionEvent e) {
                VentanaNiveles.setVisible(false);
                CargandoNivel CN = new CargandoNivel();
                CN.VentanaCargandoNivel();
                CN.AnimacionCargando("Niveles");
        }

        public void mouseEntered(MouseEvent e) {
                BtnEmpezar.setBackground(Color.decode(Limon));
        }

        public void mouseExited(MouseEvent e) {
                BtnEmpezar.setBackground(Color.decode(Verde));
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseClicked(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

}
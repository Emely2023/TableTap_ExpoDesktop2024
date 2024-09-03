    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Modelo;

    import com.sun.jdi.connect.spi.Connection;
    import java.security.MessageDigest;
    import java.security.NoSuchAlgorithmException;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.UUID;

    /**
     *
     * @author daniel
     */
    public class Usuario {
        private String idUsuario;
        private String Nombre;
        private String Contraseña;
        private String idTipoUsuario;

        public String getIdUsuario(){
        return idUsuario;
        }

        public void setIdUsuario(String idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getNombre(){
        return Nombre;
        }

        public void setNombre (String Nombre) {
            this.Nombre = Nombre;
        }

        public String getContraseña(){
        return Contraseña;
        }

        public void setContraseña(String Contraseña) {
            this.Contraseña = Contraseña;
        }

        public String getidTipoUsuario(){
        return idTipoUsuario;
        }

        public void setidTipoUsuario(String idTipoUsuario) {
            this.idTipoUsuario = idTipoUsuario;
        }


        public String encriptarContraseña(String contraseña) {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] encodedHash = digest.digest(contraseña.getBytes());
                StringBuilder hexString = new StringBuilder();
                for (byte b : encodedHash) {
                    hexString.append(String.format("%02x", b));
                }
                return hexString.toString();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Error al encriptar la contraseña", e);
            }
        }

        public void GuardarUsuario() {
            // Obtener la conexión
            java.sql.Connection conexion = ClaseConexion.getConexion();
            try {


                // Crear el PreparedStatement para la inserción del usuario
                PreparedStatement crearUsuario = conexion.prepareStatement("INSERT INTO Usuario(idUsuario, NombreUsuario, ContrasenaUsuario, idTipoUsuario) VALUES (?, ?, ?, ?)");

                // Generar un UUID para el ID de usuario
                String idUsuario = UUID.randomUUID().toString();

                // Encriptar la contraseña antes de guardarla
                String contraseñaEncriptada = encriptarContraseña(getContraseña());

                // Establecer valores de la consulta SQL
                crearUsuario.setString(1, idUsuario);
                crearUsuario.setString(2, getNombre());
                crearUsuario.setString(3, contraseñaEncriptada);
                crearUsuario.setString(4, "1");

                // Ejecutar la consulta
                crearUsuario.executeUpdate();

            } catch (SQLException ex) {
                System.out.println("Este es el error en el modelo: método guardar " + ex);
            }
        }


         public boolean IniciarSesion() {
            //Obtenemos la conexión a la base de datos
            java.sql.Connection conexion = ClaseConexion.getConexion();
            boolean resultado = false;

            try {
                
                 String contraseñaEncriptada = encriptarContraseña(getContraseña());

                //Preparamos la consulta SQL para verificar el usuario
                String sql = "SELECT * FROM Usuario WHERE NombreUsuario = ? AND ContrasenaUsuario = ?";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, getNombre());
                statement.setString(2, contraseñaEncriptada);

                //Ejecutamos la consulta
                ResultSet resultSet = statement.executeQuery();

                //Si hay un resultado, significa que el usuario existe y la contraseña es correcta
                if (resultSet.next()) {
                    resultado = true;
                }

            } catch (SQLException ex) {
                System.out.println("Error en el modelo: método iniciarSesion " + ex);
            }

            return resultado;
        }










    }

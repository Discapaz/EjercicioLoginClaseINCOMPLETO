/*

 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Joan
 */
public class UsuarioDAO extends Conexion{
    public String login(Usuario usu) throws Exception {
        String estado = "";
        ResultSet rs;
        try {
            this.conectar();
            String sql = "select tipoUsuario from usuario where nombreUsuario=? and clave=?";
            PreparedStatement ps =this.getCon().prepareStatement(sql);
            ps.setString(1, usu.getNombreUsuario());
            ps.setString(2, usu.getClave());
            rs= ps.executeQuery();
            if (rs.next()) {
                estado = "true";
            }
            usu.setTipoUsuario(rs.getString("tipoUsuario"));
            
        } catch (Exception e) {
            throw e;
        }
        return estado;
    }
    
}

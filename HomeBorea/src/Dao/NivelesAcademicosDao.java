package Dao;

import Modelo.Departamentos;
import Modelo.NivelesAcademicos;
import interfaces.NivelesAcademicosInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NivelesAcademicosDao implements NivelesAcademicosInterface {
    ConexionBorea cnb = new ConexionBorea();
    NivelesAcademicos nva = new NivelesAcademicos();
    private String sql;
    private String mensaje;
    PreparedStatement ejecutar;
    ResultSet rs;
    
    @Override
    public NivelesAcademicos buscarNiveles(NivelesAcademicos nivelesAcademicos) {
        try {
            cnb.abrirConexion();
            sql = "select * from  niveles_academicos";
            ejecutar = cnb.getMiConexion().prepareStatement(sql);
            rs = ejecutar.executeQuery();
            if (rs.next()) {
                nva = new NivelesAcademicos();
                nva.setNivel_acad_id(rs.getByte("nivelacademico_id"));
                nva.setNombre(rs.getString("nombre"));
            }
            rs.close();

        } catch (Exception e) {
        } finally {
            cnb.cerrarConexion();
        }
        return nva;
    }

    @Override
    public ArrayList<NivelesAcademicos> listarNiveles() {
        ArrayList<NivelesAcademicos> listar = new ArrayList();
        try {
            cnb.abrirConexion();
            sql = "select * from niveles_academicos";
            ejecutar = cnb.getMiConexion().prepareStatement(sql);
            rs = ejecutar.executeQuery();
            if (rs.next()) {
                nva = new NivelesAcademicos();
                nva.setNivel_acad_id(rs.getByte("nivelacademico_id"));
                nva.setNombre(rs.getString("nombre"));
                listar.add(nva);
            }
            rs.close();
        } catch (Exception e) {
        }finally{
           cnb.cerrarConexion();
        }
        return listar;
    }

    @Override
    public String eliminarNiveles(NivelesAcademicos nivelesAcademicos) {
        try {
            cnb.abrirConexion();
            sql = "delete * from niveles_academicos where nivelacademico_id=? ";
            ejecutar = cnb.getMiConexion().prepareStatement(sql);
            ejecutar.setByte(1, nivelesAcademicos.getNivel_acad_id());
            ejecutar.executeUpdate();
            mensaje = "Los datos se eliminaron";
        } catch (Exception e) {
            mensaje = "Los datos no se eliminaron ";
        }finally{
            cnb.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String agregarNiveles(NivelesAcademicos nivelesAcademicos) {
        try {
            cnb.abrirConexion();
            sql = "insert into niveles_academicos values(?, ? ) ";
            ejecutar = cnb.getMiConexion().prepareStatement(sql);
            ejecutar.setByte(1, nivelesAcademicos.getNivel_acad_id());
            ejecutar.setString(2, nivelesAcademicos.getNombre());
            ejecutar.executeUpdate();
            mensaje = "Los datos fueron almacenados ";
        } catch (Exception e) {
            mensaje = "Los dato no se pueden almacenar";
        }finally{
            cnb.cerrarConexion();
        }
        return mensaje;
    }

    @Override
    public String modificarNiveles(NivelesAcademicos nivelesAcademicos) {
       try {
            cnb.abrirConexion();
            sql = "update niveles_academicos set nombre=? where nivelacademico=?";
            ejecutar = cnb.getMiConexion().prepareStatement(sql);
            ejecutar.setByte(2, nivelesAcademicos.getNivel_acad_id());
            ejecutar.setString(1, nivelesAcademicos.getNombre());
            ejecutar.executeUpdate();
            mensaje = "Los datos fueron almacenados ";
        } catch (Exception e) {
            mensaje = "Los dato no se PUEDE MODIFICAR "+e;
        }finally{
            cnb.cerrarConexion();
        }
        return mensaje;
    }
    
}

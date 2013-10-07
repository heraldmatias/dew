/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.sunat.dao;

import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import edu.upc.sunat.entity.Concept;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
/**
 *
 * @author javier olivares
 */
@Repository
public class ConceptDaoImpl extends JdbcDaoSupport implements DaoInterface<Concept>{

    @Autowired
    public ConceptDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }
    
    @Override
    public List<Concept> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer insertar(Concept object) {
        getJdbcTemplate().update(
                "insert into sunat_concept(name) values(?)",
                object.getName());
        Integer id = getJdbcTemplate().queryForInt("Select last_insert_id()");
        object.setId(id);
        return id;
    }

    @Override
    public List<Concept> listarPor(String[] filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void elimnar(Concept object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Concept object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Concept buscar(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Concept buscar(String pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Concept> listarPor(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

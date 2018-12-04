/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgeProject;

import java.sql.SQLException;

/**
 *
 * @author Joao Santos
 */
public interface BauProduto {
    public Produto getProduto(int tipo, String codBarra);
}

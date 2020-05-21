/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.laptopDepolamaBellekDAO;
import entity.laptopDepolamaBellek;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.resource.spi.SecurityPermission;

/**
 *
 * @author Casper
 */
@Named
@SessionScoped
public class laptopDepolamaBellekController implements Serializable {

    private List<laptopDepolamaBellek> laptopDepolamaBellekList;
    private laptopDepolamaBellekDAO laptopDepolamaBellekdao;
    private laptopDepolamaBellek laptopDepolamaBellek;

    public void temizle() {
        this.laptopDepolamaBellek = new laptopDepolamaBellek();

    }

    public void delete(laptopDepolamaBellek depolama) {
        this.laptopDepolamaBellekdao.delete(depolama);

    }

    public void update() {
        this.laptopDepolamaBellekdao.update(this.laptopDepolamaBellek);

    }

    public void updateForm(laptopDepolamaBellek depolama) {
        this.laptopDepolamaBellek = depolama;

    }

    public void create() {
        this.laptopDepolamaBellekdao.insert(this.laptopDepolamaBellek);
        temizle();
    }

    public List<laptopDepolamaBellek> getlaptopDepolamaBellekList() {
        this.laptopDepolamaBellekList = this.getlaptopDepolamaBellekdao().findAll();
        return laptopDepolamaBellekList;
    }

    public void setlaptopDepolamaBellekList(List<laptopDepolamaBellek> laptopDepolamaBellekList) {
        this.laptopDepolamaBellekList = laptopDepolamaBellekList;
    }

    public laptopDepolamaBellekDAO getlaptopDepolamaBellekdao() {
        if (this.laptopDepolamaBellekdao == null) {
            this.laptopDepolamaBellekdao = new laptopDepolamaBellekDAO();
        }
        return laptopDepolamaBellekdao;
    }

    public void setlaptopDepolamaBellekdao(laptopDepolamaBellekDAO laptopDepolamaBellekdao) {
        this.laptopDepolamaBellekdao = laptopDepolamaBellekdao;
    }

    public laptopDepolamaBellek getlaptopDepolamaBellek() {
        if (this.laptopDepolamaBellek == null) {
            this.laptopDepolamaBellek = new laptopDepolamaBellek();
        }
        return laptopDepolamaBellek;
    }

    public void setlaptopDepolamaBellek(laptopDepolamaBellek laptopDepolamaBellek) {
        this.laptopDepolamaBellek = laptopDepolamaBellek;
    }
}

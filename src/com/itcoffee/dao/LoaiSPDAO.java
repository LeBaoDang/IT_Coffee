/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itcoffee.dao;

import com.itcoffee.entity.LoaiSP;
import com.itcoffee.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HMD
 */
public class LoaiSPDAO extends IT_Coffee_DAO<LoaiSP, String> {

    String INSERT_SQL = "INSERT INTO LoaiSanPham (MaLoai, TenLoai) VALUES (?, ?)";
    String UPDATE_SQL = "UPDATE LoaiSanPham SET TenLoai=? WHERE MaLoai=?";
    String DELETE_SQL = "DELETE FROM LoaiSanPham WHERE MaLoai=?";
    String SELECT_ALL_SQL = "SELECT * FROM LoaiSanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSanPham WHERE MaLoai =?";

    public int insert(LoaiSP entity) {
         int i;
        try {
            i = 1;
        XJdbc.update(INSERT_SQL, entity.getMaLoaiSP(), entity.getTenLoaiSP());
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }

    public int update(LoaiSP entity) {
         int i;
         try {
            i = 1;
        XJdbc.update(UPDATE_SQL, entity.getTenLoaiSP(), entity.getMaLoaiSP());
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }

    public int delete(String id) {
         int i;
        try {
            i = 1;
        XJdbc.update(DELETE_SQL, id);
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }

    public LoaiSP selectById(String id) {
        List<LoaiSP> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<LoaiSP> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    protected List<LoaiSP> selectBySql(String sql, Object... args) {
        List<LoaiSP> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    LoaiSP entity = new LoaiSP();
                    entity.setMaLoaiSP(rs.getString("MaLoai"));
                    entity.setTenLoaiSP(rs.getString("TenLoai"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<LoaiSP> selectByKeyword2(String keyword) {
        String sql = "Select * from LoaiSanPham where MaLoai Like ? ";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

}

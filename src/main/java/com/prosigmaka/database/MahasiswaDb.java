package com.prosigmaka.database;

import com.prosigmaka.model.Mahasiswa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.prosigmaka.database.DbHelper.getConnection;

public class MahasiswaDb {
    public static List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "SELECT * FROM mahasiswa";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sqlQuery);
            while (rs.next()) {
                listMahasiswa.add(new Mahasiswa(
                        rs.getInt("nim"),
                        rs.getString("nama"),
                        rs.getDate("tanggal_lahir"),
                        rs.getString("jurusan"),
                        rs.getInt("tahun_masuk")
                ));
            }

            st.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        return listMahasiswa;
    }
}

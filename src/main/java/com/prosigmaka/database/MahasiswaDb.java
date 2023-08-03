package com.prosigmaka.database;

import com.prosigmaka.model.Mahasiswa;

import java.sql.*;
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

    public static Mahasiswa getMahasiswa(int nim) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "SELECT * FROM mahasiswa WHERE nim=?";
            PreparedStatement st = con.prepareStatement(sqlQuery);
            st.setInt(1, nim);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Mahasiswa(
                        rs.getInt("nim"),
                        rs.getString("nama"),
                        rs.getDate("tanggal_lahir"),
                        rs.getString("jurusan"),
                        rs.getInt("tahun_masuk")
                );
            }

            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public static boolean addMahasiswa(Mahasiswa m) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sqlQuery);
            st.setInt(1, m.getNim());
            st.setString(2, m.getNama());
            st.setDate(3, m.getTanggalLahir());
            st.setString(4, m.getJurusan());
            st.setInt(5, m.getTahunMasuk());

            int rs = st.executeUpdate();
            if (rs == 1) {
                return true;
            }

            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public static boolean editMahasiswa(int nim, Mahasiswa m) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "UPDATE mahasiswa SET nim=?, nama=?, tanggal_lahir=?, jurusan=?, tahun_masuk=? WHERE nim=?";
            PreparedStatement st = con.prepareStatement(sqlQuery);
            st.setInt(1, m.getNim());
            st.setString(2, m.getNama());
            st.setDate(3, m.getTanggalLahir());
            st.setString(4, m.getJurusan());
            st.setInt(5, m.getTahunMasuk());
            st.setInt(6, nim);

            int rs = st.executeUpdate();
            if (rs == 1) {
                return true;
            }

            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public static boolean deleteMahasiswa(int nim) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "DELETE FROM mahasiswa WHERE nim=?";
            PreparedStatement st = con.prepareStatement(sqlQuery);
            st.setInt(1, nim);

            int rs = st.executeUpdate();
            if (rs == 1) {
                return true;
            }

            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
}

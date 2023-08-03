<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Database Mahasiswa</title>
    </head>
    <body>
        <h1>Database Mahasiswa</h1>
        <nav>
            <a href="/mahasiswa">Daftar Mahasiswa</a> |
            <a href="/tambah-mahasiswa">Tambah Data Mahasiswa</a>
        </nav>
        <br><br>
        <form action="/tambah-mahasiswa" method="post">
            <table cellpadding="4px">
                <tr>
                    <td><label for="nim">NIM:</label></td>
                    <td><input type="number" id="nim" name="nim" min="17000000" max="23999999" required></td>
                </tr>
                <tr>
                    <td><label for="nama">Nama:</label></td>
                    <td><input type="text" id="nama" name="nama" required></td>
                </tr>
                <tr>
                    <td><label for="tanggal_lahir">Tanggal Lahir:</label></td>
                    <td><input type="date" id="tanggal_lahir" name="tanggal_lahir" required></td>
                </tr>
                <tr>
                    <td><label for="jurusan">Jurusan:</label></td>
                    <td><input type="text" id="jurusan" name="jurusan" required></td>
                </tr>
                <tr>
                    <td><label for="tahun_masuk">Tahun Masuk:</label></td>
                    <td><input type="number" id="tahun_masuk" name="tahun_masuk" min="2017" max="2023" required></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Database Mahasiswa</title>
    </head>
    <body>
        <h1>Database Mahasiswa</h1>
        <nav>
            <a href="/mahasiswa">Daftar Mahasiswa</a> |
            <a href="/tambah-mahasiswa">Tambah Data Mahasiswa</a>
        </nav>
        <br><br>
        <table border="1px" cellpadding="6px" cellspacing="0">
            <thead>
                <tr>
                    <th>NIM</th>
                    <th>Nama Mahasiswa</th>
                    <th>Tanggal Lahir</th>
                    <th>Program Studi</th>
                    <th>Tahun Masuk</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listMahasiswa}" var="m">
                    <tr>
                        <td>${m.nim}</td>
                        <td>${m.nama}</td>
                        <td>${m.tanggalLahir}</td>
                        <td>${m.jurusan}</td>
                        <td>${m.tahunMasuk}</td>
                        <td>
                            <form action="/edit?nim=${m.nim}" style="display: inline">
                                <input type="submit" value="Edit"/>
                            </form>
                            <form action="/delete?nim=${m.nim}" style="display: inline" method="post">
                                <input type="submit" value="Delete"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

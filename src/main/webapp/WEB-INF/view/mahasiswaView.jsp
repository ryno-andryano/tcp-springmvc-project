<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Database Mahasiswa</title>
    </head>
    <body>
        <h1>Database Mahasiswa</h1>
        <table>
            <thead>
                <tr>
                    <th>NIM</th>
                    <th>Nama Mahasiswa</th>
                    <th>Tanggal Lahir</th>
                    <th>Program Studi</th>
                    <th>Tahun Masuk</th>
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
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

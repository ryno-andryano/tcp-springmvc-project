<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Database Mahasiswa</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
              crossorigin="anonymous">
        <link rel="stylesheet" href=
                "https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-dark border-bottom border-body" data-bs-theme="dark">
            <div class="container">
                <a class="navbar-brand mb-0 h1" href="#">MAHASISWA DB</a>
                <div class="navbar-text">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/mahasiswa">Daftar Mahasiswa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/add-mahasiswa">Tambah Data</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-5">

            <table class="table table-hover table-bordered align-middle text-center">
                <thead class="table-secondary">
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
                                <form action="/edit-mahasiswa" style="display: inline">
                                    <input type="text" name="nim" value="${m.nim}" style="display: none">
                                    <button class="btn btn-outline-secondary btn-sm" type="submit">
                                        <i class="bi bi-pencil-fill" title="Edit"></i>
                                    </button>
                                </form>
                                <form action="/delete?nim=${m.nim}" style="display: inline" method="post">
                                    <button class="btn btn-outline-secondary btn-sm" type="submit">
                                        <i class="bi bi-trash-fill" title="Delete"></i>
                                    </button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>

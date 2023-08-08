<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Database Mahasiswa</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
              crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-dark border-bottom border-body" data-bs-theme="dark">
            <div class="container">
                <a class="navbar-brand mb-0 h1">MAHASISWA DB</a>
                <div class="navbar-text">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="mahasiswa">Daftar Mahasiswa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="add-mahasiswa">Tambah Data</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container mt-4">
            <br>
            <form action="${action}" method="post" class="row g-3">

                <div class="col-md-8">
                    <label for="nama" class="form-label">Nama:</label>
                    <input
                            type="text"
                            id="nama"
                            name="nama"
                            value="${mahasiswa.nama}"
                            class="form-control"
                            required
                    />
                </div>

                <div class="col-md-4">
                    <label for="nim" class="form-label">NIM:</label>
                    <input
                            type="number"
                            id="nim"
                            name="nim"
                            value="${mahasiswa.nim}"
                            min="17000000"
                            max="23999999"
                            class="form-control"
                            required
                    />
                </div>

                <div class="col-md-4">
                    <label for="tanggal_lahir" class="form-label">Tanggal Lahir:</label>
                    <input
                            type="date"
                            id="tanggal_lahir"
                            name="tanggal_lahir"
                            min="1998-01-01"
                            max="2006-12-31"
                            value="${mahasiswa.tanggalLahir}"
                            class="form-control"
                            required
                    />
                </div>

                <div class="col-md-4">
                    <label for="jurusan" class="form-label">Jurusan:</label>
                    <input
                            type="text"
                            id="jurusan"
                            name="jurusan"
                            value="${mahasiswa.jurusan}"
                            class="form-control"
                            required
                    />
                </div>

                <div class="col-md-4">
                    <label for="tahun_masuk" class="form-label">Tahun Masuk:</label>
                    <input
                            type="number"
                            id="tahun_masuk"
                            name="tahun_masuk"
                            min="2017"
                            max="2023"
                            value="${mahasiswa.tahunMasuk}"
                            class="form-control"
                            required
                    />
                </div>

                <div class="col-md-4" style="display: none">
                    <input
                            type="text"
                            id="prev_nim"
                            name="prev_nim"
                            value="${mahasiswa.nim}"
                            class="form-control"
                    />
                </div>

                <div class="d-grid gap-2 mt-5">
                    <button class="btn btn-secondary" type="submit" role="button">Save</button>
                </div>
            </form>
        </div>
    </body>
</html>

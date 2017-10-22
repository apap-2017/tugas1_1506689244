package com.apap.tugas1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KelurahanModel {
    private int id;
    private String kode_kelurahan;
    private String id_kecamatan;
    private String nama_kelurahan;
    private String kode_pos;
}

package com.example.datateman2

class DataTeman {
    var nama: String? = null
    var alamat: String? = null
    var no_hp: String? = null
    var key: String? = null


    constructor() {}

    constructor(nama: String?,  alamat: String?, no_hp:String?) {
        this.nama = nama
        this.alamat = alamat
        this.no_hp = no_hp
    }
}
package Models

class Food {
    var name: String? = null
    var kerakliMahsulotlar: String? = null
    var tayorlanishTartibi: String? = null

    constructor(name: String?, kerakliMahsulotlar: String?, tayorlanishTartibi: String?) {
        this.name = name
        this.kerakliMahsulotlar = kerakliMahsulotlar
        this.tayorlanishTartibi = tayorlanishTartibi
    }
}
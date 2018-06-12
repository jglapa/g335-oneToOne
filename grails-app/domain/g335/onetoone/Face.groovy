package g335.onetoone

class Face {
    static hasOne = [nose: Nose]

    String name

    static constraints = {
        nose unique: true
    }
}

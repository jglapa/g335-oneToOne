package g335.onetoone

import grails.gorm.transactions.Transactional

@Transactional
class BodyService {


    def updateFace() {
        Face foo = Face.findAll(max: 1).first()
        foo.name = foo.name + "change"
        foo.save()
    }

    def createFace() {
        new Face(name: 'f1', nose: new Nose()).save()
    }
}
